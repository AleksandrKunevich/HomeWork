package by.tms.lesson8;

import by.tms.lesson8.geometricfigures.ShapeUtils;
import by.tms.lesson8.geometricfigures.simples.Circules.Circle;
import by.tms.lesson8.geometricfigures.simples.rectangles.Rectangle;
import by.tms.lesson8.geometricfigures.simples.triangles.RightTriangle;
import by.tms.lesson8.geometricfigures.simples.triangles.Triangle;

public class GeometricFiguresTest {

    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 10);
        circle.printDescriptions();
        System.out.println();

        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        rectangle.printDescriptions();
        System.out.println();

        RightTriangle rightTriangle = new RightTriangle(0, 0, 10, 20);
        rightTriangle.printDescriptions();
        System.out.println();

        Triangle triangle = new Triangle(0, 0, 10, 20, 30, 40);
        triangle.printDescriptions();
        System.out.println();

        System.out.println("Square triangle EQUAL square rectangle: " + triangle.isEqualSquare(rectangle));
        System.out.println("Square rectangle EQUAL square right triangle: " + rectangle.isEqualSquare(rightTriangle));
        System.out.println("Triangle is Rectangle? : " + ShapeUtils.isRectangle(triangle));
        System.out.println("Rectangle is Rectangle? : " + ShapeUtils.isRectangle(rectangle));
        System.out.println("Triangle is Triangle? : " + ShapeUtils.isTriangle(triangle));
        System.out.println("RightTriangle is Triangle? : " + ShapeUtils.isTriangle(rightTriangle));
        System.out.println("Circle is Triangle? : " + ShapeUtils.isTriangle(circle));
        System.out.println();

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(rightTriangle);
    }
}
