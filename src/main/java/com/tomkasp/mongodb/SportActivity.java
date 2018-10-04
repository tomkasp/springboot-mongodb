package com.tomkasp.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Tomasz Kasprzycki
 */
@Document(collection = "sport_activities")
public interface SportActivity {
}
