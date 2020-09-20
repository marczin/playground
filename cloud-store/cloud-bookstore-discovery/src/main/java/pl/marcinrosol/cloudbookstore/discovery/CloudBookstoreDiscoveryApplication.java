package pl.marcinrosol.cloudbookstore.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudBookstoreDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBookstoreDiscoveryApplication.class, args);
    }

}
