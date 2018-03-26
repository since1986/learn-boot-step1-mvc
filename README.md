# learn-boot-step1-mvc
---

这是我的文章[「Spring Cloud与微服务学习笔记-关于Spring Boot」](https://since1986.github.io/blog/2018/03/26/Spring-Cloud%E4%B8%8E%E5%BE%AE%E6%9C%8D%E5%8A%A1%E5%AD%A6%E4%B9%A0%E7%AC%94%E8%AE%B0-%E5%85%B3%E4%BA%8ESpring-Boot/)对应的工程代码。

代码结构：
```
.
├── java
│   └── com
│       └── github
│           └── since1986
│               └── learn
│                   └── boot
│                       └── step1
│                           ├── AppConfig.java 根配置
│                           ├── AppConstants.java 全局常量
│                           ├── AppInitializer.java Mvc初始化器
│                           ├── MyBatisConfig.java MyBatis根配置
│                           ├── controller 控制器包
│                           │   ├── AppExceptionHandler.java Mvc全局异常处理
│                           │   ├── ServletConfig.java Mvc配置
│                           │   └── TestController.java
│                           ├── mapper Mapper接口包
│                           │   ├── MapperConfig.java Mapper配置
│                           │   └── TestMapper.java Mapper接口
│                           ├── model Model类包
│                           │   └── TestModel.java
│                           └── service Service包
│                               ├── ServiceConfig.java Service配置
│                               ├── TestService.java
│                               └── TestServiceImpl.java
└── resources
    ├── com
    │   └── github
    │       └── since1986
    │           └── learn
    │               └── boot
    │                   └── step1
    │                       └── mapper
    │                           └── TestMapper.xml Mapper接口对应的配置文件
    └── import.sql #数据库初始化脚本
```
