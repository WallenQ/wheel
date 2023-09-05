package com.wallen.wheel.jpa.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * 抽象时间对象类
 *
 * @author Wallen
 * @date 2023/9/5 16:27
 */
@Data
public abstract class AbstractBaseTimeEntity {
    /**
     * 创建时间
     */
    @CreatedDate
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @LastModifiedDate
    private LocalDateTime updateTime;
}
