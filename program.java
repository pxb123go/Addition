import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double addition = number + 10;
        System.out.println("Addition (number + 10): " + addition);
    }
}
