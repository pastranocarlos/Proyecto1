/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
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
    public void insertarInicio(Object obj) {
        Nodo nuevo;
        if(new Docentes().getClass()==obj.getClass()){
            nuevo = new Nodo((Docentes) obj, inicio);
        }else{
            nuevo=new Nodo((Estudiantes) obj, inicio);
        }
        inicio = nuevo;
        if (fin == null) {
            fin = nuevo;
        }
    }
      
    //************INSERTAR AL FIN******************
    public void insertarFin(Object obj) {
        Nodo nuevo;
        if(new Docentes().getClass()==obj.getClass()){
            nuevo = new Nodo((Docentes) obj, inicio);
        }else{
            nuevo=new Nodo((Estudiantes) obj, inicio);
        }
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    public Lista insertarLista(Nodo anterior, Nodo siguiente, Object obj) {
        Nodo nuevo;
        if(new Docentes().getClass()==obj.getClass()){
            nuevo = new Nodo((Docentes) obj, inicio);
        }else{
            nuevo=new Nodo((Estudiantes) obj, inicio);
        }
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
public void buscarApellido(String apellido) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getPersona().getApellido().compareTo(apellido) == 0) {
                System.out.println(aux.getPersona().toString());
            }
            aux = aux.getSiguiente();
        }
    }
    public void buscarDatos(int num1, int num2, Estudiantes obj) {
        Nodo aux = inicio;
        Nodo siguiente;
        if (inicio == fin) {
            System.out.println("No puedo buscar solo existe un nodo");
        } else {
            while (aux != null) {
                if (aux.getPersona().getMatricula() == num1) {
                    siguiente = aux.getSiguiente();
                    if (siguiente != null) {
                        if (siguiente.getPersona().getMatricula() == num2) {
                            insertarLista(aux, siguiente, obj);
                            return;
                        } else {
                            System.out.println("Matricula 2 no existe como dato predecesor");
                        }
                    } else {
                        System.out.println("No se puede comprobar matricula 2");
                    }
                }
                aux = aux.getSiguiente();
            }
        }
    }
    public void reescribirArchivo() {
        BufferedWriter bw;
        PrintWriter wr;
        try {
            File archivo = new File("Estudiante.txt");
            FileWriter escribir = new FileWriter(archivo, false);
            bw = new BufferedWriter(escribir);
            wr = new PrintWriter(bw);
            // wr.println();
            wr.println();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
    public void ingresarDatos(String estudiante) {
        BufferedWriter bw;
        PrintWriter wr;
        try {
            File archivo = new File("Estudiante.txt");
            FileWriter escribir = new FileWriter(archivo, true);
           
            bw = new BufferedWriter(escribir);
            wr = new PrintWriter(bw);
            //System.out.println("Nombre\tApellido\tMatricula\tCedula");
            // wr.println();
            wr.println(estudiante);
            bw.close();
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
    public String[] leerDatos() throws FileNotFoundException, IOException {
        String[] filas = new String[400];
        int contador = 0;
        String linea;
        File archivo = new File("Estudiante.txt"); //el lugar donde esta el archivo
        FileReader fr = new FileReader(archivo); //el objeto que va a ser leido
        BufferedReader br = new BufferedReader(fr); //lee el texto
        
        while ((linea = br.readLine()) != null) {//mientras haya lineas para leer            
            //System.out.println(linea);
            filas[contador] = linea;
            //System.out.println(contador);
            contador++;
        }
        return filas;
    }
       public void ingresarTodosLosNodos() {
        Nodo aux = inicio;
        String nombre;
        String apellido;
        int matricula;
        int cedula;
        while (aux != null) {
            nombre = aux.getPersona().getNombre();
            apellido = aux.getPersona().getApellido();
            matricula = aux.getPersona().getMatricula();
            cedula = aux.getPersona().getCedula();
            
           ingresarDatos(nombre+" "+apellido+" "+matricula+" "+cedula);
                        
            aux = aux.getSiguiente();
        }
    }
    
}
