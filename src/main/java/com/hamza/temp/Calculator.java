package com.hamza.temp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class Calculator{
	public int sum(int a, int b){
		return a + b;
	}
}

