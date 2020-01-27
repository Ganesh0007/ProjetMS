package Projetms.DeltaAPICommentaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeltaApiCommentaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeltaApiCommentaireApplication.class, args);
	}

}
