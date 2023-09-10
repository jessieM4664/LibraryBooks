import java.util.*;

public class Library {

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Integer> hash = new HashMap<String, Integer>();
    static String userInput;
    public static void main (String args[]) {

        while (true) {
            start();
            switch (userInput.toLowerCase()) {
                case "add":
                    addBook();
                    break;
                case "delete":
                    deleteBook();
                    break;
                case "all":
                    System.out.println(hash);
                    break;
            }
        }

    }

    public static void start() {
        System.out.print("Type a command: 'add', 'delete', 'all': ");
        userInput = sc.nextLine();
    }

    public static void addBook() {
        System.out.print("Input book title: ");
        String title = sc.nextLine();
        System.out.print("Input the total pages in book: ");
        int pages = sc.nextInt();
        hash.put(title, pages);
    }

    public static void deleteBook() {
        System.out.print("What book do you want to remove: ");
        String deleteBook = sc.nextLine();
        hash.remove(deleteBook);
    }

}
