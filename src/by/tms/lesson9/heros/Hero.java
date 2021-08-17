package by.tms.lesson9.heros;

import by.tms.lesson9.enemys.Enemy;

public abstract class Hero implements Mortal, SuperPowerHero{

    private String name;
    private int damage;
    private int healthHero;

    public Hero(String name, int damage, int healthHero) {
        this.name = name;
        this.damage = damage;
        this.healthHero = healthHero;
    }

    public abstract void takeDamage(int damage, Enemy enemy);

    public abstract void attackEnemy(Enemy enemy);

    protected void appliedDamage(Enemy enemy) {
        enemy.takeDamage(damage);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthHero() {
        return healthHero;
    }

    public void setHealthHero(int healthHero) {
        this.healthHero = healthHero;
    }
}
