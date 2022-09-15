//package com.example.sofabootswagger3.service.impl;
//
//import com.alipay.sofa.runtime.api.annotation.SofaService;
//import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
//import com.example.sofabootswagger3.service.OpenApiService;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.stereotype.Service;
//
//@Service
//@SofaService(bindings = {@SofaServiceBinding(bindingType = "rest")}, interfaceType = OpenApiService.class)
//public class OpenApiServiceImpl implements OpenApiService, InitializingBean {
//    private OpenAPI openAPI;
//
//    @Override
//    public String openApi() {
//        return Json.pretty(openAPI);
//    }
//
//    @Override
//    public void afterPropertiesSet() {
//        List<Package> resources = new ArrayList<>();
//        resources.add(this.getClass().getPackage()); // 扫描当前类所在的 Package，也可以扫描其他的 SOFARPC RESTful 服务接口所在的 Package
//        if (!resources.isEmpty()) {
//            // init context
//            try {
//                SwaggerConfiguration oasConfig = new SwaggerConfiguration()
//                        .resourcePackages(resources.stream().map(Package::getName).collect(Collectors.toSet()));
//
//                OpenApiContext oac = new JaxrsOpenApiContextBuilder()
//                        .openApiConfiguration(oasConfig)
//                        .buildContext(true);
//                openAPI = oac.read();
//            } catch (OpenApiConfigurationException e) {
//                throw new RuntimeException(e.getMessage(), e);
//            }
//        }
//    }
//}
//
