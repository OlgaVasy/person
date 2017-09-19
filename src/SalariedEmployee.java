/** SalariedEmployee.java
 * inherits from Employee class  */

public class SalariedEmployee extends Employee{

   private double annualSalary;

   public SalariedEmployee(String name, String socialSecurityNumber, int age, char gender, String address, String phoneNumber, String department, String jobTitle, int hireYear, double annualSalary){

      super(name, socialSecurityNumber, age, gender, address, phoneNumber, department, jobTitle, hireYear);

      if (annualSalary < 0.0)
         throw new IllegalArgumentException("Annual Salary must be >= 0.0");

      this.annualSalary = annualSalary;
   }

   public double getAnnualSalary(){

      return annualSalary;
   }

   @Override
   public String toString(){

      return String.format("%s%s%.2f%n", super.toString(), "Annual Salary: $", getAnnualSalary());
   }
}

