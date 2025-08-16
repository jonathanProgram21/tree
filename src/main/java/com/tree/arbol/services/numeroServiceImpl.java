package com.tree.arbol.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tree.arbol.nods.arbol;
import com.tree.arbol.nods.nodo;
import com.tree.arbol.repository.personalRepository;
import com.tree.arbol.models.Person;
import com.tree.arbol.models.Personal;
import com.tree.arbol.models.invoice;

@Service
public class numeroServiceImpl implements Services {
    nodo nod;
    Person person;

    private personalRepository personal = new personalRepository();

    @Override
    public ArrayList<Integer> mostrar() {
        arbol arbol = new arbol();
		arbol.insert(10);
		arbol.insert(5);
		arbol.insert(15);
		arbol.insert(3);
		arbol.insert(15);
		arbol.insert(15);
		arbol.insert(15);
		arbol.insert(15);

        arbol.pre();
        
        return arbol.getDatos();
    }

    @Override
    public List<Person> mostrarPersonas() {
        return Arrays.asList(
        new Person("John", "Jane", "@Gm,ail", "555555"),
        new Person("Jonin", "Jane", "@Gm,ail", "555555"),
        new Person("Jonin", "Jane", "@Gm,ail", "555555"),
        new Person("Jonin", "Jane", "@Gm,ail", "555555"),
        new Person("Jonin", "Jane", "@Gm,ail", "555555")
        );
    }

    @Override
    public List<invoice> mostrarPersonasList() {
        return Arrays.asList( 
            new invoice(  "nombre completo", 21, 21, 21, new String(new Date().toString())),
            new invoice(  "2", 21, 21, 21, new String(new Date().toString())),
            new invoice(  "3", 21, 21, 21, new String(new Date().toString())),
            new invoice(  "4", 21, 21, 21, new String(new Date().toString()))
            );
    }

    @Override
    public Personal mostrarP(int id) {
        return personal.getPersonalById(id);
    }
    
    
}
