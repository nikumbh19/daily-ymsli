package bookapplication;

public class Book {
private String bookTitle;
private String author;
private String Isbn;
int numOfCopies;

public Book(String bookTitle, String author, String Isbn, int numOfCopies) {
	this.bookTitle= bookTitle;
	this.Isbn = Isbn;
	this.author = author;
	this.numOfCopies = numOfCopies;
}
public String getBookTitle() {
	return bookTitle;
}
public String getAuthor() {
	return author;
}
public String getIsbn() {
	return Isbn;
}
public int getNumOfCopies() {
	return numOfCopies;
}
public void displayDetails() {
	System.out.println("Title"+bookTitle);
	System.out.println("Isbn"+Isbn);
	System.out.println("Author"+author);
	System.out.println("Available copies"+numOfCopies);
	
}

}
