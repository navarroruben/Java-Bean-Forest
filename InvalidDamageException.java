/**********************/
// Date: March 30, 2019
// Name: Ruben Navarro
// Java-Bean Forest
/**********************/

public class InvalidDamageException extends Exception {

    private int damage; // variable to keep track of damage

    public InvalidDamageException (int damage) {
        this.damage = damage;
    }
}
