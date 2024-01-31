import java.util.Scanner;
public class INPUT_FROM_USER {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.println("Enter your height in meters:");
        double height = sc.nextDouble();
        System.out.println("You are " + height + " meters tall.");
        sc.close();
    }
}
