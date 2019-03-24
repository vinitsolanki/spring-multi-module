package com.example.demo.api;

import com.example.demo.service.SpringAppStub;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SpringAppStub.class)
public class SpringAppApiConfig {
}
