package com.example.first.spring.boot.example.basics.learn.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {

		//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		int search = binarySearch.search(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
//		System.out.println("The result is: " + search);

		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int search = binarySearch.search(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
		System.out.println("The result is: " + search);
	}

}
