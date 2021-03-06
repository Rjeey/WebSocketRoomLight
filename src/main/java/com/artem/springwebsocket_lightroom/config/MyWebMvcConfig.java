package com.artem.springwebsocket_lightroom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName(
                        "forward:/rooms.html");
            }

}