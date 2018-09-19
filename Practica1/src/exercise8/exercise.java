package exercise8;

public class exercise {
    public static void main(String args[])
    {
       String saludo="Hola";
       String nombre="Pepe";
       String saluda_pepe="";
       saluda_pepe=saludo+nombre;
       System.out.println(saluda_pepe);

       String saludo2="hola";
       int n=5;
       saludo2=saludo2+""+n;
       System.out.println(saludo2);

       String saludo3="hola";
       String subsaludo="";
       subsaludo=saludo3.substring(0,2);
       System.out.println(subsaludo);

        System.out.println(saludo.substring(0,2));
        System.out.println(saludo+ " " + n);
        System.out.println("saludo == saludo2 " + saludo.equals(saludo2));
    }
}
