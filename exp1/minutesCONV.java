import java.util.Scanner;

public class minutesCONV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();
        int days = minutes / (60 * 24);
        int years = days / 365;
        int months = (days % 365) / 30;
        int daysLeft = (days % 365) % 30;
        System.out.println(years + " years, " + months + " months, " + daysLeft + " days");
        System.out.print("Shaksham 24csu189");
    }
}