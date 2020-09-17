VERSION := v0.1.0
BUILD := `git rev-parse --short HEAD`
REGISTRY_REPO=registry.sensetime.com/evoa-test
CHART_REGISTRY=http://charts.irdc.sensetime.com

all: image push chart

image:
	docker build -f Dockerfile -t $(REGISTRY_REPO)/evoa-gateway:$(VERSION)-$(BUILD) .

push:
	docker push $(REGISTRY_REPO)/evoa-gateway:$(VERSION)-$(BUILD)

chart:
	helm package --version $(VERSION)-$(BUILD) charts/evoa-gateway
	curl --data-binary "@evoa-gateway-$(VERSION)-$(BUILD).tgz" $(CHART_REGISTRY)/api/evoa/evoa-apps/charts
	rm -rf evoa-gateway-$(VERSION)*
