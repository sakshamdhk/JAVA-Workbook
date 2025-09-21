import java.util.Scanner;

class Vehicle1 {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle1 {
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle1 {
    void display() {
        System.out.println("This is a Bike");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();

        Vehicle1 v;

        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle1();
        }

        v.display();
        System.out.println("Shaksham 24csu189");

    }
}
