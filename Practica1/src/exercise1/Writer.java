package exercise1;

public class Writer { //Creamos la clase, declaramos los atributos de clase
    public int data;


    public Writer(){ //Este constructor de clase asigna valor a los atributos
        this.data = 2;
    }

    public Writer(int data){ //asignar valor por paametro
        this.data=data;
    }

    public void write(){

        System.out.println("Hi world "+this.data);//Printamos
    }
}
