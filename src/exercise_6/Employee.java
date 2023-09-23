package exercise_6;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public boolean isGen() {
        return gen;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //phương thúc inputData
    public void inputData(Scanner scanner){
        System.out.println("Mã nhân viên: ");
        this.employeeId=Integer.parseInt(scanner.nextLine());
        System.out.println("Tên nhân viên: ");
        this.employeeName= scanner.nextLine();
        System.out.println("Age: ");
        this.age=Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính: ");
        this.gen=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Hệ số lương: ");
        this.rate=Double.parseDouble(scanner.nextLine());
    }
    public double calSalary(){
        return salary = rate * 1300000;
    }
    public void displayData(){
        System.out.println("***************THÔNG TIN NHÂN VIÊN***************");
        System.out.printf("\nMã nhân viên: %d\nTên nhân viên: %s\nAge: %d\n",this.employeeId, this.employeeName, this.age);
        System.out.printf("Giới tính: %b\nLương: %f\n",this.age, this.salary);
        System.out.println("*************************************************");
    }
}
