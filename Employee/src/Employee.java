public class Employee {
    private String employeeName ;
    private double employeeSalary  ;
    private int employeeWorkHours ;
    private int employeeHireYear ;

    public Employee() {

    }

    public Employee(String employeeName,double employeeSalary,int employeeWorkHours,int employeeHireYear) {
        this.employeeName = employeeName;
        this.employeeSalary= employeeSalary;
        this.employeeWorkHours=employeeWorkHours;
        this.employeeHireYear=employeeHireYear;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeWorkHours() {
        return employeeWorkHours;
    }

    public void setEmployeeWorkHours(int employeeWorkHours) {
        this.employeeWorkHours = employeeWorkHours;
    }

    public int getEmployeeHireYear() {
        return employeeHireYear;
    }

    public void setEmployeeHireYear(int employeeHireYear) {
        this.employeeHireYear = employeeHireYear;
    }

    public static double tax(double employeeSalary) {
        if (employeeSalary < 1000) {
            return 0;
        } else if (employeeSalary > 1000) {
            return employeeSalary * 0.03;
        }

        return 0;
    }

    public static double bonus(int employeeWorkHours) {
        if (employeeWorkHours > 40) {
            return (employeeWorkHours - 40) * 30;
        }

        return 0;
    }

    public double raiseSalary(double employeeSalary, int employeeHireYear) {
        int workingYear = 2021 - employeeHireYear;
        if (workingYear < 10) {
            return employeeSalary * 0.05;
        } else if ((workingYear > 9) && (workingYear < 20)) {
            return employeeSalary * 0.1;
        } else if (workingYear > 19) {
            return employeeSalary * 0.15;
        }
        return 0;
    }

    public String toString() {

        System.out.println("Employee is name : " + employeeName);
        System.out.println("Employee is salary: " + employeeSalary);
        System.out.println("Employee is workhours : " + employeeWorkHours);
        System.out.println("Employee is hireyear : " + employeeHireYear);
        System.out.println("Tax on employee salary : " + tax(employeeSalary));
        System.out.println("Bonus on employee workhours : " + bonus(employeeWorkHours));
        System.out.println("RaiseSalary on employee hireyear : " + raiseSalary(employeeSalary, employeeHireYear));
        System.out.println("Employee is salary calculated with tax and bonus: " + (employeeSalary - tax(employeeSalary) + bonus(employeeWorkHours)));
        System.out.println("Employee is total Salary : " + (employeeSalary - tax(employeeSalary) + bonus(employeeWorkHours)+raiseSalary(employeeSalary,employeeHireYear)));


        return null;
    }

    }


