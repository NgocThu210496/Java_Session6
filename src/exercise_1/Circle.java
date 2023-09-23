package exercise_1;

import java.util.Scanner;

public class Circle {
    //khai báo các thuộc tính (properties)
    private double radius;
    private String color;

    //constructor 0 tham so
    public Circle() {
    }

    //constructor co tham so
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //các phương thức getter
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    //các phương thức setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(String color) {
        this.color = color;
    }

// test tostring
//    @Override
//    public String toString() { //để chuyển đổi object sáng chuỗi
//        return "hello";
//    }

    //chu vi
    public double diameterOfCircle(){
        double diameter= this.radius *2 *Math.PI;
        return diameter;
    }
    //dien tich
    public double calculateArea(){
        double calculateArea = Math.PI*this.radius*this.radius;
        return calculateArea;
    }
    //phương thức inputData cho phép ngừoi dùng nhập vào toàn  thôn gtin của đối tượng
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào bán kính hình tròn");
        //gan lai cac thuoc tinh cua doi tuong
        this.radius=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào màu sắc");
        this.color=scanner.nextLine();
    }

    //phương thức hiển thị thông tin các thuộc tính
    public void displayData(){
        System.out.printf("Bán kính hình tròn: %.2f - Màu sắc: %s%n", this.radius,this.color);
    }

}
