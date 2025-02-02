package com.example.errorlog.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // Explicitly define that we want to use the OpenAPI 3.1.0 spec version
                .openapi("3.1.0")
                // Basic metadata
                .info(new Info()
                        .title("Error Log Service API")
                        .version("1.0")
                        .description("API documentation for the Error Log Service")
                        .license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0"))
                );
                // Optionally define servers
                /*.servers(List.of(
                        new Server().url("https://api.example.com").description("Production Server"),
                        new Server().url("https://staging-api.example.com").description("Staging Server")
                ))
                // Optional link to external docs
                .externalDocs(new ExternalDocumentation()
                        .description("Project Wiki")
                        .url("https://example.com/wiki"));*/
    }
}
