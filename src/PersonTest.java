// PersonTest.java
// Person class test program.
import java.util.Scanner;

public class PersonTest
{
   public static void main(String[] args)   {

      Person[] newPerson = new Person[21];
      int count=6; // number of people

      newPerson[0] = new SalariedEmployee ("Ivan Green", "555-55-5555", 48, 'm', "2345 Inland ln. Brooklyn park55444", "444-333-2222", "Financial Aid", "Director", 1998, 56000.00);
      newPerson[1] = new SalariedEmployee ("Alise Swift", "444-44-4444", 25, 'f', "4569 Garland str. Maple Grove 52333", "333-000-7777", "Advising center", "Advisor", 2015, 32000.00);
      newPerson[2] = new HourlyEmployee("Nancy Grey", "222-22-2222", 46, 'f', "2453 Dankirk ln. Plymouth 55121", "888-111-4444", "Accounting", "Senior accountant", 2002, 18.00, 180, 25.00);
      newPerson[3] = new HourlyEmployee ("Alex Brain", "666-66-6666", 34, 'm', "9854 Northwest Blvd. Osseo 55854", "999-222-7777", "Bookstore", "Salesman", 2015, 12.00, 140, 12.00);
      newPerson[4] = new Student ("Jessica Marvel", "777-77-7777", 22, 'f', "2563 54th ave. Coon Rapids 55969", "222-888-5555", 3.8, "Computer Science", 2018);
      newPerson[5] = new Student ("Olivia Ryan", "444-33-3333", 31, 'f', "4618 98th ave. Champlin 55111", "888-222-5555", 3.5, "Marketing", 2019);

      for (int i = 0; i < count; i++){
      System.out.println(newPerson[i].getClass());
      System.out.println(newPerson[i].toString());}

      Scanner input=new Scanner(System.in);

      System.out.println("You are able to add up to 15 people to this list.");
      for (int i = 6; i < newPerson.length; i++){
      System.out.println("Please enter 1 to add more people or any another digit to quit: ");
      int answer = input.nextInt();
      input.nextLine();

      // add a person
         if(answer==1) {
         System.out.println("Please enter a person's name: ");
         String newName = input.nextLine();
         System.out.println("Please enter a person's Social Security Number: ");
         String newSocialSecurityNumber = input.nextLine();
         System.out.println("Please enter a person's age: ");
         int newAge = input.nextInt();
         while (newAge < 0) {
            System.out.println("Invalid input. Please enter a valid number: ");
            newAge = input.nextInt();
         }
         System.out.println("Please enter a person's gender (m/f): ");
         char gender = input.next().charAt(0);
         while (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F') {
             System.out.println("Please enter M for male or F for female: ");
             gender = input.next().charAt(0);
            }
         input.nextLine();
         System.out.println("Please enter a person's address: ");
         String newAddress = input.nextLine();
         System.out.println("Please enter a person's telephone number: ");
         String newPhoneNumber = input.nextLine();

         System.out.println("Is this person a student or employee? Please enter S for student or E for employee: ");
         char occupation = input.next().charAt(0);
         while (occupation != 's' && occupation != 'S' && occupation != 'e' && occupation != 'E') {
            System.out.println("Please enter S for student or E for employee: ");
            occupation = input.next().charAt(0);
         }
            input.nextLine();

         // add a student
         if (occupation == 's' || occupation == 'S') {
            System.out.println("Please enter a grade-point average: ");
            double newGpa = input.nextDouble();
            while (newGpa < 0.00 || newGpa > 4.0) {
               System.out.println("Invalid input. Please enter a valid number: ");
               newGpa = input.nextDouble();
            }
            input.nextLine();
            System.out.println("Please enter a major: ");
            String newMajor = input.nextLine();
            System.out.println("Please enter a year of graduation: ");
            int newGradYear = input.nextInt();
            while (newGradYear < 2017) {
               System.out.println("Invalid input. Please enter a valid number: ");
               newGradYear = input.nextInt();
            }
            input.nextLine();
            newPerson[i] = new Student(newName, newSocialSecurityNumber, newAge, gender, newAddress, newPhoneNumber, newGpa, newMajor, newGradYear);
            count++;
         }
         // and an employee
         else if (occupation == 'e' || occupation == 'E') {
            System.out.println("Please enter a department: ");
            String newDepartment = input.nextLine();
            System.out.println("Please enter a job title: ");
            String newJobTitle = input.nextLine();
            System.out.println("Please enter a year of hire: ");
            int newHireYear = input.nextInt();
            while (newHireYear > 2017) {
               System.out.println("Invalid input. Please enter a valid number: ");
               newHireYear = input.nextInt();
            }
            input.nextLine();

            System.out.println("Is this employee hourly or salaried? Please enter H for hourly or S for salaried employee: ");
            char payMeth = input.next().charAt(0);
            while (payMeth != 'h' && payMeth != 'H' && payMeth != 's' && payMeth != 'S') {
               System.out.println("Please enter H for hourly or S for salaried employee: ");
               payMeth = input.next().charAt(0);
            }

            // add a hourly employee
            if (payMeth == 'h' || payMeth == 'H') {
               System.out.println("Please enter hourly rate: ");
               double newHourlyRate = input.nextDouble();
               while (newHourlyRate < 0.00) {
                  System.out.println("Invalid input. Please enter a valid number: ");
                  newHourlyRate = input.nextDouble();
               }
               input.nextLine();
               System.out.println("Please enter hours worked: ");
               int newHoursWorked = input.nextInt();
               while (newHoursWorked < 0) {
                  System.out.println("Invalid input. Please enter a valid number: ");
                  newHoursWorked = input.nextInt();
               }
               input.nextLine();
               System.out.println("Please enter union dues: ");
               double newUnionDues = input.nextDouble();
               while (newUnionDues < 0.0) {
                  System.out.println("Invalid input. Please enter a valid number: ");
                  newUnionDues = input.nextDouble();
               }
               input.nextLine();
               newPerson[i] = new HourlyEmployee(newName, newSocialSecurityNumber, newAge, gender, newAddress, newPhoneNumber, newDepartment, newJobTitle, newHireYear, newHourlyRate, newHoursWorked, newUnionDues);
               count++;

            }

            // add a salaried employee
            else if (payMeth == 's' || payMeth == 'S') {
               System.out.println("Please enter annual salary: ");
               double newAnnualSalary = input.nextDouble();
               while (newAnnualSalary <= 0.0) {
                  System.out.println("Invalid input. Please enter a valid number: ");
                  newAnnualSalary = input.nextDouble();
               }
               input.nextLine();
               newPerson[i] = new SalariedEmployee(newName, newSocialSecurityNumber, newAge, gender, newAddress, newPhoneNumber, newDepartment, newJobTitle, newHireYear, newAnnualSalary);
               count++;
            }
         }
      }
      else break;}

      System.out.println("");
      System.out.println("Final list: \n");
      for (int i = 0; i < count; i++){
         System.out.println(newPerson[i].getClass());
         System.out.println(newPerson[i].toString());}

}}