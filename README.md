# learn-boot-step1-mvc
---

## 简介
这是我的文章[「Spring Cloud与微服务学习笔记-关于Spring Boot」](https://since1986.github.io/blog/37ba2479.html)对应的工程。

## 结构：
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
