package exercise1;


public class HiWorld { //clase que solo contiene un main
    public static void main (String[] args){
        Writer e =new Writer();
        Writer w = new Writer(8); //INICIALIZA LA CLASE
        w.write();
        e.write();
    }
}