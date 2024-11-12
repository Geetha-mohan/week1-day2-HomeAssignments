package week1.day2.HomeAssignments;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib =  new Library();
		System.out.println("Entered book name is "+lib.addBook("Money Mastery"));
		lib.issueBook();

	}
	
	public String addBook(String bookTitle) {
		System.out.println( "Book added successfully");
		return bookTitle;
	}
	
	protected void issueBook() {
		System.out.println( "Book issued successfully");
	}
	

}
