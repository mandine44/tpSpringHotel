package dev;

import dev.controller.DemoCtrl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoCommandLineRunnerApplication {

    public static void main(String[] args) {

        // Spring Boot
        SpringApplication.run(DemoCommandLineRunnerApplication.class, args);

        // Spring
        new AnnotationConfigApplicationContext(DemoCommandLineRunnerApplication.class);

        new ClassPathXmlApplicationContext("application-config.xml");
        new FileSystemXmlApplicationContext("C:/...");

//        new AnnotationConfigApplicationContext()

//        ConfigurableApplicationContext context = SpringApplication.run(DemoCommandLineRunnerApplication.class, args);
//
//        DemoCtrl demoCtrl = context.getBean(DemoCtrl.class);
//
//        demoCtrl.afficher();
    }

}
