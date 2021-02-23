package com.example.testmybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration  //标记为配置类
@EnableSwagger2  //开启Swagger在线接口文档
public class SwaggerConfig {

    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //.groupName("测试")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.testmybatis.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("eboot-api文档")
                .description("更多信息，请访问https://www.jianshu.com/u/3979cb11f079")
                .termsOfServiceUrl("https://gitee.com/QuanZhanZhiLu/easy-boot")
                .version("10")
                .build();
    }
}