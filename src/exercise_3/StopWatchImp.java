package exercise_3;

public class StopWatchImp {
    public static void main(String[] args) {
        int[] arr = new int[100000];
       // Khởi tạo và sử dụng đối tượng
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();//bắt đầu tính thời gian



        stopWatch.end();
        long elapsedTime=  stopWatch.getElapsedTime();
        System.out.println("Thời gian thực thi thuật toán sắp xếp chọn: " + elapsedTime + " miliseconds");
    }

    }

