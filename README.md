# zoom-web-demo


# 使用idea创建web项目

1、新建一个idea项目

![](images/idea/1.png)

2、选择项目类型maven->webapp

![](images/idea/0.png)

3、输入GroupId和Artifactid

![](images/idea/2.png)

4、这个界面默认

![](images/idea/4.png)

5、选择目录

![](images/idea/3.png)

6、编辑pom.xml新增依赖

![](images/idea/15.png)

```
<dependency>
    <groupId>org.zoomdev.zoom</groupId>
    <artifactId>zoom-parent</artifactId>
    <type>pom</type>
    <version>0.2.0</version>
</dependency>
<dependency>
    <groupId>org.zoomdev.plugins</groupId>
    <artifactId>zoom-server</artifactId>
    <version>0.2.0</version>
</dependency>
```

7、创建完毕之后在src/main创建一个java的文件夹

![](images/idea/5.png)

8、编写app代码

![](images/idea/6.png)

```
package com.example.demo;

import org.zoomdev.zoom.server.ZoomWebApplication;

public class App {

    public static void main(String[] args) throws Exception {
        ZoomWebApplication.start(8091);
    }
}

```


9、增加web.xml的Filter配置

![](images/idea/7.png)

```
<?xml version="1.0" encoding="UTF-8"?>

<web-app>
  <display-name>DEMO</display-name>
  <filter>
    <filter-name>demo</filter-name>
    <filter-class>org.zoomdev.zoom.web.ZoomFilter</filter-class>
  </filter>
</web-app>


```

10、创建一个运行配置

![](images/idea/8.png)


![](images/idea/9.png)


选择刚才的App

![](images/idea/10.png)

11、将项目修改为Eclipse编译方式

如果不修改的话也行，但是编写Controller的参数会稍显麻烦。

![](images/idea/11.png)

12、运行项目

![](images/idea/14.png)

![](images/idea/13.png)