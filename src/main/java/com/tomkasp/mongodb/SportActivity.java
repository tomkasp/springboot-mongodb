package com.tomkasp.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Tomasz Kasprzycki
 */
@Document(collection = "sport_activities")
public class SportActivity {

    @Id
    String id;

    String title;

    public SportActivity(String title) {
        this.title = title;
    }
}
