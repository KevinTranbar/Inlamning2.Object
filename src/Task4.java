import java.util.HashMap;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        HashMap<String, String> courses = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        courses.put("1ik161", "Fundamentals of programming");
        courses.put("1ik071", "Grundläggande informatik");
        courses.put("1ik072", "Organisatoriska system");
        courses.put("1ik162", "Object oriented programming");
        courses.put("1ik171", "Databaser och datamodellering");

        System.out.println("Enter a course code: ");
        System.out.println(courses.getOrDefault(scanner.nextLine().toLowerCase(), "Course not found"));
        //If key exists = get value, if key doesn't exist = default value
        scanner.close();
    }
}