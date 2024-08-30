package com.co.david.davila.Taller.repository;

import com.co.david.davila.Taller.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String> {
}
