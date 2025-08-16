package com.tree.arbol.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tree.arbol.models.Person;
import com.tree.arbol.models.Personal;
import com.tree.arbol.models.invoice;

import org.springframework.stereotype.Service;

@Service
public interface Services {

    ArrayList<Integer> mostrar();

    List<Person> mostrarPersonas();

    List<invoice> mostrarPersonasList();

    Personal mostrarP(int id);

}
