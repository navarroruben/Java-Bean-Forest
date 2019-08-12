// Ruben Navarro
// Date: 03/30/2019
// COP3252
// Assignment 5
// InvalidDamageException.java

public class InvalidDamageException extends Exception {

    private int damage; // variable to keep track of damage

    public InvalidDamageException (int damage) {
        this.damage = damage;
    }
}


