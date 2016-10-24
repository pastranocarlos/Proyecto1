/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogreso1;


/**
 *
 * @author user
 */
public class Nodo {
    
    private Estudiantes persona; 
    private Nodo siguiente; 
    
      public Nodo(Estudiantes persona) {
        this.persona = persona;
        this.siguiente=null;
    }

    public Nodo(Estudiantes persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }

    public Estudiantes getPersona() {
        return persona;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setPersona(Estudiantes persona) {
        this.persona = persona;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
      
      
}

