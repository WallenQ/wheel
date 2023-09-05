package com.wallen.wheel.jpa.entity;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Wallen
 * @date 2023/9/5 18:13
 */
@Data
@Document(collection = "TestEntity")
public class TestEntity extends AbstractBaseTimeEntity{
    @Id
    @Generated
    private String id;
    private String name;
}
