import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cel ");
        double cel = scanner.nextDouble();

        double fahrenheit = (cel * 9 / 5) + 32;

        System.out.println("Temp in Fahrenheit: " + fahrenheit);
    }
}