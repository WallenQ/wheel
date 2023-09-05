package com.wallen.wheel.jpa.controller;

import com.wallen.wheel.jpa.entity.TestEntity;
import com.wallen.wheel.jpa.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wallen
 * @date 2023/9/5 18:04
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @PostMapping("/testSaveToDb")
    public ResponseEntity<TestEntity> testSaveToDb(){
        TestEntity testEntity = new TestEntity();
        testEntity.setName("test");
        TestEntity save = testRepository.save(testEntity);
        return ResponseEntity.ok(save);
    }

    @PostMapping("/testUpdateToDb")
    public ResponseEntity<TestEntity> testUpdateToDb(@RequestBody String id){
        TestEntity testEntity = testRepository.findById(id).orElse(null);
        if (testEntity == null) {
            testEntity = new TestEntity();
        }
        TestEntity save = testRepository.save(testEntity);
        return ResponseEntity.ok(save);
    }
}
