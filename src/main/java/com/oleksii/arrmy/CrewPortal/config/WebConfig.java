package com.oleksii.arrmy.CrewPortal.config;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.oleksii.arrmy.CrewPortal.controller"})
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private Environment environment;
}
