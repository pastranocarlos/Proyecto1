/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;


/**
 *
 * @author user
 */
public class Nodo {
    
    private Estudiantes persona; 
    private Docentes docente;
    private Nodo siguiente; 
    
      public Nodo(Estudiantes persona) {
        this.persona = persona;
        this.siguiente=null;
    }
    

    public Nodo(Estudiantes persona, Nodo siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }

    public Nodo(Docentes docente, Nodo siguiente) {
        this.docente = docente;
        this.siguiente = siguiente;
    }

    public Nodo(Docentes docente) {
        this.docente = docente;
        siguiente=null;
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

