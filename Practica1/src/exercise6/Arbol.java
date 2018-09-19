package exercise6;

public class Arbol {
    int altura;
    String tipo;

    public Arbol(int alt){
        this.altura=alt;
          System.out.println("Un arbol de "+alt+" metros");
    }
    public Arbol(String t){
        this.tipo=t;
        System.out.println("Un arbol tipo "+t);
    }
    public Arbol(){
        System.out.println("Un arbol genérico");
    }
    public Arbol(int altura,String tipo){
        this.tipo=tipo;
        this.altura=altura;
        System.out.println("Un "+tipo+" de "+altura+" metros");
    }

    public static void main(String args[])
    {
        Arbol arbol1 = new Arbol(4);
        Arbol arbol2 = new Arbol("Roble");
        Arbol arbol3 = new Arbol();
        Arbol arbol4 = new Arbol(5,"Pino");

    }
}

