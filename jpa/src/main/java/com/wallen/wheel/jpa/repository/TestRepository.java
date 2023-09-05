package com.wallen.wheel.jpa.repository;

import com.wallen.wheel.jpa.entity.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Wallen
 * @date 2023/9/5 18:15
 */
public interface TestRepository extends MongoRepository<TestEntity,String> {
}
