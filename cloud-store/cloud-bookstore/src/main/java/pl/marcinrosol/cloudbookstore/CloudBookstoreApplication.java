package pl.marcinrosol.cloudbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudBookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBookstoreApplication.class, args);
    }

}
