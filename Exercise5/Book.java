package Exercise5;
import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private static ArrayList <Book> bookCollection = new ArrayList <Book> ();
	
	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public static void addBook(Book book) {
		bookCollection.add(book);
	}
	public static void removeBook(Book book) {
		bookCollection.remove(book);
	}
	public static ArrayList < Book > getBookCollection() {
	    return bookCollection;
	  }

	public static void main(String[] args) {
		Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
		Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
		bookCollection.add(book1);
		bookCollection.add(book2);
		
		ArrayList < Book > bookCollection = Book.getBookCollection();
	    System.out.println("List of books:");
	    for (Book book: bookCollection) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
	    }
	    bookCollection.remove(book1);
	    System.out.println("\nAfter removing first book: ");
	    for(Book book: bookCollection) {
	    	System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: "  + book.getISBN());
	    }
	}

}
