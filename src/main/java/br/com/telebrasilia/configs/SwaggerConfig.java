package br.com.telebrasilia.configs;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Romerito Alencar
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.telebrasilia"))
                .paths(regex("/api/.*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Telebrasília",
                "Gerenciamento de chamados",
                "1.0.0",
                "Termos de serviço",
                new Contact("Romerito", "www.alencarsites.com.br", "romerito.alencar@gmail.com"),
                "Licença Apache", "https://www.apache.org/licenses/LICENSE-2.0",
                Collections.emptyList());
    }

}

