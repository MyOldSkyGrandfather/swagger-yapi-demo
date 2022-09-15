package com.example.springfoxswagger3.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Configure {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("springFoxSwagger3") // 定义组名
                .apiInfo(apiInfo())
                .select()

                // 指定该组扫描哪些包下面的接口
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("XX平台API接口文档")
                //创建人
                .contact(new Contact("今天例外", "https://blog.csdn.net/qq_15022971/article/details/126606500?spm=1001.2014.3001.5501",
                        "xxxxxx@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("系统API描述")
                .build();
    }
}
