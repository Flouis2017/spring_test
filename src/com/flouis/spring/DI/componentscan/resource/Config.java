package com.flouis.spring.DI.componentscan.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.flouis.spring.DI.componentscan.bean"})
public class Config {

}
