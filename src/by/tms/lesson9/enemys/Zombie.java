package by.tms.lesson9.enemys;

import by.tms.lesson9.heros.Hero;

import java.util.Random;

public class Zombie extends Enemy {

    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getClass().getSimpleName() + getName() + " attack " + hero.getName());
        appliedDamage(hero);
    }

    @Override
    public void superPower(Enemy enemy, Hero hero) {
        enemy.setHealth(new Random().nextInt(501));
    }
}
