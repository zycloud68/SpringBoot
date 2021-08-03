package com.cs.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@ConfigurationProperties(prefix = "spring.thymeleaf")
public class ThymeleafAutoConfiguration {
    private static  final Charset DeFAULT_ENCODING = StandardCharsets.UTF_8;


}
