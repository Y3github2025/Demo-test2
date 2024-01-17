import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    Scanner scanner = new Scanner(System.in);
     class Employee {
         int id;
         String name;
         float sel;
         public Employee(Scanner scanner1) {
             scanner = scanner1;
         }
         public void setEmp1() {
             System.out.println("Enter iD: ");
             id = scanner.nextInt();
             System.out.println("Enter Name: ");
             name = scanner.nextLine();
             System.out.println("Enter sel: " );
             sel = scanner.nextFloat();
         }
         public void Display()
         {
             System.out.println("ID : " +id);
             System.out.println("Name: " + name);
             System.out.println("Sel: " + sel);
         }
     }
    public static void main(String[] args) {
         Scanner scanner1 = new Scanner(System.in);
            Main Obj = new Main();
        }
    }