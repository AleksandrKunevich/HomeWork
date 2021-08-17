package by.tms.lesson9.heros;

import by.tms.lesson9.enemys.Enemy;

import java.util.Random;

public class Archer extends Hero {

    public static final int DAMAGE = 100;

    public Archer(String name, int health) {
        super(name, DAMAGE, health);
    }

    @Override
    public void takeDamage(int damage, Enemy enemy) {
        setHealthHero(getHealthHero() - damage);
        if (isAlive(this)) {
            System.out.println(getName() + " take damage = " + damage + " Health = " + getHealthHero());
        } else {
            setHealthHero(0);
            System.out.println(getName() + " dead.");
        }
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + getName() + " attack " + enemy.getClass().getSimpleName() + enemy.getName());
        if (new Random().nextInt(10) > 2) {
            appliedDamage(enemy);
        } else {
            System.out.println(getName() + " super power: heal self by 5HP and half attack.");
            enemy.takeDamage(DAMAGE / 2);
            setHealthHero(getHealthHero() + 5);
        }
    }

    @Override
    public void superPower(Hero hero, Enemy enemy) {

    }
}
