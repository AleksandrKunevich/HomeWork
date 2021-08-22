package by.tms.lesson10homework.task1.animals;

import java.util.Objects;
import java.util.Random;

public class Tiger extends Animal {

    private boolean havePrey = false;

    public Tiger(String name, double weight, int paws) {
        super(name, weight, paws);
    }

    @Override
    public void move() {
        System.out.println("Tiger moves very quietly!");
    }

    @Override
    public void voice() {
        System.out.println("Rrrrrrrr.....");
    }

    public void attackPrey(Animal animal) {
        if (!havePrey) {
            Random random = new Random();
            if (random.nextInt(10) > 3) {
                System.out.println("Tiger attack " + animal.getClass().getSimpleName() + " "
                        + animal.getName() + " get prey");
                animal.voice();
                System.out.println(animal.getClass().getSimpleName() + " became tiger`s lunch.");
                havePrey = true;
                animal.setPaws(animal.getPaws() - 1);
                this.setWeight(getWeight() + 100);
            } else {
                System.out.println("Tiger lost prey");
                animal.move();
            }
        } else {
            System.out.println("Tiger have prey and can`t attack new prey.");
        }
    }

    public void jump() {
        if (this.getWeight() < 1000) {
            System.out.println("Tiger jump.");
        } else {
            System.out.println("Tiger try,but " + this.getName() + " too fat. Can`t jump.");
            this.setWeight(this.getWeight() - 100);
        }
    }

    @Override
    public void eat() {
        if (havePrey) {
            super.eat();
            havePrey = false;
        } else {
            System.out.println(this.getName() + " have not prey to eat.");
        }
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
        Tiger tiger = (Tiger) o;
        return havePrey == tiger.havePrey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), havePrey);
    }
}
