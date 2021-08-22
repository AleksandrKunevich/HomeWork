package by.tms.lesson10homework.task1.animals;

import java.util.Objects;

public abstract class Animal {

    private final int TAIL = 1;
    private final int EYES = 2;
    private double weight;
    private int paws;
    private String name;
    private boolean isHungry = true;

    public Animal(String name, int paws) {
        this.name = name;
        if ((paws > 4) && (paws < 1)) {
            this.paws = 4;
        } else {
            this.paws = paws;
        }
    }

    public Animal(String name, double weight, int paws) {
        this.name = name;
        if (weight > 500 && weight < 2000) {
            this.weight = weight;
        } else {
            this.weight = 500;
        }
        if ((paws > 4) && (paws < 1)) {
            this.paws = 4;
        } else {
            this.paws = paws;
        }
    }

    protected abstract void move();

    protected abstract void voice();

    protected void eat() {
        if (isHungry) {
            System.out.println(this.getClass().getSimpleName() + " " + name + " eat.");
            this.isHungry = false;
        } else {
            System.out.println(name + " is not hungry.");
            isHungry = true;
        }
    }

    public double getWeight() {
        return weight;
    }

    public int getPaws() {
        return paws;
    }

    public int getTail() {
        return TAIL;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public int getEYES() {
        return EYES;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPaws(int paws) {
        if (paws > 1) {
            this.paws = paws;
            this.setWeight(this.getWeight() - 100);
        } else {
            this.paws = 1;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return TAIL == animal.TAIL && EYES == animal.EYES && Double.compare(animal.weight, weight) == 0 && paws == animal.paws && isHungry == animal.isHungry && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAIL, EYES, weight, paws, name, isHungry);
    }
}
