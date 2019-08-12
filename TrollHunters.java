/**********************/
// Date: March 30, 2019
// Name: Ruben Navarro
// Java-Bean Forest
/**********************/

public class TrollHunters extends Enemy {

    // TrollHunters constructor
    public TrollHunters() {
        super(0, 0, "", "");
        enemyHealth = rnum.nextInt(85 - 50 + 1) + 50;  // randomly generate opponent health
        setEnemyHealth(enemyHealth);
        enemyWeapon = "Bow and Arrows";                       // assign weapon to enemy
        setEnemyWeapon(enemyWeapon);
        enemyArmor = "Leather";                               // assign armor to enemy
        setEnemyArmor(enemyArmor);
    }

    // overidden fight method specifically for trollhunters
    @Override
    public int fight() {
        hit = rnum.nextInt(9);
        return hit;
    }

    // overidden tostring method specifically for trollhunters
    @Override
    public String toString() {
        return "Troll Hunter";
    }
}
