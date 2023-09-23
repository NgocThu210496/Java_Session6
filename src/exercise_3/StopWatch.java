package exercise_3;

public class StopWatch {
    //long : để có thể chứa giá trị của thời gian ở dạng số nguyên lớn.
    private long startTime;
    private long endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
        //Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
        startTime=System.currentTimeMillis();

    }
    public void start(){
        //Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
        startTime=System.currentTimeMillis();
    }
    public void end(){
        endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long getElapsedTime(){
        // thời gian đã trôi qua
        return endTime-startTime;
    }
}
