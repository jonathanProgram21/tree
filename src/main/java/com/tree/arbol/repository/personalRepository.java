package com.tree.arbol.repository;

import java.util.Arrays;
import java.util.List;

import com.tree.arbol.models.Personal;

public class personalRepository {
    
    public List<Personal> personalList;

    public personalRepository(){
        this.personalList = Arrays.asList(
            new Personal(0, "joni", "@", "444444444444444"),
            new Personal(1, "joni2", "@", "444444444444444"),
            new Personal(2, "joni3", "@", "444444444444444")
        );
    }

    public List<Personal> dataPersonal() {
        return personalList;
    }

    public Personal getPersonalById(int id) {
        return personalList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    
}
