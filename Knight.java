// Ruben Navarro
// Date: 03/30/2019
// COP3252
// Assignment 5
// Knight.java

public class Knight {

    private int kHealth;     // variable to hold knights health
    private String kName;    // variable to hold knight name
    private String kWeapon;  // variable to hold knight weapon
    private String kArmor;   // variable to hold knight armor

    // Knight constructor
    public Knight (int kHealth, String kName, String kWeapon, String kArmor) {
        this.kHealth = kHealth;
        this.kName = kName;
        this.kWeapon = kWeapon;
        this.kArmor = kArmor;
    }

    // Custom exception to check if damage dealt is less than 0
    public void takeDamage(int damage) throws InvalidDamageException {
        if (damage < 0)
            throw new InvalidDamageException(damage);
    }

    // method to set knights health
    public void setKHealth (int kHealth) {
        this.kHealth = kHealth;
    }

    // method to set knights name
    public void setKName (String kName) {
        this.kName = kName;
    }

    // method to set knights weapon
    public void setKWeapon (String kWeapon) {
        this.kWeapon = kWeapon;
    }

    // method to set knights armor
    public void setKArmor (String kArmor) {
        this.kArmor = kArmor;
    }

    // method to get knights health
    public int getKHealth() {
        return kHealth;
    }

    // method to get knights name
    public String getKName() {
        return kName;
    }

    //method to get knights weapon
    public String getKWeapon() {
        return kWeapon;
    }

    //method to get knights armor
    public String getKArmor() {
        return kArmor;
    }

}
