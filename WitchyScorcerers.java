/**********************/
// Date: March 30, 2019
// Name: Ruben Navarro
// Java-Bean Forest
/**********************/

public class WitchyScorcerers extends Enemy {

    // WitchyScorcerers constructor
    public WitchyScorcerers() {
        super(0, 0, "", "");
        enemyHealth = rnum.nextInt(75 - 50 + 1) + 50; // randomly generate opponent health
        setEnemyHealth(enemyHealth);
        enemyWeapon = "1Handed Wand";                        // assigns weapon to enemy
        setEnemyWeapon(enemyWeapon);
        enemyArmor = "Cloth Robe";                           // assigns armor to enemy
        setEnemyArmor(enemyArmor);
    }

    // overidden fight method specifically for witchyscorcerers
    @Override
    public int fight() {
        hit = rnum.nextInt(14);
        return hit;
    }

    // overidden tostring specifically for witchyscorcerers
    @Override
    public String toString() {
        return "Witchy Scorcerer";
    }
}
