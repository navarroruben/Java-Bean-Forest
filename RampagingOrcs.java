// Ruben Navarro
// Date: 03/30/2019
// COP3252
// Assignment 5
// RampagingOrcs.java

public class RampagingOrcs extends Enemy {


    // RampagingOrcs constructor
    public RampagingOrcs() {
        super(0, 0, "", "");
        enemyHealth = rnum.nextInt(90 - 50 + 1) + 50;
        setEnemyHealth(enemyHealth);
        enemyWeapon = "2Handed Axe";
        setEnemyWeapon(enemyWeapon);
        enemyArmor = "Plate";
        setEnemyArmor(enemyArmor);
    }

    // overidden fight method specifically for rampagingorcs
    @Override
    public int fight() {
        hit = rnum.nextInt(10);
        return hit;
    }

    // overidden tostring method specifically for rampagingorcs
    @Override
    public String toString() {
        return "Rampaging Orc";
    }
}
