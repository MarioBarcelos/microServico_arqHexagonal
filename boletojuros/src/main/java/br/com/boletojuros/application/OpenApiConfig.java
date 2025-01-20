package br.com.boletojuros.application;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("API de Calculo de Juros no Boleto")
                                .description("Serviço dedicado a calcular os Juros sobre Boleto vencido")
                                .contact(new Contact().name("Me").email("me@boletojuros.com"))
                                .version("1.0.0")
                );
    }
}
