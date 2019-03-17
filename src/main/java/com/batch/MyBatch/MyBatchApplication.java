package com.batch.MyBatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing // 배치기능 활성화
@SpringBootApplication
public class MyBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatchApplication.class, args);
	}

}
