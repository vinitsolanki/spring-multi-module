package com.example.demo.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({ "com.example.demo.service" })
@Import({SpringAppStub.class})
@EnableAutoConfiguration
public class SpringAppServer {
}
