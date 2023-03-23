## 项目说明
微服务Maven原型项目，直接生成定制化结构的微服务

## 使用教程
#### 1.idea添加原型

![image](https://user-images.githubusercontent.com/31311041/227098571-d3b9e85e-d2d6-4811-9057-c7bf0d9db46a.png)

```
groupId：zzq.microservices
artifactId：zzq-microservice-quickstart
version：1.0.0
Repository：https://github.com/philzq/zzq-microservice-quickstart-OMG
```



#### 2.使用
步骤一：
![image](https://user-images.githubusercontent.com/31311041/227098894-8dd02afa-efcf-4547-b691-1bd51c554cb9.png)

步骤二：
![image](https://user-images.githubusercontent.com/31311041/227098898-1671f867-7cef-4386-8d0a-4a1dad91fea6.png)

步骤三：
![image](https://user-images.githubusercontent.com/31311041/227099177-47afd076-c48c-43a4-98ee-f5d0b14219ae.png)


#### 3.生成的效果

效果图：
![image](https://user-images.githubusercontent.com/31311041/227099238-e36ecfc3-9f00-4f17-8684-3578f2edcfb1.png)


树状结构：
```
├─zzzzqqqq-application
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─zq
│      │  │      └─zzzzqqqq
│      │  │          └─application
│      │  │              ├─config
│      │  │              ├─controller
│      │  │              └─jobhandler
│      │  └─resources
│      └─test
│          ├─java
│          │  └─zq
│          └─resources
├─zzzzqqqq-common
│  └─src
│      └─main
│          └─java
│              └─zq
│                  └─zzzzqqqq
│                      └─common
│                          └─config
├─zzzzqqqq-entity
│  └─src
│      └─main
│          └─java
│              └─zq
│                  └─zzzzqqqq
│                      └─entity
│                          ├─constant
│                          ├─request
│                          └─response
│                              ├─dto
│                              └─vo
├─zzzzqqqq-repository
│  ├─zzzzqqqq-repository-elasticsearch
│  │  └─src
│  │      └─main
│  │          └─java
│  │              └─zq
│  │                  └─zzzzqqqq
│  │                      └─repository
│  │                          └─elasticsearch
│  │                              └─domain
│  ├─zzzzqqqq-repository-mongodb
│  │  └─src
│  │      └─main
│  │          └─java
│  │              └─zq
│  │                  └─zzzzqqqq
│  │                      └─repository
│  │                          └─mongodb
│  │                              └─domain
│  ├─zzzzqqqq-repository-mysql
│  │  └─src
│  │      └─main
│  │          ├─java
│  │          │  └─zq
│  │          │      └─zzzzqqqq
│  │          │          └─repository
│  │          │              └─mysql
│  │          │                  ├─config
│  │          │                  ├─domain
│  │          │                  └─mybatis
│  │          │                      └─mapper
│  │          └─resources
│  │              └─mybatis
│  │                  └─mapper
│  └─zzzzqqqq-repository-redis
│      └─src
│          └─main
│              └─java
│                  └─zq
│                      └─zzzzqqqq
│                          └─repository
│                              └─redis
│                                  └─utils
└─zzzzqqqq-service
    └─src
        └─main
            └─java
                └─zq
                    └─zzzzqqqq
                        ├─facade
                        └─service
                            └─impl
```

