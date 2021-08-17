package by.tms.lesson9.enemys;

import by.tms.lesson9.heros.Hero;
import by.tms.lesson9.heros.Mortal;

import java.util.Random;

public abstract class Enemy implements Mortal, SuperPowerMonster {

    private int health;
    private int damage = 6;
    private String name;

    public String getName() {
        return name;
    }

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attackHero(Hero hero);

    protected void appliedDamage(Hero hero) {
        hero.takeDamage(damage, this);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (isAlive(this)) {
            System.out.println(getClass().getSimpleName() + "" + name + " take damage = " + damage + " Health = " + health);
        } else {
            health = 0;
            System.out.println(getClass().getSimpleName() + "" +name + " dead.");
        }
        if (getClass().getSimpleName() == "Zombie") {
            if (new Random().nextInt(10) > 3) {
                superPower(this, null);
            }
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
}
