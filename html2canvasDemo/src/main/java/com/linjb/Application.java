package com.linjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
  public static void main(String[] args)
  {
    SpringApplication.run(Application.class, args);
  }

  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(new Class[] { Application.class });
  }
}