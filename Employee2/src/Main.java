import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Employee employee = new Employee();

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the employee's name : ");

        employee.employeeName = scan.nextLine();

        System.out.println("enter the employee's salary : ");

        employee.employeeSalary = scan.nextDouble();

        System.out.println("enter the employee's work hours : ");

        employee.employeeWorkHours = scan.nextInt();

        System.out.println("enter the employee's employee hire year : ");

        employee.employeeHireYear = scan.nextInt();

        employee.toString();






    }
}