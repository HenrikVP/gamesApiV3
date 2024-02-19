package org.example.gamesapiv3;

import org.example.gamesapiv3.model.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamesApiV3Application {

    public static void main(String[] args) {
        new Data();
        SpringApplication.run(GamesApiV3Application.class, args);
    }

}
