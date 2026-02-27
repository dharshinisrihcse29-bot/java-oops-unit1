class Bank {
 int accountnumber;
 String holder;
 String branch;
 int balance;
 String mobilenumber;
 Bank(int a, String b, String c, int d, String e) {
 this.accountnumber = a;
 this.holder = b;
 this.branch = c;
 this.balance = d;
 this.mobilenumber = e;
 }
 void display() {
 System.out.println("Account Number: " + accountnumber);
 System.out.println("Holder: " + holder);
 System.out.println("Branch: " + branch);
 System.out.println("Balance: " + balance);
 System.out.println("Mobile Number: " + mobilenumber);
 System.out.println("----------------------");
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of Bank accounts:");
 int n = sc.nextInt();
 sc.nextLine();
 Bank B[] = new Bank[n];
 for (int i = 0; i < n; i++) {
 System.out.println("Enter the details of bank account " + (i + 
1));
System.out.println("accountnumber,holder,branch,balance,mobi
lenumber");
 String input = sc.nextLine();
 String arr[] = input.split(",");
 int a = Integer.parseInt(arr[0]);
 String b = arr[1];
 String c = arr[2];
 int d = Integer.parseInt(arr[3]); 
 String e = arr[4]; 
 B[i] = new Bank(a, b, c, d, e);
 }
 System.out.println("Bank Details");
 for (int i = 0; i < n; i++) {
 B[i].display();
 }
 }
}