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
public class Docentes {
    private String nombre;
    private String apellido;
    private String materia;
    private String cedula1;
    public Docentes(String nombre, String apellido, String materia, String cedula1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.cedula1 = cedula1;
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
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getCedula1() {
        return cedula1;
    }
    public void setCedula1(String cedula1) {
        this.cedula1 = cedula1;
    }
    
    @Override
     public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Materia: " + materia + ", Cedula: " + cedula1;
     }
    
    
    
}
