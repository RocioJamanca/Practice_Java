package exercise2;

//Creamos la clase libro
public class Book {

    public String title;
    public String author;
    public int year;
    public String editorial;

    public Book(String title,String author,int year,String editorial){
        this.title=title;
        this.author=author;
        this.editorial=editorial;
        this.year=year;
    }

    public static void main(String[] args) {

        Book a =new Book("Ten","Alex",123,"Edit");
        Book b =new Book("Amadeus","Bale",123,"Currency");


        System.out.println("Title: "+a.title+", Author: "+a.author+", Year: "+a.year+", Editorial: "+a.editorial);
        System.out.println("Title: "+b.title+", Author: "+b.author+", Year: "+b.year+", Editorial: "+b.editorial);

    }
}
