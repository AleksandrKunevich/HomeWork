package by.tms.lesson9.enemys;

import by.tms.lesson9.heros.Hero;

import java.util.Random;

public class Gule extends Enemy {

    public Gule(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getClass().getSimpleName() + getName() + " attack " + hero.getName());
        appliedDamage(hero);
        if (hero.isAlive(hero)) {
            if (new Random().nextInt(2) == 1) {
                superPower(this, hero);
            }
        }
    }

    @Override
    public void superPower(Enemy enemy, Hero hero) {
        System.out.println(getClass().getSimpleName() + " super power: EAT " + hero.getClass().getSimpleName() + " "
                + hero.getName() + " by 3 health and regenerate self health");
        setHealth(this.getHealth() + 3);
        System.out.println(getClass().getSimpleName() + " health = " + getHealth());
        appliedDamage(hero);
    }
}
