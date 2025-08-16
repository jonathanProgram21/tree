package com.tree.arbol.nods;

import java.util.ArrayList;

public class arbol {

    private nodo raiz;

    public arbol(){
        this.raiz = null;
    }

    public void insert(int valor){
        if (this.raiz == null) {
            this.raiz = new nodo(valor);
        }else{
            this.raiz.insert(valor);
        }
    }

    public void pre() {
        this.preorden(this.raiz);
    }

    public void preorden(nodo nodo){
        if (nodo == null) {
            return;
        }else{
            System.out.println(nodo.getValor());
            datos.add(nodo.getValor());
            preorden(nodo.getIzquierdo());
            preorden(nodo.getDerecho());
        }

    }
    
    private ArrayList<Integer> datos = new ArrayList<>();
    public ArrayList<Integer> getDatos() {
        return datos;
    }
}
