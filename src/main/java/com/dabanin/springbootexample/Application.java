package com.dabanin.springbootexample;

import com.dabanin.springbootexample.configuration.ModelMapperConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by D.Abanin on 06.04.2017.
 */

@SpringBootApplication
@Import(ModelMapperConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
