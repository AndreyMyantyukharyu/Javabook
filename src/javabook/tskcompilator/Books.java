package javabook.tskcompilator;

public class Books {
    String title;
    String author;

}

class BookTestDrive{
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
        int x = 0;

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Javas Berries";
        myBooks[1].title = "Java Gatsby";
        myBooks[2].title = "Books of Java recipes";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Cew";
        myBooks[2].author = "Jan";

        while ( x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
