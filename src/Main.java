import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        ArrayList<Person> people = new ArrayList<>();

        System.out.println("Enter details for Employee 1:");
        System.out.print("Name: ");
        String emp1Name = scanner.next();
        System.out.print("Surname: ");
        String emp1Surname = scanner.next();
        System.out.print("Position: ");
        String emp1Position = scanner.next();
        System.out.print("Salary: ");
        double emp1Salary = scanner.nextDouble();
        people.add(new Employee(emp1Name, emp1Surname, emp1Position, emp1Salary));

        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String stu1Name = scanner.next();
        System.out.print("Surname: ");
        String stu1Surname = scanner.next();
        System.out.print("GPA: ");
        double stu1Gpa = scanner.nextDouble();
        people.add(new Student(stu1Name, stu1Surname, stu1Gpa));

        scanner.close();

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            String positionInfo = (person instanceof Employee) ? " " + ((Employee) person).getPosition() : "";
            String gpaInfo = (person instanceof Student) ? " with GPA " + ((Student) person).getGpa() : "";

            System.out.println(person + positionInfo + " earns " + person.getPaymentAmount() + " tenge" + gpaInfo);
        }
    }
}

