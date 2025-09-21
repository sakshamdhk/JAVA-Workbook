import java.util.Scanner;

class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number;

        int reverse = digit1 * 100 + digit2 * 10 + digit3;

        int sum = digit1 + digit2 + digit3;

        System.out.println("Reverse of " + originalNumber + " is: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Shaksham 24csu189");
        scanner.close();
}
}