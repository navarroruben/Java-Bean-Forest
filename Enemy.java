// Ruben Navarro
// Date: 03/30/2019
// COP3252
// Assignment 5
// Enemy.java

import java.util.Random;

abstract public class Enemy {

    protected int damage;         // variable to hold damage dealt
    protected int enemyHealth;    // variable to hold enemy health
    protected int hit;            // variable to hold enemy dealt damage
    protected String enemyWeapon; // variable to hold enemy weapon
    protected String enemyArmor;  // variable to hold enemy armor

    static Random rnum = new Random(); // object for random generation

    // Enemy constructor
    public Enemy (int damage, int enemyHealth, String enemyWeapon, String enemyArmor) {
        this.damage = damage;
        this.enemyHealth = enemyHealth;
        this.enemyWeapon = enemyWeapon;
        this.enemyArmor = enemyArmor;
    }

    // public abstract method for fighting
    public abstract int fight();

    // Custom exception to check if damage dealt is less than 0
    public void takeDamage(int damage) throws InvalidDamageException {
        if (damage < 0)
            throw new InvalidDamageException(damage);
    }

    // method to randomly generate opponent
    public static final Enemy getRandomEnemy() {
        int num = rnum.nextInt(5) + 1;

        if (num == 1)
            return new OracleOgres();
        else if (num == 2)
            return new TrollHunters();
        else if (num == 3)
            return new RampagingOrcs();
        else
            return new WitchyScorcerers();
    }

    // method to set enemies health
    public void setEnemyHealth(int enemyHealth) {

        this.enemyHealth = enemyHealth;
    }

    // method to get enemies weapon
    public void setEnemyWeapon(String enemyWeapon) {
        this.enemyWeapon = enemyWeapon;
    }

    // method to set enemy armor
    public void setEnemyArmor(String enemyArmor) {
        this.enemyArmor = enemyArmor;
    }

    // method to get enemies health
    public int getEnemyHealth() {
        return enemyHealth;
    }

    // method to get enemies weapon
    public String getEnemyWeapon() {
        return enemyWeapon;
    }

    // method to get enemies armor
    public String getEnemyArmor() {
        return enemyArmor;
    }

}
