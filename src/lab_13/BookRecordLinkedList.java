package lab_13;

import java.util.Scanner;

public class BookRecordLinkedList {
    public static void menu()
    {
        System.out.println("MENU");
        System.out.println("1. New Book");
        System.out.println("2: Delete Book");
        System.out.println("3: Update Book");
        System.out.println("4: Find Book");
        System.out.println("5: Print Book List");
        System.out.println("0: Exit program");
        System.out.print("Enter your selection: ");
    }

    public static void main(String[] args) {
        BookRecordManagement bookRecordManagement = new BookRecordManagement();
        Record record = new Record();
        Scanner input = new Scanner(System.in);
        int option;
        do {
            menu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("What is the Book ISBN ? ");
                    int ISBN = input.nextInt();

                    System.out.print("What is the Book Year ? ");
                    int year = input.nextInt();
                    input.nextLine();

                    System.out.print("What is the Book Title ? ");
                    String title = input.nextLine();

                    System.out.print("What is the Book Author ? ");
                    String author = input.nextLine();

                    record = new Record(ISBN, title, author, year);
                    bookRecordManagement.add(record);
                    System.out.println(record.toString());
                    break;

                case 2:
                    System.out.print("What is the Book ISBN ? ");
                    int bookISBN = input.nextInt();
                    bookRecordManagement.delete(bookISBN);
                    break;

                case 3:
                    System.out.print("What is the Book ISBN? ");
                    int recordISBN = input.nextInt();
                    bookRecordManagement.update(recordISBN, input);
                    break;

                case 4:
                    System.out.print("What is the Book ISBN ? ");
                    int bookId = input.nextInt();
                    if (!bookRecordManagement.find(bookId)) {
                        System.out.println("Book bookISBN does not exist\n");
                    }
                    break;

                case 5:
                    bookRecordManagement.display();
                    break;

                case 0:
                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }
        while (option != 0);
    }
}
