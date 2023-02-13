package com.jasonsalas.dockerjenkinscalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Service;

@SpringBootApplication
public class DockerjenkinsCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerjenkinsCalculatorApplication.class, args);
	}

}

@Service 
public class DockerjenkinsCalculator {
	public int sum(int a, int b) {
		return a + b;
	}
}
