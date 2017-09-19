/** Employee.java
   * inherits from Person class  */

public class Employee extends Person{

   private String department;
   private String jobTitle;
   private int hireYear; // a year of hire

   public Employee(String name, String socialSecurityNumber, int age, char gender, String address, String phoneNumber, String department, String jobTitle, int hireYear){

      super(name, socialSecurityNumber, age, gender, address, phoneNumber);

      if (hireYear > 2017)
         throw new IllegalArgumentException("A year of hire must be <= 2017");

      this.department = department;
      this.jobTitle=jobTitle;
      this.hireYear = hireYear;
   }

   public String getDepartment(){

      return department;
   }
   public String getJobTitle(){

      return jobTitle;
   }
   public int getHireYear(){

      return hireYear;
   }

   @Override
   public String toString(){

      return String.format("%s%s%s%n%s%s%n%s%s%n", super.toString(), "Department: ", getDepartment(), "Job title: ", getJobTitle(), "Year of hire: ", getHireYear());
   }
}