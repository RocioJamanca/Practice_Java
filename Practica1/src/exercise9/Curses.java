package exercise9;

import java.util.Scanner;

public class Curses {
    String name;
    int code;
    String quarter;

    public Curses(int code, String name, String quarter){
        this.code=code;
        this.name=name;
        this.quarter=quarter;
    }
    public static void main (String [ ] args) {

        System.out.println("Please, enter curse name:");
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();

        System.out.println("Please, enter code name:");
        Scanner sc2 = new Scanner(System.in);
        int cod=sc2.nextInt();

        System.out.println("Please, enter quarter name:");
        Scanner sc3 = new Scanner(System.in);
        String q=sc3.nextLine();

        Curses c = new Curses(cod,n,q);
        System.out.println("Name: "+c.name+", code: "+c.code+", quarter: "+c.quarter);

 }
}
