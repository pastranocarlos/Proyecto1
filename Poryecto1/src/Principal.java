/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogreso1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static Lista alumnos = new Lista();

    public static void main(String[] args) throws IOException {
        Scanner lee = new Scanner(System.in);
        Lista lista = new Lista();

        int menu;
        String nombre;
        String apellido;
        String mat;
        String ced;
        String ced1;
        String materia;
        
        int matricula;
        int cedula;
     


        
       // lista.ingresarTodosLosNodos();

        alumnos.imprimir();
        System.out.println("");
        do {
            System.out.println("**************PROYECTO PROGRESO 1**************");
            System.out.println("POR FAVOR SELECCIONE UNA OPCION:");
            System.out.println("1. INGRESAR NUEVO ESTUDIANTE");
            System.out.println("2. INGRESAR NUEVO DOCENTE");
            System.out.println("3. ELIMINAR ESTUDIANTE");
            System.out.println("4. BUSCAR ESTUDIANTE");
            System.out.println("5. SALIR");
            System.out.println("");

            menu = lee.nextInt();

            switch (menu) {

                case 1:
                    Scanner sc = new Scanner(System.in);
                    int menuIngreso;

                    System.out.println("");
                    System.out.println("SELECCIONE EL TIPO DE INGRESO");
                    System.out.println("1.) Ingresar al inicio");
                    System.out.println("2.) Ingresar en medio de 2 objetos");
                    System.out.println("3.) Ingresar al final");
                    System.out.println("4.) SALIR AL MENU PRINCIPAL");
                    System.out.println("");

                    menuIngreso = sc.nextInt();

                    switch (menuIngreso) {

                        case 1:
                            Scanner ingreso = new Scanner(System.in);
                            System.out.println("**INGRESO AL INICIO**");
                            System.out.println("Ingrese el nombre del estudiante:");
                            nombre = ingreso.nextLine();
                            System.out.println("Ingrese el apellido del estudiante:");
                            apellido = ingreso.nextLine();
                            System.out.println("Ingrese la matricula del estudiante:");
                            mat = ingreso.nextLine();
                            matricula = Integer.parseInt(mat);
                            System.out.println("Ingrese la cedula del estudiante:");
                            ced1 = ingreso.nextLine();
                            cedula = Integer.parseInt(ced1);

                            alumnos.insertarInicio(new Estudiantes(nombre, apellido, matricula,cedula));
                            System.out.println("Alumno ingresado exitosamente");
                            System.out.println("\n");
                            
                            alumnos.imprimir();
                            System.out.println("\n");

                            alumnos.reescribirArchivo();
                            alumnos.ingresarTodosLosNodos();
                            break;

                        case 2:
                            Scanner ingreso4 = new Scanner(System.in);
                            System.out.println("**INGRESO AL INICIO**");
                            System.out.println("Ingrese el nombre del docent:");
                            nombre = ingreso4.nextLine();
                            System.out.println("Ingrese el apellido del docente:");
                            apellido = ingreso4.nextLine();
                            System.out.println("Ingrese la materia que imparte el docente:");
                            materia = ingreso4.nextLine();
                            System.out.println("Ingrese la cedula del docente:");
                            ced1 = ingreso4.nextLine();
                            cedula = Integer.parseInt(ced1);

                           // alumnos.insertarInicio(new Docentes(nombre, apellido, materia,cedula));
                            System.out.println("Alumno ingresado exitosamente");
                            System.out.println("\n");
                            
                            alumnos.imprimir();
                            System.out.println("\n");

                            alumnos.reescribirArchivo();
                            alumnos.ingresarTodosLosNodos();
                            
                            break;

                        case 3:
                            Scanner ingreso2 = new Scanner(System.in);
                            System.out.println("**INGRESAR AL FINAL**");
                            System.out.println("Ingrese el nombre del estudiante:");
                            nombre = ingreso2.nextLine();
                            System.out.println("Ingrese el apellido del estudiante:");
                            apellido = ingreso2.nextLine();
                            System.out.println("Ingrese la matricula del estudiante:");
                            mat = ingreso2.nextLine();
                            matricula = Integer.parseInt(mat);
                            System.out.println("Ingrese la matricula del estudiante:");
                            ced = ingreso2.nextLine();
                            cedula = Integer.parseInt(ced);

                            alumnos.insertarFin(new Estudiantes(nombre, apellido, matricula,cedula));
                            System.out.println("Ingresando alumno...");
                            System.out.println("¡Alumno ingresado exitosamente!");
                            System.out.println("\n");
                            alumnos.imprimir();
                            System.out.println("\n");

                            alumnos.reescribirArchivo();
                            alumnos.ingresarTodosLosNodos();
                            break;

                        case 4:
                            break;
                        default:
                            System.out.println("OPCION NO VALIDA");
                            break;
                    }
                    break;

                case 2:
                    
                    Scanner sca = new Scanner(System.in);
                    int menuIngreso1;

                    System.out.println("");
                    System.out.println("SELECCIONE EL TIPO DE INGRESO");
                    System.out.println("1.) Ingresar al inicio");
                    System.out.println("2.) Ingresar en medio de 2 objetos");
                    System.out.println("3.) Ingresar al final");
                    System.out.println("4.) SALIR AL MENU PRINCIPAL");
                    System.out.println("");

                    menuIngreso = sca.nextInt();

                    switch (menuIngreso) {

                        case 1:
                            Scanner ingreso = new Scanner(System.in);
                            System.out.println("**INGRESO AL INICIO**");
                            System.out.println("Ingrese el nombre del estudiante:");
                            nombre = ingreso.nextLine();
                            System.out.println("Ingrese el apellido del estudiante:");
                            apellido = ingreso.nextLine();
                            System.out.println("Ingrese la matricula del estudiante:");
                            mat = ingreso.nextLine();
                            matricula = Integer.parseInt(mat);
                            System.out.println("Ingrese la cedula del estudiante:");
                            ced = ingreso.nextLine();
                            cedula = Integer.parseInt(ced);

                            alumnos.insertarInicio(new Estudiantes(nombre, apellido, matricula,cedula));
                            System.out.println("Alumno ingresado exitosamente");
                            System.out.println("\n");
                            
                            alumnos.imprimir();
                            System.out.println("\n");

                            alumnos.reescribirArchivo();
                            alumnos.ingresarTodosLosNodos();
                    
                
                    
                    break;
                case 3:

                    Scanner eliminar = new Scanner(System.in);
                    int menuEliminar;
                    System.out.println("");
                    System.out.println("SELECCIONE EL TIPO DE ELIMINACION");
                    System.out.println("1.) Eliminar primer estudiante ingresado");
                    System.out.println("2.) Eliminar por nombre del estudiante");
                    System.out.println("3.) Eliminar ultimo estudiante ingresado");
                    System.out.println("4.) SALIR AL MENU PRINCIPAL");

                    menuEliminar = eliminar.nextInt();
                    switch (menuEliminar) {
                        case 1:

                            System.out.println("**ELIMINAR AL INICIO**");
                            alumnos.eliminarInicio();
                            System.out.println("\n");
                            alumnos.imprimir();
                            System.out.println("\n");
                            alumnos.reescribirArchivo();
                            alumnos.ingresarTodosLosNodos();
                            break;

                        case 2:
                            Scanner eliminar1 = new Scanner(System.in);
                            System.out.println("**INGRESE EL NOMBRE DEL ESTUDIANTE AL QUE DESEA ELIMINAR**");
                            String eliminarEst = eliminar1.nextLine();
                            alumnos.eliminarCualquiera(eliminarEst);
                            System.out.println("\n");
                            alumnos.imprimir();
                            System.out.println("\n");

                            alumnos.reescribirArchivo();
                            alumnos.ingresarTodosLosNodos();
                            break;

                        case 3:
                            System.out.println("**ELIMINAR AL FINAL**");
                            alumnos.eliminarFin();
                            System.out.println("\n");
                            alumnos.imprimir();
                            System.out.println("\n");
                            
                            alumnos.reescribirArchivo();
                            alumnos.ingresarTodosLosNodos();
                            break;

                        case 4:
                            break;
                        default:
                            System.out.println("**OPCION NO VALIDA**");
                            break;
                    }
                    break;

                case 4:

                    Scanner buscar = new Scanner(System.in);
                    int menuBuscar;
                    System.out.println("");
                    System.out.println("A SELECCIONADO LA OPCION 3, BUSCAR ESTUDIANTE");
                    System.out.println("SELECCIONE EL TIPO DE BUSQUEDA");
                    System.out.println("1.) Busqueda por nombre");
                    System.out.println("2.) Busqueda por apellido");
                    System.out.println("3.) Busqueda por matricula");
                    System.out.println("4.) Busqueda por cedula");
                    System.out.println("5.) SALIR AL MENU PRINCIPAL");
                    System.out.println("");
                    menuBuscar = buscar.nextInt();

                    switch (menuBuscar) {
                        case 1:
                            Scanner busqueda = new Scanner(System.in);
                            System.out.println("**BUSQUEDA POR NOMBRE**");
                            System.out.println("Ingrese el nombre del estudiante que desea buscar:");
                            nombre = busqueda.nextLine();
                            System.out.println("\n");
                            alumnos.buscarNombre(nombre);
                            System.out.println("\n");
                            break;

                        case 2:
                            Scanner busqueda1 = new Scanner(System.in);
                            System.out.println("**BUSQUEDA POR APELLIDO**");
                            System.out.println("Ingrese el apellido del estudiante que desea buscar:");
                            apellido = busqueda1.nextLine();
                            System.out.println("\n");
                            alumnos.buscarApellido(apellido);
                            System.out.println("\n");
                            break;

                        case 3:
                            Scanner busqueda2 = new Scanner(System.in);
                            System.out.println("**BUSQUEDA POR MATRICULA**");
                            System.out.println("Ingrese la matrícula del estudiante que desea buscar:");
                            mat = busqueda2.nextLine();
                            matricula = Integer.parseInt(mat);
                            System.out.println("\n");
                            alumnos.buscarMatricula(matricula);
                            System.out.println("\n");
                            break;
                            
                        case 4:
                            Scanner busqueda3 = new Scanner(System.in);
                            System.out.println("**BUSQUEDA POR CEDULA**");
                            System.out.println("Ingrese la matrícula del estudiante que desea buscar:");
                            ced = busqueda3.nextLine();
                            cedula = Integer.parseInt(ced);
                            System.out.println("\n");
                            alumnos.buscarCedula(cedula);
                            System.out.println("\n");
                            break;

                        case 5:

                            break;
                        default:
                            System.out.println("OPCION NO VALIDA");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("GRACIAS POR USAR LA APLICACION");
                    
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    System.out.println("");
                    System.out.println("");
                    break;
            }
            }

        } while (menu
                != 5);
        }
        }
