package by.tms.lesson9;

import by.tms.lesson9.enemys.Enemy;
import by.tms.lesson9.enemys.Gule;
import by.tms.lesson9.enemys.Zombie;
import by.tms.lesson9.heros.Archer;
import by.tms.lesson9.heros.Mage;
import by.tms.lesson9.heros.Warrior;

import java.util.Random;

public class BattleGround {

    private static final int INT_ZOMBIES = 3;
    private static final int INT_GULES = 3;
    private static boolean isBattle = true;
    private static boolean isEnemy = true;
    private static boolean isHero = true;
    private static Random heroOrEnemy = new Random();
    private static Random randomAttack = new Random();
    private static Random randomEnemy = new Random();

    public static void main(String[] args) {

        Gule[] gules = new Gule[INT_GULES];
        for (int i = 0; i < INT_GULES; i++) {
            gules[i] = new Gule(i + "", new Random().nextInt(300) + 2000);
        }
        Zombie[] zombies = new Zombie[INT_ZOMBIES];
        for (int i = 0; i < INT_ZOMBIES; i++) {
            zombies[i] = new Zombie(i + "", new Random().nextInt(200) + 2000);
        }
        Warrior war = new Warrior("Nufis", 500);
        Mage mage = new Mage("Rufus", 250);
        Archer archer = new Archer("Migolos", 350);

        do {
            switch (heroOrEnemy.nextInt(3)) {
                // Hero attack
                case 0: {
                    switch (randomAttack.nextInt(4)) {  // who is hero attack?
                        // Warrior attack
                        case 0: {
                            switch (randomEnemy.nextInt(2)) {
                                // Gule
                                case 0: {
                                    boolean checkGules = false;
                                    checkGules = isCheckGules(gules, checkGules);
                                    warriorAttackGules(gules, war, randomEnemy, checkGules);
                                    break;
                                }
                                // Zombie
                                case 1: {
                                    boolean checkZombies = false;
                                    checkZombies = isCheckZombies(zombies, checkZombies);
                                    warriorAttackZombies(gules, zombies, war, randomEnemy, checkZombies);
                                    break;
                                }
                            }
                            break;
                        }
                        // Mage attack
                        case 1: {
                            switch (randomEnemy.nextInt(2)) {
                                case 0: // Gule
                                {
                                    boolean checkGules = false;
                                    checkGules = isCheckGules(gules, checkGules);
                                    mageAttackGules(gules, mage, randomEnemy, checkGules);
                                    break;
                                }
                                case 1: { // Zombie
                                    boolean checkZombies = false;
                                    checkZombies = isCheckZombies(zombies, checkZombies);
                                    MageAttackZombies(gules, zombies, mage, randomEnemy, checkZombies);
                                    break;
                                }// Zombie

                            }

                            break;
                        }
                        // Archer attack
                        case 2: {
                            switch (randomEnemy.nextInt(2)) {
                                // Gule
                                case 0: {
                                    boolean checkGules = false;
                                    checkGules = isCheckGules(gules, checkGules);
                                    ArcherAttackGules(gules, archer, randomEnemy, checkGules);
                                    break;
                                }
                                // Zombie
                                case 1: {
                                    boolean checkZombies = false;
                                    checkZombies = isCheckZombies(zombies, checkZombies);
                                    ArcherAttackZombies(gules, zombies, archer, randomEnemy, checkZombies);
                                    break;
                                }
                            }

                            break;
                        }
                    }
                    break;
                }
                // Gules attack
                case 1: {
                    boolean isAttack = false;
                    boolean checkGules = false;
                    checkGules = isCheckGules(gules, checkGules);
                    guleAttackHero(gules, war, mage, archer, randomEnemy, checkGules);
                    break;
                }
                // Zombies attack
                case 2: {
                    boolean isAttack = false;
                    boolean checkZombies = false;
                    checkZombies = isCheckZombies(zombies, checkZombies);
                    zombieAttackHero(zombies, war, mage, archer, randomEnemy, checkZombies);
                    break;
                }
            }

            if (!war.isAlive(war) && !mage.isAlive(mage) && !archer.isAlive(archer)) {
                isHero = false;
            }
            if (!isCheckGules(gules, false) && !isCheckZombies(zombies, false)) {
                isEnemy = false;
            }
            if (!isEnemy || !isHero) {
                isBattle = false;
            }
        }
        while (isBattle);

        System.out.println(isEnemy ? "\nEnemy wins!!!\n" : "\nHeroes wins!!!\n");
        printEnemys(gules, zombies);
        printHeros(war, mage, archer);
    }

    private static void printHeros(Warrior war, Mage mage, Archer archer) {
        System.out.println("Warrior health = " + war.getHealthHero());
        System.out.println("Mage health = " + mage.getHealthHero());
        System.out.println("Archer health = " + archer.getHealthHero());
    }

    private static void printEnemys(Gule[] gules, Zombie[] zombies) {
        for (int i = 0; i < INT_ZOMBIES; i++) {
            System.out.println("Zombie" + i + " Health = " + zombies[i].getHealth());
        }
        for (int i = 0; i < INT_GULES; i++) {
            System.out.println("Gules" + i + " Health = " + gules[i].getHealth());
        }
    }

    private static void zombieAttackHero(Zombie[] zombies, Warrior war, Mage mage, Archer archer, Random randomEnemy, boolean checkZombies) {
        boolean isAttack;
        if (checkZombies) {
            int iZombies;
            do {
                iZombies = randomEnemy.nextInt(INT_ZOMBIES);
            } while (!zombies[iZombies].isAlive(zombies[iZombies]));

            int whoHeroByAttacked = new Random().nextInt(4);
            switch (whoHeroByAttacked) {
                // Warrior by attacked
                case 0: {
                    if (war.isAlive(war)) {
                        isAttack = true;
                        zombies[iZombies].attackHero(war);
                    }
                    break;
                }
                // Mage by attacked
                case 1: {
                    if (mage.isAlive(mage)) {
                        isAttack = true;
                        zombies[iZombies].attackHero(mage);
                    }
                    break;
                }
                // Archer by Attacked
                case 2: {
                    if (archer.isAlive(archer)) {
                        isAttack = true;
                        zombies[iZombies].attackHero(archer);
                    }
                    break;
                }
            }
        } else {
            System.out.println("All ZOMBIES is dead and can`t attack. Heroes are lucky!");
        }
    }

    private static void guleAttackHero(Gule[] gules, Warrior war, Mage mage, Archer archer, Random randomEnemy, boolean checkGules) {
        boolean isAttack;
        if (checkGules) {
            int iGules;
            do {
                iGules = randomEnemy.nextInt(INT_GULES);
            } while (!gules[iGules].isAlive(gules[iGules]));

            int whoHeroByAttacked = new Random().nextInt(4);
            switch (whoHeroByAttacked) {
                // Warrior by attacked
                case 0: {
                    if (war.isAlive(war)) {
                        isAttack = true;
                        gules[iGules].attackHero(war);
                    }
                    break;
                }
                // Mage by attacked
                case 1: {
                    if (mage.isAlive(mage)) {
                        isAttack = true;
                        gules[iGules].attackHero(mage);
                    }
                    break;
                }
                // Archer by Attacked
                case 2: {
                    if (archer.isAlive(archer)) {
                        isAttack = true;
                        gules[iGules].attackHero(archer);
                    }
                    break;
                }
            }
        } else {
            System.out.println("All GULES is dead and can`t attack. Heroes are lucky!");
        }
    }

    private static void ArcherAttackZombies(Gule[] gules, Zombie[] zombies, Archer archer, Random randomEnemy, boolean checkZombies) {
        if (checkZombies) {
            int i;
            do {
                i = randomEnemy.nextInt(INT_ZOMBIES);
            } while (!zombies[i].isAlive(zombies[i]));
            archer.attackEnemy(zombies[i]);
        } else {
            System.out.println("Archer cant attack, because all gules dead`s.");
        }
    }

    private static void ArcherAttackGules(Gule[] gules, Archer archer, Random randomEnemy, boolean checkGules) {
        if (checkGules) {
            int i;
            do {
                i = randomEnemy.nextInt(INT_GULES);
            } while (!gules[i].isAlive(gules[i]));
            archer.attackEnemy(gules[i]);
        } else {
            System.out.println("Archer cant attack, because all gules dead`s.");
        }
    }

    private static void MageAttackZombies(Gule[] gules, Zombie[] zombies, Mage mage, Random randomEnemy, boolean checkZombies) {
        if (checkZombies) {
            int i;
            do {
                i = randomEnemy.nextInt(INT_ZOMBIES);
            } while (!zombies[i].isAlive(zombies[i]));
            mage.attackEnemy(zombies[i]);
        } else {
            System.out.println("Mage cant attack, because all gules dead`s.");
        }
    }

    private static void mageAttackGules(Gule[] gules, Mage mage, Random randomEnemy, boolean checkGules) {
        if (checkGules) {
            int i;
            do {
                i = randomEnemy.nextInt(INT_GULES);
            } while (!gules[i].isAlive(gules[i]));
            mage.attackEnemy(gules[i]);
        } else {
            System.out.println("Mage cant attack, because all gules dead`s.");
        }
    }

    private static void warriorAttackZombies(Gule[] gules, Zombie[] zombies, Warrior war, Random randomEnemy, boolean checkZombies) {
        if (checkZombies) {
            int i;
            do {
                i = randomEnemy.nextInt(INT_ZOMBIES);
            } while (!zombies[i].isAlive(zombies[i]));
            war.attackEnemy(zombies[i]);
        } else {
            System.out.println("Warrior cant attack, because all gules dead`s.");
        }
    }

    private static boolean isCheckZombies(Zombie[] zombies, boolean checkZombies) {
        for (Enemy zombie : zombies) {
            if (zombie.isAlive(zombie)) {
                checkZombies = true;
            }
        }
        return checkZombies;
    }

    private static void warriorAttackGules(Gule[] gules, Warrior war, Random randomEnemy, boolean checkGules) {
        if (checkGules) {
            int i;
            do {
                i = randomEnemy.nextInt(INT_GULES);
            } while (!gules[i].isAlive(gules[i]));
            war.attackEnemy(gules[i]);
        } else {
            System.out.println("Warrior cant attack, because all gules dead`s.");
        }
    }

    private static boolean isCheckGules(Gule[] gules, boolean checkGules) {
        for (Enemy gule : gules) {
            if (gule.isAlive(gule)) {
                checkGules = true;
            }
        }
        return checkGules;
    }
}
