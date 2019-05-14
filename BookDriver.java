import java.util.Scanner;

public class BookDriver{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Book Author: ");
        String author = input.nextLine();

        System.out.println("Enter Book Title: ");
        String title = input.nextLine();

        System.out.println("Enter Book Genre: ");
        String genre = input.nextLine();

        System.out.println("Enter Book number of pages: ");
        int bookPages = input.nextInt();

    Books details = new Books();
        details.setAuthor(author);
        details.setTitle(title);
        details.setGenre(genre);
        details.setNumOfPages(bookPages);
        details.setIsHardCover();

    //System.out.println("Your book detais are " + details.getAuthor() + details.getTitle() + details.getGenre());
    System.out.println("Author\t " + "Title\t\n" + details.getAuthor() + "\t" + details.getTitle() );


    }
}