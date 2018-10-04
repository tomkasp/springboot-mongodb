package com.tomkasp.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Tomasz Kasprzycki
 */
public class ManualSportActivity implements SportActivity{

    @Id
    String id;

    String title;

    public ManualSportActivity(String title) {
        this.title = title;
    }
}
