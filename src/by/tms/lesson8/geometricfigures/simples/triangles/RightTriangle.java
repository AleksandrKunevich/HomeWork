package by.tms.lesson8.geometricfigures.simples.triangles;

import by.tms.lesson8.geometricfigures.simples.AbstractFiguresSimples;

public class RightTriangle extends AbstractTriangle {

    public RightTriangle(int x, int y, int x2, int y3) {
        super(x, y, x2, y3);
    }

    @Override
    public void printDescriptions() {
        System.out.println("Right triangle (height, weight): (" + height() + ", " + weight() + ")");
        System.out.println("Hypotenuse = " + hypotenuse());
        System.out.println("Perimeter = " + perimeter());
        System.out.println("Square = " + square());
    }

    @Override
    public double perimeter() {
        return height() + weight() + hypotenuse();
    }

    @Override
    public double square() {
        return height() * weight() / 2;
    }

    public double height() {
        return Math.abs(this.getY3() - this.getY());
    }

    public double weight() {
        return Math.abs(this.getX2() - this.getX());
    }

    public double hypotenuse() {
        return Math.hypot(Math.abs(this.getY3() - this.getY()), Math.abs(this.getX2() - this.getX()));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Right triangle{");
        sb.append("Height=").append(height());
        sb.append(", Weight=").append(weight());
        sb.append(", Hypotenuse=").append(hypotenuse());
        sb.append(", Perimeter=").append(perimeter());
        sb.append(", Square=").append(square());
        sb.append('}');
        return sb.toString();
    }
}
