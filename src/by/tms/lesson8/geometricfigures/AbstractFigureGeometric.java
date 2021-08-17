package by.tms.lesson8.geometricfigures;

public abstract class AbstractFigureGeometric implements Description{

    private int x;
    private int y;

    public AbstractFigureGeometric(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
