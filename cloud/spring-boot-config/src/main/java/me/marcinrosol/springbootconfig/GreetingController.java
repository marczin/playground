package me.marcinrosol.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RefreshScope
public class GreetingController {

    @Value("${my.greeting: default value}")
    private String hello;

    @Value("${my.list.values}")
    private List<String> listValues;

    @Autowired
    private DbSettings dbSettings;

    @Autowired
    private Environment env;

    //@Value("#{${dbValues}}")
    //private Map<String, String> dbValues;


    public GreetingController() {
    }

    @GetMapping("/greeting")
    public String greeting() {

        return hello + " : db = "+dbSettings.getConnection() + dbSettings.getHost() + dbSettings.getPort();
    }

    @GetMapping("/envdetails")
    public String envDetails(){
        return env.getActiveProfiles().toString()+" : "+env.getDefaultProfiles().toString();
    }
}
