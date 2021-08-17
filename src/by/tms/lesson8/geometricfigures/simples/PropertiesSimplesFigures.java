package by.tms.lesson8.geometricfigures.simples;

public interface PropertiesSimplesFigures {

    double perimeter();

    double square();

    default boolean isEqualSquare(PropertiesSimplesFigures psf) {
        return (this.square() == psf.square());
    }
}

