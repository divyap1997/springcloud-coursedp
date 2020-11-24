package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.Retention;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
