package com.api.drinkmanager.repository;

import com.api.drinkmanager.model.Drink;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DrinkRepository extends MongoRepository<Drink, String> {
}
