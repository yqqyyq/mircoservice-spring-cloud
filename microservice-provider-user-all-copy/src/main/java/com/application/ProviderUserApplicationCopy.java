package com.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.context.annotation.ComponentScan;

/**
 * @EnableAutoConfiguration:spring boot的注解，一般只用于主类，
 * 是无xml配置启动的关键部分,明确指定了扫描包的路径为其修饰的主类的包（这也就是为什么主类要放在根包路径下的原因）
 *
 * @ComponentScan 进行包的扫描，扫描路径由@EnableAutoConfiguration指定了
 *
 * 主类要位于根包路径下，方便之后的扫描(We generally recommend that you locate your main application class in a root package above other classes.)
 */
//相当于 @Configuration+@EnableAutoConfiguration+@ComponentScan
//启动swagger注解启动该注解使得用在controller中的swagger注解生效，
//覆盖的范围由@ComponentScan的配置来指定，这里默认指定为根路径"com.firstboot"下的所有controller

@EnableDiscoveryClient
@SpringBootApplication/*(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})*/
@MapperScan("com.application.mapper")
/*@EnableAutoConfiguration
@ComponentScan*/
public class ProviderUserApplicationCopy {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplicationCopy.class, args);
    }

}
