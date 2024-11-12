package week1.day2.HomeAssignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib =  new Library();
		System.out.println("Entered book name is "+lib.addBook("The Silent Patient"));
		lib.issueBook();
	}

}
