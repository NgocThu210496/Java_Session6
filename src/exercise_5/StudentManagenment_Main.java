package exercise_5;

import java.util.Scanner;

public class StudentManagenment_Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StudentManagenment[] studentManagenments= new StudentManagenment[100];
        StudentManagenment student1 = new StudentManagenment("SV1", "Nguyen Thu", 18, true, "Da Nang" , 754375567);
        StudentManagenment student2 = new StudentManagenment("SV2", "Nguyen A", 20, false, "Ha Noi", 908765212);
        StudentManagenment student3 = new StudentManagenment("SV3", "Nguyen B", 20, false, "HCM", 908765212);
        StudentManagenment student4 = new StudentManagenment("SV4", "Nguyen V", 20, false, "Hue", 908765212);
        studentManagenments[0]=student1;
        studentManagenments[1]=student2;
        studentManagenments[2]=student3;
        studentManagenments[3]=student4;

        int choice;
        int count=0;
        do {
            System.out.println("*********MENU********");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice= Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("1. Hiển thị danh sách tất cả học sinh");
                    for (StudentManagenment student : studentManagenments) {//duyệt qua mảng studentManagenments
                        if (student != null) {//kiểm tra xem student có khác null không (để tránh hiển thị thông tin của các vị trí trong mảng chưa được khởi tạo)
                            student.displayData(); // Hiển thị thông tin sinh viên
                        }
                    }
                    break;
                case 2:
                   int em;
                    System.out.println("2. Thêm mới học sinh");
                   // studentManagenments[count]= new StudentManagenment(); // khởi tạo đối tượng
                    StudentManagenment newStudent= new StudentManagenment("em+1", "Nguyen D", 20, true, "Da Nang" , 53453453);
                    newStudent.inputData(scanner);
                    //studentManagenments[em]=newStudent;
                    //StudentManagement.addStudent(newStudent);
                    //studentManagenments[count].inputData(scanner); // nhập thông tin sinh viên
                    count++;
                    break;
                case 3:
                    System.out.println("3.Nhập mã sinh viên cần sửa: ");
                    String id= scanner.nextLine();
                    for (int i = 0; i < count; i++) { // duyệt mảng
                        if (studentManagenments[i].getStudentId().equals(id)){ // nếu mã sinh viên nhập vào bằng mã sinh viên trong mảng
                            studentManagenments[i].inputData(scanner); // nhập lại thông tin sinh viên theo mã sinh viên
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên cần xoá: "); // nhập mã sinh viên cần xoá
                    String id1= scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (studentManagenments[i].getStudentId().equals(id1)){ // nếu mã sinh viên nhập vào bằng mã sinh viên trong mảng
                            for (int j = i; j < count-1; j++) { // duyệt mảng từ vị trí mã sinh viên nhập vào đến vị trí cuối cùng
                                studentManagenments[j]= studentManagenments[j+1]; // gán phần tử tiếp theo cho phần tử hiện tại
                            }
                            count--;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }while (true);
    }
}
