package by.tms.lesson8.geometricfigures;

import by.tms.lesson8.geometricfigures.simples.rectangles.Rectangle;
import by.tms.lesson8.geometricfigures.simples.triangles.AbstractTriangle;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(AbstractFigureGeometric afg) {
        if (afg != null) {
            if (afg instanceof Rectangle) return true;
        } else {
            return false;
        }
        return false;
    }

    public static boolean isTriangle(AbstractFigureGeometric afg) {
        if (afg != null) {
            if (afg instanceof AbstractTriangle) return true;
        } else {
            return false;
        }
        return false;
    }
}
