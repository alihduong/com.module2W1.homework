import java.util.Scanner;

public class ManageBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = bookList(scanner);
    }

    private static Book[] bookList(Scanner scanner) {
        System.out.print("Nhập vào số lượng sách: ");
        int quantity = scanner.nextInt();
        Book[] books = new Book[quantity];

        int i = 0;
        while (i < books.length) {
            System.out.println("1. Nhập vào sách giáo khoa");
            System.out.println("2. Nhập vào tiểu thuyết");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Nhập vào tên sách: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập vào giá: ");
                    long price = scanner.nextLong();
                    System.out.print("Nhập vào số lượng: ");
                    int quantityBook = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập vào ngày xuất bản: ");
                    String publicDate = scanner.nextLine();
                    System.out.print("Nhập vào thể loại: ");
                    String type = scanner.nextLine();

                    scienceBook scienceBook = new scienceBook(name, price, quantityBook, publicDate, type);
                    Book book = (Book) scienceBook;
                    books[i] = book;
                    i++;

                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Nhập vào tên sách: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Nhập vào giá: ");
                    long price1 = scanner.nextLong();
                    System.out.print("Nhập vào số lượng: ");
                    int quantityBook1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập vào ngày xuất bản: ");
                    String publicDate1 = scanner.nextLine();
                    System.out.print("Nhập vào tên tác giả: ");
                    String author = scanner.nextLine();

                    Novel novel = new Novel(name1, price1, quantityBook1, publicDate1, author);
                    Book book1 = novel;
                    books[i] = book1;
                    i++;

                    break;
            }
        }
        return books;
    }
}