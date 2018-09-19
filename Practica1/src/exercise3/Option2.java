package exercise3;

public class Option2 {

        Float fahrenheit;
        Float celsius;

    public Option2(Float celsius)
    {
        this.celsius=celsius;
        this.fahrenheit=celsius*9/5+32;

    }
    public static void main (String [ ] args) {
     Option2 o=new Option2(Float.parseFloat("101"));
        System.out.println(o.celsius+" celsius in fahrenheit is "+o.fahrenheit);
    }
}
