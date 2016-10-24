/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogreso1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author user
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    public Lista() {
        inicio = null;
        fin = null;
    }
// 
    //************INSERTAR AL INICIO******************
    public void insertarInicio(Estudiantes obj) {
        Nodo nuevo = new Nodo(obj, inicio);
        inicio = nuevo;
        if (fin == null) {
            fin = nuevo;
        }
    }
      
    //************INSERTAR AL FIN******************
    public void insertarFin(Estudiantes obj) {
        Nodo nuevo = new Nodo(obj, null);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    public Lista insertarLista(Nodo anterior, Nodo siguiente, Estudiantes obj) {
        Nodo nuevo;
        nuevo = new Nodo(obj);
        nuevo.setSiguiente(siguiente);
        anterior.setSiguiente(nuevo);
        return this;
    }
    //**************************ELIMINAR******************
    public void eliminarInicio() {
        Nodo aux = inicio;
        inicio = aux.getSiguiente();
        aux = null;
    }
    public void eliminarFin() {
        Nodo aux = inicio;
        Nodo ant = null;
        while (aux.getSiguiente() != null) {
            ant = aux;
            aux = aux.getSiguiente();
        }
        ant.setSiguiente(null);
    }
    public void eliminarCualquiera(String entrada) {
        Nodo aux = inicio;
        Nodo ant = null;
        while (aux != null) {
            if (aux.getPersona().getNombre().compareTo(entrada) == 0) {
                if (aux == inicio) {
                    ant = aux;
                    aux = null;
                    inicio = ant.getSiguiente();
                } else {
                    ant.setSiguiente(aux.getSiguiente());
                }
                aux = null;
            } else {
                ant = aux;
                aux = aux.getSiguiente();
            }
        }
    }
    public void imprimir() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getPersona().toString());
            aux = aux.getSiguiente();
        }
    }
    //**************************BUSCAR******************   
    public void buscarMatricula(int matricula) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getPersona().getMatricula() == matricula) {
                System.out.println(aux.getPersona().toString());
            }
            aux = aux.getSiguiente();
        }
    }
    public void buscarCedula(int cedula) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getPersona().getCedula() == cedula) {
                System.out.println(aux.getPersona().toString());
            }
            aux = aux.getSiguiente();
        }
    }
    public void buscarNombre(String nombre) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getPersona().getNombre().compareTo(nombre) == 0) {
                System.out.println(aux.getPersona().toString());
            }
            aux = aux.getSiguiente();
        }
    }
