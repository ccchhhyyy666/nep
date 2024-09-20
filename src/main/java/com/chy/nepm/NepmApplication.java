package com.chy.nepm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chy.nepm.mapper")  // 有这个就不用给mapper加注解
@SpringBootApplication
public class NepmApplication {

	public static void main(String[] args) {
		SpringApplication.run(NepmApplication.class, args);
	}

}
