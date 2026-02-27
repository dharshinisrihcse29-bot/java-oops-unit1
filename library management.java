class Library {
 int bookId;
 String type;
 String title;
 String author;
 int price;
 int issueDate;
 Library(int bookId, String type, String title, String author, int 
price, int issueDate) {
 this.bookId = bookId;
 this.type = type;
 this.title = title;
 this.author = author;
 this.price = price;
 this.issueDate = issueDate;
 }
 void display() {
 System.out.println("Book ID : " + bookId);
 System.out.println("Type : " + type);
 System.out.println("Title : " + title);
 System.out.println("Author : " + author);
 System.out.println("Price : " + price);
 System.out.println("IssueDate : " + issueDate);
 
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner S = new Scanner(System.in);
 System.out.println("Enter number of books:");
 int n = S.nextInt();
 S.nextLine();
 Library L[] = new Library[n];
 for (int i = 0; i < n; i++) {
 System.out.println("Enter book details " + (i + 1));
 
System.out.println("bookId,type,title,author,price,issuedate");
 String input = S.nextLine();
 String[] arr = input.split(",");
 int bookId = Integer.parseInt(arr[0]);
 String type = arr[1];
 String title = arr[2];
 String author = arr[3];
 int price = Integer.parseInt(arr[4]);
 int issueDate = Integer.parseInt(arr[5]);
 L[i] = new Library(id, type, title, author, price, issueDate);
 }
 }
}