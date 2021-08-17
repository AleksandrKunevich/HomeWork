package by.tms.lesson8.geometricfigures.simples.rectangles;

import by.tms.lesson8.geometricfigures.simples.AbstractFiguresSimples;

public class Rectangle extends AbstractFiguresSimples implements RectanglesProperties {

    private int x2;
    private int y2;

    public Rectangle(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void printDescriptions() {
        System.out.println("Rectangle (AB, BC): (" + weight() + ", " + height() + ")");
        System.out.println("Perimeter = " + perimeter());
        System.out.println("Square = " + square());
        System.out.println("Hypotenuse = " + hypotenuse());
    }

    @Override
    public double perimeter() {
        return (height() + weight()) * 2;
    }

    @Override
    public double square() {
        return height() * weight();
    }

    @Override
    public double height() {
        return Math.abs(y2 - this.getY());
    }

    @Override
    public double weight() {
        return Math.abs(x2 - this.getX());
    }

    public double hypotenuse() {
        return Math.hypot(Math.abs(y2 - this.getY()), Math.abs(x2 - this.getX()));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("Height=").append(height());
        sb.append(", Weight=").append(weight());
        sb.append(", Hypotenuse=").append(hypotenuse());
        sb.append(", Perimeter=").append(perimeter());
        sb.append(", Square=").append(square());
        sb.append('}');
        return sb.toString();
    }
}
