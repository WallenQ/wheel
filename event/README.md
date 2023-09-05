Spring event
============================


### 1.对比

Spring Event：适合在同一个Spring上下文的同步事件通知

Reactor EventBus：接近于手写线城池的方式，生成一个EventBus，然后绑定主题，就可以发送和消费了；在Reactor 3.0的时候移除了这个组件


### 2.代码功能
config.AsyncConfig:配置异步支持

controller.EventController:测试方法入口

listen.NoticeAnnotation:消息通知监听-注解方式

listen.NoticeListener:消息通知监听-实现监听接口方式

EventApplicationTests:测试方法

### 3.参考
1.[Spring Boot 实现异步事件Event]: https://juejin.cn/post/6844904037133844494

2.[EventBus选型考虑]: https://blog.csdn.net/kang389110772/article/details/94848176

3.[Spring Event的初步讲解]: https://segmentfault.com/a/1190000022348275

