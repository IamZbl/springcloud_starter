package com.bigdog.springcloud_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 创建服务注册中心
 * @author Administrator
 *
 */
@SpringBootApplication
//启动一个服务注册中心提供给其他应用进行对话
@EnableEurekaServer
public class SpringcloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaApplication.class, args);
	}
}
