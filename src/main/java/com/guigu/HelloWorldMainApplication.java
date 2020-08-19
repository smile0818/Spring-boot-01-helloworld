package com.guigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 伦
 * @create 2020-08-2020/8/19 0019-15:44
 */


/**
 *springbootApplication标注在某个类上面说明这个类是SpringBoot的主配置类
 * SpringBoot就运行这个类的main方法来启动SpringBoot应用；
 */
/**
 * @SpringBootApplication 来标注一个主应用程序类，来说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
