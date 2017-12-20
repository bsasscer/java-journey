//A library tool to analyze and print out books a user has finished reading
import java.util.HashMap;

public class Library {

    public Library() {

    }

    public void getFinishedBooks(HashMap<String, Boolean> library){
        if (library.size() < 1) {
            System.out.println("Sad day! The library is empty.");
        } else {
            for (String book : library.keySet()) {
                if (library.get(book) == true) {
                    System.out.println(book);
                }
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
        myBooks.put("The Handmaid's Tale", true);
        myBooks.put("Annihilation", false);
        myBooks.put("Ready Player One", true);
        myBooks.put("Artemis", false);

        Library myLibrary = new Library();
        myLibrary.getFinishedBooks(myBooks);
    }
}
