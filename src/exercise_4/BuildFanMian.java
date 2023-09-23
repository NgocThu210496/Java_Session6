package exercise_4;

public class BuildFanMian {
    public static void main(String[] args) {
        BuildFan fan1=new BuildFan();
        //trạng thái trước khi bật quạt
        System.out.println("----"+ fan1);
        //set: thay doi gia tri
        fan1.setSpeed(fan1.getFAST()); //Gán giá trị lớn nhất cho speed
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("****************");
        BuildFan fan2=new BuildFan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);

    }
}
