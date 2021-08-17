package by.tms.lesson9.heros;

import by.tms.lesson9.enemys.Enemy;

import java.util.Random;

public class Mage extends Hero {

    public static final int DAMAGE = 50;

    public Mage(String name, int healt) {
        super(name, DAMAGE, healt);
    }

    @Override
    public void takeDamage(int damage, Enemy enemy) {
        setHealthHero(getHealthHero() - damage);
        if (isAlive(this)) {
            System.out.println("Mage "  + getName() + " take damage = " + damage + " Health = " + getHealthHero());
        } else {
            setHealthHero(0);
            System.out.println("Mage " + getName() + " dead.");
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage " + getName() + " attack " + enemy.getClass().getSimpleName() + enemy.getName());
        if (new Random().nextInt(10) > 5) {
            appliedDamage(enemy);
        } else {
            superPower(this, enemy);
        }
    }

    @Override
    public void superPower(Hero hero, Enemy enemy) {
        System.out.println(getName() + " super power critical damage x2.");
        enemy.takeDamage(DAMAGE * 2);
    }
}
