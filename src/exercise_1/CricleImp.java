package exercise_1;

import ra.entity.Circle;

import java.util.Scanner;

public class CricleImp {
    public static void main(String[] args) {

        //ClassName objectName = new constructor
        //1.khai báo và khởi tạo đối tượng mà không khởi tạo bất thông tin gì
        ra.entity.Circle circle1 = new ra.entity.Circle();
        //mã băm
        //System.out.println("sv" + circle1);
        System.out.println("NHẬP THÔNG TIN Circle1:");
        Scanner scanner = new Scanner(System.in);
        // Sử dụng inputData để nhập dữ liệu cho circle1
        circle1.inputData(scanner);
        System.out.println("KẾT QUẢ THÔNG TIN Circle1:");
        //Gọi phương thức displayData để hiển thị thông tin các circle
        circle1.displayData();
        System.out.printf("Chu vi: %.2f\n", circle1.diameterOfCircle()); //chu vi
        System.out.printf("Diện tích: %.2f\n", circle1.calculateArea());//dien tich
        System.out.println("************************************");

        //3.Khai báo và khởi tạo đối tượng circle3 và khởi tạo color
        ra.entity.Circle circle3 = new ra.entity.Circle("yellow");
        System.out.println("NHẬP THÔNG TIN Circle3:");
        System.out.println("Nhập vào bán kính của Circle3:");
        //Sử dụng các phương thức set để nhập thông tin
        //nhập vào radius
        circle3.setRadius(Double.parseDouble(scanner.nextLine()));
        circle3.displayData();
        System.out.printf("Chu vi: %.2f\n", circle3.diameterOfCircle()); //chu vi
        System.out.printf("Diện tích: %.2f\n", circle3.calculateArea());//dien tich
        System.out.println("************************************");

        //2. Khai báo và khởi tạo đối tượng Circle2 và khởi tạo tất cả thông tin Circle
        ra.entity.Circle circle2 = new Circle(10, "red");
        System.out.println("KẾT QUẢ THÔNG TIN Circle2:");
        //Gọi phương thức displayData để hiển thị thông tin các circle
        circle2.displayData();
        System.out.printf("Chu vi: %.2f\n", circle2.diameterOfCircle()); //chu vi
        System.out.printf("Diện tích: %.2f\n", circle2.calculateArea());//dien tich
        System.out.println("************************************");
    }
}
