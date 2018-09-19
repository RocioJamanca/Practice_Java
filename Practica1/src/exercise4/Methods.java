package exercise4;

public class Methods {

    int n1;
    int n2;

    public Methods(int num1,int num2)
    {
        this.n1=num1;
        this.n2=num2;
    }

    public void functionSum (){
        int r=(int)Math.pow(n1,2)+(2*n1*n2)+(int)Math.pow(n2,2);
        System.out.println("The result of functionSum: "+r);
    }
    public void functionRes (){
        int r=(int)Math.pow(n1,2)-(2*this.n1*this.n2)+(int)Math.pow(this.n2,2);
        System.out.println("The result of functionRes: "+r);
    }
    public static void main (String [ ] args) {

        Methods m=new Methods(3,2);
        m.functionRes();
        m.functionSum();

        System.out.println("Elcuadrado de la suma de primerValor y segundoValor vale " +
                "cuadradoSuma.\n El cuadrado de la diferencia de primerValor " +
                "y segundoValor vale cuadradoResta.Eres unmossstruo");
    }

}
