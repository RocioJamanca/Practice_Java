package exercise3;

import java.util.Scanner;

public class Option1 {
    Float fahrenheit; //Creamos las variables a utilizar
    Float celsius;

    public Option1(Float celsius) //Creamos el constructor donde asignamos los valores
    {
        this.celsius=celsius;
        this.fahrenheit=celsius*9/5+32;

    }
    public static void main (String [ ] args) {
        String Cdegrees=""; //Usaremos para leer de consola
        System.out.println("Please enter Celsius degrees:");
        Scanner degreesScan=new Scanner(System.in); //Usaremos para leer de consola
        Cdegrees=degreesScan.nextLine(); //Usaremos para leer de consola
        Float Celsius =Float.parseFloat(Cdegrees);//Dado que recibimos String pasamos a Float
        System.out.println("You have write: "+Celsius);
        Option1 O=new Option1(Celsius);//Declaramos el objecto de la clase
        System.out.println(O.celsius+" Celsius degrees in Fahrenheit degrees is "+O.fahrenheit);
    }
}
