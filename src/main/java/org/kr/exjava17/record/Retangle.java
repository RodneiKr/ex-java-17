package org.kr.exjava17.record;

public record Retangle(Double sideA, Double sideB) implements Shape {
    @Override
    public Double getArea() {
        return (this.sideA * this.sideB);
    }

    public static void main(String[] args) {
        final var retangle = new Retangle(2.0,3.0);
        System.out.println(retangle.toString());
        System.out.println(retangle.getArea());
    }
}
