public class Employee {


    public String employeeName = "Meltem SERT";
    public double employeeSalary =2000.00 ;
    public int employeeWorkHours = 45;
    public int employeeHireYear = 1985;

     double withTaxAndBonus = employeeSalary - tax(employeeSalary) + bonus(employeeWorkHours);

     double totalSalary = withTaxAndBonus+raiseSalary(employeeSalary,employeeHireYear);
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
        System.out.println("Bonus on employee workhuors : " + bonus(employeeWorkHours));
        System.out.println("RaiseSalary on employee hireyear : " + raiseSalary(employeeSalary, employeeHireYear));
        System.out.println("Employee is salary calculated with tax and bonus: " + withTaxAndBonus);
        System.out.println("Employee is total Salary : " + totalSalary);


        return null;
    }

    }


