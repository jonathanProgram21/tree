package com.tree.arbol.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tree.arbol.models.Person;
import com.tree.arbol.models.Personal;
import com.tree.arbol.models.invoice;
import com.tree.arbol.services.Services;
import com.tree.arbol.services.numeroServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class appControler {

    @Autowired
    Services services;

    @GetMapping("/dos")
    public ArrayList<Integer> num (){   
        return services.mostrar();
    }

    @GetMapping("/personas")
    public List<Person> mostrarPersonasList() {
        return services.mostrarPersonas();
    }

    @GetMapping("/invoice")
    public List<invoice> getMethodName() {
        return services.mostrarPersonasList();
    }
    
    @GetMapping("/number/{id}")
    public Personal getInvoiceById(@PathVariable("id") int id) {
        return services.mostrarP(id); 
    }
    
}
