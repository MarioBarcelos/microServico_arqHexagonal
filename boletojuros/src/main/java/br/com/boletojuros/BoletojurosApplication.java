package br.com.boletojuros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.com.boletojuros.adapter.datasource.integration.client")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
@EnableConfigurationProperties
public class BoletojurosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoletojurosApplication.class, args);
	}
}
