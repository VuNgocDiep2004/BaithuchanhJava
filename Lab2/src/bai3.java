import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentYear = 2023; // replace with actual current year
        int age = currentYear - birthYear;
        if (age < 16) {
            System.out.println("Bạn " + name + " ở độ tuổi vị thành niên.");
        } else if (age >= 16 && age < 18) {
            System.out.println("Bạn " + name + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + name + " đã già.");
        }
    }
}