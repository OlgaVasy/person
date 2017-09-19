/** Student.java
 * inherits from Person class  */

public class Student extends Person{

   private double gpa;  // a grade-point average
   private String major;
   private int gradYear; // a year of graduation

   public Student(String name, String socialSecurityNumber, int age, char gender, String address, String phoneNumber, double gpa, String major, int gradYear){

      super(name, socialSecurityNumber, age, gender, address, phoneNumber);

      if (gpa < 0.0 || gpa > 4.0)
         throw new IllegalArgumentException("A grade-point average must be >= 0.0 and <= 4.0");

      if (gradYear < 2017)
         throw new IllegalArgumentException("A year of graduation must be >= 2017");

      this.gpa = gpa;
      this.major=major;
      this.gradYear = gradYear;
   }

   public double getGpa(){

      return gpa;
   }
   public String getMajor(){

     return major;
   }
   public int getGradYear(){

      return gradYear;
   }

   @Override
   public String toString(){

      return String.format("%s%s%.2f%n%s%s%n%s%s%n", super.toString(), "GPA: ", getGpa(), "Major: ", getMajor(), "Year of graduation: ", getGradYear());
   }
}
