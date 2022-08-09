package com.tutorial.webapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties(prefix = "com.tutorial.webapp")
@Data
public class CustomProperties {

    private String apiUrl;

}