package com.tomkasp.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tomasz Kasprzycki
 */
@Repository
public interface SportActivityRepository extends MongoRepository<SportActivity, String> {
}
