package by.tms.lesson9.heros;

import by.tms.lesson9.enemys.Enemy;

public interface Mortal {

    default boolean isAlive(Hero hero) {
        if (hero.getHealthHero() > 0) {
            return true;
        } else {
            return false;
        }
    }

    default boolean isAlive(Enemy enemy) {
        if (enemy.getHealth() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
