// Ruben Navarro
// Date: 03/30/2019
// COP3252
// Assignment 5
// OracleOgres.java

public class OracleOgres extends Enemy {


    // OracleOgres constructor
    public OracleOgres() {
        super(0, 0, "", "");
        enemyHealth = rnum.nextInt(120 - 50 + 1) + 50;  // randomly generate enemy health
        setEnemyHealth(enemyHealth);
        enemyWeapon = "2Handed Staff";                         // assign weapon to enemy
        setEnemyWeapon(enemyWeapon);
        enemyArmor = "Cloth Robe";                             // assign armor to enemy
        setEnemyArmor(enemyArmor);
    }

    // overidden fight method specifically for oracleogres
    @Override
    public int fight() {
        hit = rnum.nextInt(12);
        return hit;
    }

    // overidden tostring method specifically for oracleogres
    @Override
    public String toString() {
        return "Oracle Ogre";
    }

}
