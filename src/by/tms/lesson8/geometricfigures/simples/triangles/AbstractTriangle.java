package by.tms.lesson8.geometricfigures.simples.triangles;

import by.tms.lesson8.geometricfigures.simples.AbstractFiguresSimples;

public abstract class AbstractTriangle extends AbstractFiguresSimples {

    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public AbstractTriangle(int x, int y, int x2, int y3) {
        super(x, y);
        this.x2 = x2;
        this.y3 = y3;
    }

    public AbstractTriangle(int x, int y, int x2, int y2, int x3, int y3) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }
}
