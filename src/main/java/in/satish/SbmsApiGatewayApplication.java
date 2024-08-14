package in.satish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbmsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsApiGatewayApplication.class, args);
	}

}
