package com.fcw.footballclubweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fsw.footballstoreweb.dao")
public class FootballClubWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballClubWebApplication.class, args);
    }



}
