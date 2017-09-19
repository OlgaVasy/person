/** HourlyEmployee.java
 * inherits from Employee class  */

public class HourlyEmployee extends Employee{

   private double hourlyRate;
   private int hoursWorked;
   private double unionDues;

   public HourlyEmployee(String name, String socialSecurityNumber, int age, char gender, String address, String phoneNumber, String department, String jobTitle, int hireYear, double hourlyRate, int hoursWorked, double unionDues){

      super(name, socialSecurityNumber, age, gender, address, phoneNumber, department, jobTitle, hireYear);

      if (hourlyRate < 0.0)
         throw new IllegalArgumentException("Hourly rate must be >= 0.0");

      if (hoursWorked < 0)
         throw new IllegalArgumentException("Houres worked must be >= 0");

      if (unionDues < 0.0)
         throw new IllegalArgumentException("Union dues must be >= 0.0");

      this.hourlyRate = hourlyRate;
      this.hoursWorked=hoursWorked;
      this.unionDues = unionDues;
   }

   public double getHourlyRate(){

      return hourlyRate;
   }
   public int getHoursWorked(){

      return hoursWorked;
   }
   public double getUnionDues(){

      return unionDues;
   }

   @Override
   public String toString(){

      return String.format("%s%s%.2f%n%s%s%n%s%.2f%n", super.toString(), "Hourly rate: $", getHourlyRate(), "Hours worked: ", getHoursWorked(), "Union dues: $", getUnionDues());
   }
}