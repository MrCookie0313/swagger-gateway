package com.sensetime.evoa.gateway.filter;

import com.alibaba.fastjson.JSON;
import com.sensetime.evoa.gateway.model.JwtHeaderBean;
import com.sensetime.evoa.gateway.model.Permissions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sunbing
 * @date 2020/6/9
 */
@Slf4j
public class TokenFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        String token = exchange.getRequest().getHeaders().getFirst("X-Id-Token");
//        HttpHeaders headers = exchange.getRequest().getHeaders();
//        String headerInfo = JSON.toJSONString(headers);
//        log.info("请求头header信息为{}", headerInfo);
//        ServerHttpResponse response = exchange.getResponse();
//        response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
//        if (token == null || token.isEmpty()) {
//            log.info("token is empty...");
//            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//            return exchange.getResponse().setComplete();
//        }
//
//        //获取请求的路径
//        String path = exchange.getRequest().getURI().getPath();
//        URI uri = exchange.getRequest().getURI();
//        log.info("当前请求的全路径：{}", uri);
//        String resource = getResource(path);
//        log.info("网关拦截的请求路径为:{}", path);
//        String jwtHeader = parseJwtToken(token);
//        JwtHeaderBean jwtHeaderBean = JSON.parseObject(jwtHeader, JwtHeaderBean.class);
//        List<Permissions> list = jwtHeaderBean.getExt().getPermissions();
//        if (CollectionUtils.isEmpty(list)) {
//            log.info("请求访问的资源路径{}没有权限访问", path);
//            exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
//            return exchange.getResponse().setComplete();
//        }
//        List<String> collect = list.stream().map(p -> p.getResource()).collect(Collectors.toList());
//        log.info("该用户可访问的资源的为:{},被访问的资源为:{}", JSON.toJSONString(collect), resource);
//        if (list.isEmpty() && collect.isEmpty()) {
//            log.info("请求访问的资源路径{}没有权限访问", path);
//            exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
//            return exchange.getResponse().setComplete();
//        }
//        Boolean flag = false;
//        AntPathMatcher pathMatcher = new AntPathMatcher();
//        if (!CollectionUtils.isEmpty(collect)) {
//            log.info(JSON.toJSONString(collect));
//            for (String s : collect) {
//                if (pathMatcher.match(s, resource)) {
//                    log.info("进入for循环体");
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        log.info("flag为：{}", flag);
//        if (!flag) {
//            log.info("请求访问的资源路径{}没有权限访问", path);
//            exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
//            return exchange.getResponse().setComplete();
//        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }

    /**
     * 解析jwt中的header信息
     *
     * @param idToken
     * @return json字符串
     */
    public String parseJwtToken(String idToken) {
        String result = "";
        if (idToken == null) {
            return result;
        }
        String jwtToken = idToken.split("\\.")[0];
        byte[] decode = Base64.getDecoder().decode(jwtToken);
        result = new String(decode, StandardCharsets.UTF_8);
        log.info("jwt解析成功");
        return result;
    }

    protected String getResource(String path) {
        String[] split = path.split("/");
        String s1 = split[1];
        String substring = path.substring(s1.length() + 1);
        return substring;
    }

}