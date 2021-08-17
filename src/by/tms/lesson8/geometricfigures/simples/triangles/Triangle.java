package by.tms.lesson8.geometricfigures.simples.triangles;

import by.tms.lesson8.geometricfigures.simples.AbstractFiguresSimples;

public class Triangle extends AbstractTriangle {

    public Triangle(int x, int y, int x2, int y2, int x3, int y3) {
        super(x, y, x2, y2, x3, y3);
    }

    @Override
    public void printDescriptions() {
        System.out.println("Triangle (AB, BC, CA): (" + AB() + ", " + BC() + ", " + CA() + ")");
        System.out.println("Perimeter = " + perimeter());
        System.out.println("Square = " + square());
    }

    @Override
    public double perimeter() {
        return AB() + BC() + CA();
    }

    @Override
    public double square() {
        double p = (AB() + BC() + CA()) / 2;
        return Math.sqrt(p*(p - AB())*(p - BC())*(p - CA()));
    }

    public double AB() {
        return Math.hypot(Math.abs(this.getY() - this.getY2()), Math.abs(this.getX() - this.getX2()));
    }

    public double BC() {
        return Math.hypot(Math.abs(this.getY2() - this.getY3()), Math.abs(this.getX2() - this.getX3()));
    }

    public double CA() {
        return Math.hypot(Math.abs(this.getY3() - this.getY()), Math.abs(this.getX3() - this.getX()));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangle{");
        sb.append("AB=").append(AB());
        sb.append(", BC=").append(BC());
        sb.append(", CA=").append(CA());
        sb.append(", Perimeter=").append(perimeter());
        sb.append(", Square=").append(square());
        sb.append('}');
        return sb.toString();
    }
}
