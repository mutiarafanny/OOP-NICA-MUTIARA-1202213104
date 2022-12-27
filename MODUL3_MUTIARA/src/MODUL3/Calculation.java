package MODUL3;

public class Calculation implements Runnable{
    double radius;
    double side;
    double area;
    double phi = 3.14;
    double square;
    double circle;
    double trapezoid;
    
    public void setSquare(double side) {
        double squareArea = side*side;
        this.square = squareArea;
    }

    public double getSquare() {
        return square;
    }

    public void setCircle(double radius, double phi) {
        double circleArea = phi*radius*radius;
        this.circle = circleArea;
    }

    public double getCircle() {
        return circle;
    }

    public void setTrapezoid(double a, double b, double t) {
        double trapezoidArea = 0.5*(a+b)*t;
        this.trapezoid = trapezoidArea;
    }

    public double getTrapezoid() {
        return trapezoid;
    }

    @Override
    public void run() {
        System.out.println("Program will start in");
        for (int i = 3; i<=3; i--) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
