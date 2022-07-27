import java.util.ArrayList;

class Book{
    public String name,author;
    public Book(String name,String author){
        this.name=name;
        this.author=author;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Book:"+name+" "+"Author:"+author;
    }
}
class MyLibrary{
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books){
        // for (Book b : books) {
            
        // }
        this.books=books;

    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);

    }
    public void issueBook(Book book,String issued_to){
        System.out.println("The book has been issued to the library to "+issued_to);
        this.books.remove(book);

    }
    public void returnBook(Book b){
        System.out.println("this book has been returned");
        this.books.add(b);

    }
}
public class Lms{
    public static void main(String[] args) {
        ArrayList<Book> bk=new ArrayList<>();
        Book b1=new Book("Algorithms","CLRS");
        bk.add(b1);
        Book b2=new Book("Algorithms2","CLRS2");
        bk.add(b2);
        Book b3=new Book("Algorithms3","CLRS3");
        bk.add(b3);

        // bk.add(new Book("Algorithms","CLRS"));
        // bk.add(new Book("Algorithms2","CLRS2"));
        // bk.add(new Book("Algorithms3","CLRS3"));

        MyLibrary l=new MyLibrary(bk);
        l.addBook(new Book("DBMS","Korth"));
        System.out.println(l.books);
        l.issueBook(b3,"Shivam");
        System.out.println(l.books);
    }
}