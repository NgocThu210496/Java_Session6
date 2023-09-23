package exercise_4;

public class BuildFan {
    //khai bao hang so
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed; //toc do
    private boolean on;
    private double radius;
    private String color;

    public BuildFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public BuildFan() {
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "BuildFan{" +
                    ", speed=" + speed +
                    ", on=" + "Đang bật" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
        return "BuildFan{" +
                ", on=" + "Đang Tắt" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';

    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    //lay data ra = getOn
    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //
}
