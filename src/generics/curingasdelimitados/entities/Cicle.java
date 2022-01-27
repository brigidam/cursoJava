package generics.curingasdelimitados.entities;

public class Cicle implements Shape {

    private double radius;

    public Cicle(double radius) {
        this.radius = radius;
    }

    public double getCircus() {
        return radius;
    }

    public void setCircus(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
