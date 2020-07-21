package com.kafka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public static final Contact DEFAULT_CONTACT = new Contact("Rohan Dongre", "", "dongrerohan421@gmail.com");
    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("SpringBoot Kafka Producer API Documentation", "Publish messages using Spring Kafka.\n" +
            "\n" +
            "The goal of this project is to assess development skills suitable for a Spring Kafka by testing knowledge and proficiency with software design, unit testing and web technologies like HTTP and REST.",
            "1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(Arrays.asList("application/JSON"));


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kafka"))
                .build()
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
}
