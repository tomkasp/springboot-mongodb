package com.tomkasp.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MongodbApplication {

    @Autowired
    SportActivityRepository sportActivityRepository;

    public static void main(String[] args) {
        SpringApplication.run(MongodbApplication.class, args);
    }

    @PostConstruct
    public void run(){
        sportActivityRepository.deleteAll();
        SportActivity sportActivity = new SportActivity("title");
        sportActivityRepository.save(sportActivity);
    }
}
