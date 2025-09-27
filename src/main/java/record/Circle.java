package record;

public record Circle(Double radius) implements Shape {
    @Override
    public Double getArea() {
        return Math.PI * radius;
    }

    public static void main(String[] args) {
        final var circle = new Circle(2D);
        System.out.println(circle.toString()); // toString() foi criado automaticamente pelo compilador
        System.out.println(circle.radius());   // radius()   foi criado automaticamente pelo compilador
        System.out.println(circle.getArea());
    }
}
