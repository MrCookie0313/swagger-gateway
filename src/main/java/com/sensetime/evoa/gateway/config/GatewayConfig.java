package com.sensetime.evoa.gateway.config;


import com.sensetime.evoa.gateway.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunbing
 * @date 2020/6/9
 */
@Configuration
public class GatewayConfig {
 
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}