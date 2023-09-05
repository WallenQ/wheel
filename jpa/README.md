# Spring data jpa

## 1.Spring boot jpa 在数据库设置时间默认值:
- 在entity中添加注解 @EntityListeners(AuditingEntityListener.class)
- 在时间字段增加 @CreatedDate
- 在自动更新时间戳字段增加 @LastModifiedDate
- 在Spring boot启动类增加注解 @EnableJpaAuditing/@EnableMongoAuditing