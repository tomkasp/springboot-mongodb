package com.tomkasp.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Tomasz Kasprzycki
 */
public class StravaSportActivity implements SportActivity{

    @Id
    String id;

    String person;

    public StravaSportActivity(String person) {
        this.person = person;
    }
}
