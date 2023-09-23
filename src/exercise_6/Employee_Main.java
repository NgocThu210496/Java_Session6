package exercise_6;

import java.util.Scanner;

public class Employee_Main {
    public static void main(String[] args) {
        System.out.println("NHẬP THÔNG TIN SINH VIÊN");
        Scanner scanner = new Scanner(System.in);
        // 1.Khai báo và khởi tạo đối tượng employee 0 có tham số
        Employee employee1 =new Employee();
        employee1.inputData(scanner);
        employee1.calSalary();
        employee1.displayData();

        Employee employee2 =new Employee();
        employee2.inputData(scanner);
        employee2.calSalary();
        employee2.displayData();

    }


}
