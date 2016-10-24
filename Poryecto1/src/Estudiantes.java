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
public class Estudiantes {
    
    private String nombre;
    private String apellido;
    private int matricula;
    private int cedula;
     public Estudiantes()
    {
        
    }
     
    public Estudiantes(String nombre, String apellido, int matricula,int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.cedula = cedula;
       
    }
    
   
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.matricula = matricula;        
    }
    @Override
     public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Matricula: " + matricula + ", Cedula: " + cedula;
     }
}
