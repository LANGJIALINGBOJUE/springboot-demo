package com.langjialing.filterinterceptorlistenerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FilterInterceptorListenerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterInterceptorListenerDemoApplication.class, args);
    }

}
