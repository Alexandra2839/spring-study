package com.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn")
//@ComponentScan(basePackages = {"com.cydeo.proxy","com.cydeo.service","com.cydeo.repository"})
public class CommentConfig {

}
