package com.tree.arbol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tree.arbol.nods.arbol;

@SpringBootApplication
public class ArbolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArbolApplication.class, args);
		System.out.println("Primer arbol en Java con Spring Boot");

		arbol arbol = new arbol();
		arbol.insert(10);
		arbol.insert(5);
		arbol.insert(15);
		arbol.insert(3);

		System.out.println("Recorrido en preorden del árbol:");
		arbol.pre();
		

	}

}
