package by.tms.lesson8.geometricfigures.simples.Circules;

import by.tms.lesson8.geometricfigures.simples.AbstractFiguresSimples;

public class Circle extends AbstractCircles {

    public Circle(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public void printDescriptions() {
        System.out.println("Circle (x, y, radius): (" + getX() + ", " + getY() + ", " + getRadius() + ")");
        System.out.println("Perimeter = " + perimeter());
        System.out.println("Square = " + square());
    }

    @Override
    public double perimeter() {
        return getRadius() * 2 * Math.PI;
    }

    @Override
    public double square() {
        return Math.pow(getRadius() * 2, 2) * Math.PI / 4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cirlce{");
        sb.append("X=").append(getX());
        sb.append(", Y=").append(getY());
        sb.append(", Radius=").append(getRadius());
        sb.append(", Perimeter=").append(perimeter());
        sb.append(", Square=").append(square());
        sb.append('}');
        return sb.toString();
    }
}
