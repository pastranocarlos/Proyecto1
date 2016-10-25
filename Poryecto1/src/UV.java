package proyecto;

import com.sun.xml.internal.stream.Entity;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UV {
        static Scanner read=new Scanner(System.in);

	public static int leerEntero(String mensaje)
	{
		/*int entero=0;
		try {
			//h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora"));
			entero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entero;*/
            System.out.println(mensaje);
            int a=0;
            try {
                
                a=read.nextInt();
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            return a;
	}
	
	public static float leerFlotante(String mensaje)
	{
		/*float flotante=0;
		try {
			flotante = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flotante;*/
            System.out.println(mensaje);
            float a=0;
            try {
                
                a=read.nextFloat();
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            return a;
	}
	
	public static double leerDoble(String mensaje)
	{/*
		double doble=0;
		try {
			doble = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doble;*/
            System.out.println(mensaje);
            double a=0;
            try {
                
                a=read.nextDouble();
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            return a;
	}
	
	public static String leerCadena(String mensaje)
	{/*
		String cadena=null;
		try {
			cadena = JOptionPane.showInputDialog(mensaje);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadena;*/
            System.out.println(mensaje);
            String a=null;
            try {
                
                a=read.next();
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            return a;
	}
}
