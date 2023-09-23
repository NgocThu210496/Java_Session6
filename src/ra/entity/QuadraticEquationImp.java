package ra.entity;

import java.util.Scanner;

public class QuadraticEquationImp {
    public static void main(String[] args) {
        System.out.println("Nhập số :");

        Scanner scanner = new Scanner(System.in);
        // 1.Khai báo và khởi tạo đối tượng QuadraticEquation 0 có tham số
        QuadraticEquation equation = new QuadraticEquation();
        equation.inputData(scanner);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            //có hai nghiệm
            equation.displayDataR12();
        } else if (delta == 0) {
            //có một nghiệm kép
            equation.displayDataR3();
        } else {
            System.out.println("Phương trình không có nghiệm.");
        }
        System.out.println("\n***********************************");
        //2.Khai báo và khởi tạo đối tượng QuadraticEquation có all tham số
        QuadraticEquation equation1 = new QuadraticEquation(4, 9, 3);
        if (delta > 0) {
            //có hai nghiệm
            equation1.displayDataR12();
        } else if (delta == 0) {
            //có một nghiệm kép
            equation1.displayDataR3();
        } else {
            System.out.println("Phương trình không có nghiệm.");
        }
    }
}
