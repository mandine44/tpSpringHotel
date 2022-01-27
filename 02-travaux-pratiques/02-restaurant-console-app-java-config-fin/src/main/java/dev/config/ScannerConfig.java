package dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration // indique que la classe porte une configuration Spring
public class ScannerConfig {

    @Bean
    public Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}
