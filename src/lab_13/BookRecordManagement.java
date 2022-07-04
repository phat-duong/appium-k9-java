package lab_13;

import java.util.LinkedList;
import java.util.Scanner;

public class BookRecordManagement {
    LinkedList<Record> list;

    public BookRecordManagement()
    {
        list = new LinkedList<>();
    }

    // Method 1: Add Book
    public void add(Record record)
    {
        if (!find(record.getISBN())) {
            list.add(record);
        }
        else {
            System.out.println("Record already exists in the Record list");
        }
    }

    public boolean find(int ISBN)
    {
        for (Record list : list) {
            if (list.getISBN() == ISBN) {
                System.out.println(list);
                return true;
            }
        }
        return false;
    }

    // Method 2: Delete Book
    public void delete(int recordISBN)
    {
        Record recordDel = null;
        for (Record list : list) {
            if (list.getISBN() == recordISBN) {
                recordDel = list;
            }
        }

        if (recordDel == null) {
            System.out.println("Invalid record ISBN");
        }
        else {
            list.remove(recordDel);
            System.out.println("Successfully removed record from the list");
        }
    }

    // Method 4: Find Book
    public Record findRecord(int ISBN)
    {
        for (Record list : list) {
            if (list.getISBN() == ISBN) {
                return list;
            }
        }
        return null;
    }

    // Method 3: Update Book
    public void update(int id, Scanner input)
    {
        if (find(id)) {
            Record record = findRecord(id);
            System.out.print("What is the new Book ISBN ? ");
            int ISBN = input.nextInt();

            System.out.print("What is the new Book Year ");
            int year = input.nextInt();
            input.nextLine();

            System.out.print("What is the new Book Title ? ");
            String title = input.nextLine();

            System.out.print("What is the new Book Author ? ");
            String author = input.nextLine();

            record.setTitle(title);
            record.setISBN(ISBN);
            record.setAuthor(author);
            record.setYear(year);
            System.out.println("Record Updated Successfully");
        }
        else {
            System.out.println("Record Not Found in the Book list");
        }
    }

    // Method 5: Print Book
    public void display()
    {
        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (Record record : list) {
            System.out.println(record.toString());
        }
    }
}
