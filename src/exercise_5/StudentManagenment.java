package exercise_5;

import java.util.Scanner;

public class StudentManagenment {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private int phone;
    private String students;

    public StudentManagenment() {

    }
    public StudentManagenment(String studentId, String studentName, int age, boolean sex, String address, int phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void inputData(Scanner scanner){
        System.out.println("NHẬP VÀO THÔNG TIN SINH VIÊN");
        System.out.println("Mã SV: ");
        this.studentId= scanner.nextLine();
        System.out.println("Tên SV: ");
        this.studentName= scanner.nextLine();
        System.out.println("Tuổi SV: ");
        this.age= Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính: ");
        this.sex=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Địa chỉ: ");
        this.address= scanner.nextLine();
        System.out.println("Số điện thoại: ");
        this.phone=Integer.parseInt(scanner.nextLine());
    }

//public void addStudent(StudentManagenment student) {
//    students.add(student); // Thêm đối tượng học sinh vào danh sách
//}
    public void displayData(){
        System.out.println("*******THÔNG TIN SINH VIÊN*********");
        System.out.printf("Mã SV: %s\nTên SV: %s\nTuổi SV: %d\n" ,this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b\nĐịa chỉ: %s\nSố điện thoại: %d\n" ,this.sex, this.address, this.phone);
    }
}
