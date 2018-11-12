# zoom-web-demo

# 开始



## 环境要求

+ maven 3.x以上
+ jdk 1.6 或以上
+ 打开命令行能直接运行mvn

## 使用idea创建web项目

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

增加版本库的地址

```

<repositories>
    <repository>
        <id>nexus</id>
        <name>Team Nexus Repository</name>
        <url>http://nexus.zoom-dev.org/repository/maven-public/</url>
    </repository>
</repositories>
<pluginRepositories>
    <pluginRepository>
        <id>nexus</id>
        <name>Team Nexus Repository</name>
        <url>http://nexus.zoom-dev.org/repository/maven-public/</url>
    </pluginRepository>
</pluginRepositories>
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


9、增加web.xml的Filter配置

![](images/idea/7.png)

```
<?xml version="1.0" encoding="UTF-8"?>

<web-app>
    <display-name>DEMO</display-name>
    <filter>
        <filter-name>demo</filter-name>
        <filter-class>org.zoomdev.zoom.web.ZoomFilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>demo</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
</web-app>



```

10、创建一个运行配置

![](images/idea/8.png)


![](images/idea/9.png)


选择刚才的App

![](images/idea/10.png)

11、将项目修改为Eclipse编译方式

如果不修改的话也行，但是编写Controller的参数会稍显麻烦。

![](images/idea/11.png)

12、运行项目

![](images/idea/14.png)

![](images/idea/13.png)

13、修改项目配置为自动刷新

![](images/idea/16.png)

如图勾选

![](images/idea/17.png)

看下Registry的Keymap，并使用这个快捷键调出Registry对话框，没有快捷键的话就新建个快捷键。

![](images/idea/18.png)

如图勾选


__重启下idea__，就可以自动编译了

![](images/preview.gif)



## 使用eclipse创建项目



# 打包war

进入项目根目录
```
mvn clean install
```