package by.tms.lesson9.heros;

import by.tms.lesson9.enemys.Enemy;

import java.util.Random;

public class Warrior extends Hero {

    public static final int DAMAGE = 150;

    public Warrior(String name, int health) {
        super(name, DAMAGE, health);
    }

    @Override
    public void takeDamage(int damage, Enemy enemy) {
        if (new Random().nextInt(10) > 4) {
            setHealthHero(getHealthHero() - damage);
        } else {
            superPower(this, enemy);
        }
        if (isAlive(this)) {
            System.out.println("Warrior " + getName() + " take damage = " + damage + " Health = " + getHealthHero());
        } else {
            setHealthHero(0);
            System.out.println("Warrior " + getName() + " dead.");
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + getName() + " attack " + enemy.getClass().getSimpleName() + enemy.getName());
        appliedDamage(enemy);
    }

    @Override
    public void superPower(Hero hero, Enemy enemy) {
        setHealthHero(getHealthHero() - enemy.getDamage() / 2);
        System.out.println(getName() + " blocked 50% attack " + enemy.getClass().getSimpleName() + enemy.getName());

    }
}
