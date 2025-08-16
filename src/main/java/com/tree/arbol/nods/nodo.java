package com.tree.arbol.nods;

public class nodo {
    
    private int valor;
    private nodo izquierdo;
    private nodo derecho;

    public nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getValor() {
        return valor;
    }

    public nodo getIzquierdo() {
        return izquierdo;
    }

    public nodo getDerecho() {
        return derecho;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void insert(int _valor){
        if (_valor < this.valor) {
            if (this.izquierdo == null) {
                this.izquierdo = new nodo(_valor);
            }else{
                this.izquierdo.insert(_valor);
            }
        }else{
            if (this.derecho == null) {
                this.derecho = new nodo(_valor);
            }else{
                this.derecho.insert(_valor);
            }
        }
    }    
}
