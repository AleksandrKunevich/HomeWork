package by.tms.lesson10homework.task1.animals;

import java.util.Objects;

public class Kangaroo extends Animal {

    private double weight;

    public Kangaroo(String name, double weight, int paws) {
        super(name, paws);
        if (weight > 100 && weight < 500) {
            this.weight = weight;
        } else {
            this.weight = 100;
        }
    }

    @Override
    public void move() {
        System.out.println("Kangaroo jump...jump...jump...");
    }

    @Override
    public void voice() {
        System.out.println("Khe-khe-khe...");
    }

    public void bigJump() {
        System.out.println("Kangaroo BIG jump.");
    }

    public void regenerate() {
        this.setPaws(this.getPaws() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kangaroo kangaroo = (Kangaroo) o;
        return Double.compare(kangaroo.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
