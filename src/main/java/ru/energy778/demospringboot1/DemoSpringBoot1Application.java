package ru.energy778.demospringboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringBoot1Application {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoSpringBoot1Application.class, args);
        AboutInfoLoader bean = ctx.getBean(AboutInfoLoader.class);
        System.out.println(bean.getVersion());

    }

}
