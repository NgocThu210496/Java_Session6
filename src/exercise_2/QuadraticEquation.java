package exercise_2;

import java.util.Scanner;

public class QuadraticEquation {
    // khai báo các thuộc tính (properties)
    private double a, b, c;

    //phương thức khởi tạo (contructors).
    //1.constructor 0 tham so
    public QuadraticEquation() {
    }

    //2.constructor 1 tham so a
    public QuadraticEquation(double a) {
        this.a = a;
    }

    //3.constructor có all tham so a,b,c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //phương thức gettter cho a, b và c.
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    //phương thức settter cho a, b và c.

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phương thức tính nghiệm
    public double getRoot1() {
        //goi lai p.thuc getDiscriminant() de kiem tra delta
        double delta = getDiscriminant();
        if (delta > 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta > 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }

    //nghiem kep
    public double getRoot3() {
        double delta = getDiscriminant();
        if (delta == 0) {
            return -b / (2 * a);
        }
        return 0;
    }

    //phương thức inputData cho phép ngừoi dùng nhập vào toàn  thông tin của đối tượng
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào số a: ");
        this.a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào số b: ");
        this.b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào số c: ");
        this.c = Double.parseDouble(scanner.nextLine());
    }

    public void displayDataR12() {
        System.out.printf("Nghiệm 1 = %.2f", getRoot1());
        System.out.printf("\nNghiệm 2  = %.2f", getRoot2());
    }

    public void displayDataR3() {
        System.out.println("\nNghiệm kép = %.2f" + getRoot3());
    }
}
