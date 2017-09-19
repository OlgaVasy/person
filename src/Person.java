/** Page 55 Project 2 : Person.java */

public class Person {

   private final String name;
   private final String socialSecurityNumber;
   private final int age;
   private final char gender;
   private final String address;
   private final String phoneNumber;

   public Person(String name, String socialSecurityNumber, int age, char gender, String address, String phoneNumber){

      if (age < 0)
         throw new IllegalArgumentException("The age must be > 0");

      if (gender != 'm' && gender != 'M' && gender != 'f' && gender !='F')
         throw new IllegalArgumentException("The gender must be m or f");

      this.name = name;
      this.socialSecurityNumber = socialSecurityNumber;
      this.age = age;
      this.gender = gender;
      this.address = address;
      this.phoneNumber = phoneNumber;
   }
   public String getName(){

      return name;
   }
   public String getSocialSecurityNumber(){

      return socialSecurityNumber;
   }
   public int getAge(){

      return age;
   }
   public char getGender(){

      return gender;
   }

   public String getAddress(){

      return address;
   }
   public String getPhoneNumber(){

      return phoneNumber;
   }

   @Override
   public String toString(){

      return String.format("%s%n%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %s%n", getName(), "Social Security Number", getSocialSecurityNumber(), "Age", getAge(), "Gender", getGender(), "Address", getAddress(), "Telephone number", getPhoneNumber());
   }

}