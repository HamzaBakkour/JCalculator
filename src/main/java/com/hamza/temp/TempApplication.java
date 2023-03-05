package com.hamza.temp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
// import main.java.com.hamza.temp;


@SpringBootApplication
@ComponentScan()
public class TempApplication {
	public static void main(String[] args) {
		SpringApplication.run(TempApplication.class, args);
	}
}
