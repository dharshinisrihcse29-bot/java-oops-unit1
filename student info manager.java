import java.util.*;
class Student{
String student name;
int age;
int roll.no;
int year;
String email Id;
String phone number
Student(String a, int b , int c ,int d ,String e, String f) {
        this.student name = a;
        this.age = b;
        this.roll.no = c;
        this.year= d;
        this.email= e;
        this.phone number = f;
    }
void display() {
        System.out.println("Student Name: " + student name);
        System.out.println("Age: " +age);
        System.out.println("Roll.no: " + roll.no);
         System.out.println("Year: "+year);
         System.out.println("Email: " +email);
         System.out.println("Phone number: "+phone number);
        
  }
}
public class Solution {
    public static void main(String[] args) {
        Scanner  S = new Scanner (System.in);
        System.out.println("Enter the student details");
        int n = S.nextInt();
        Student S[] = new Student[n];  
        for(int i=0;i<n;i++){
        System.out.println("Enter the details of Sudents "+(i+1));
        String input = S.nextLine();
        String arr[] = input.split(",");
        String a = arr[0];
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);
        String e = arr[4];
        String f = arr[5];
        S[i] = new Student(a,b,c,d,e,f);
        }
        System.out.println("Student Details");
        for (int i = 0; i < n; i++) {
            S[i].display();
        }
    }
}