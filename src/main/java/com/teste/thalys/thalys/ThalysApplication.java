package com.teste.thalys.thalys;

import java.beans.JavaBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@JavaBean
@SpringBootApplication
public class ThalysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThalysApplication.class, args);
	}

}
