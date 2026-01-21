package com.AthletiQ.activityService;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Database_test {

    @Value("${spring.data.mongodb.database}")
    private String dbName;

    @PostConstruct
    public void test() {
        System.out.println("✅ Connected to MongoDB database: " + dbName);
    }
}

