import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Scanner scanner1 = new Scanner(System.in);
         Employee Obj = new Employee();

         Obj.setEmp1();
         Obj.Display();

         scanner1.close();
    }
}

class Employee {
    private int id;
    private String name;
    private float sel;
    public void setEmp1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter iD: ");
        id = scanner.nextInt();
        System.out.println("Enter Name: ");
        name = scanner.next();
        System.out.println("Enter sel: " );
        sel = scanner.nextFloat();

        scanner.close();
    }
    public void Display()
    {
        System.out.println("ID : " +id);
        System.out.println("Name: " + name);
        System.out.println("Sel: " + sel);
    }
}
