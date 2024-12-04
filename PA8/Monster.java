///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              (Monster.java)
// Files:              (Monster.java, Wraith.java, Werewolf.java, Vampire.java,
//                      Phoenix.java)
// Quarter:            (CSE11) (Fall) (2024)
//
// Author:             (Ulises Duran)
// Email:              (ulisesd404@gmail.com)
// Instructor's Name:  (B. Ochoa)
//
///////////////////////////////////////////////////////////////////////////////
//                   
//
// Persons:          N/A
//
// Online sources:   N/A
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * (superclass for most of the other classes, initializes core characteristics
 * of a Monster and definees the default behavior of specific methods,
 * some overriden by subclasses)
 *
 * Bugs: (a list of bugs and other problems)
 *
 * @author (Ulises Duran)
 */
public class Monster {

    //constants


    //instance variables
    private int age;
    private double vitality;
    private double power;
    


    public Monster() {
        age = 0;
        vitality = 100.0;
        power = 10.0;


    }


    public Monster( int age, double vitality, double power) {
        this.age = age;
        this.vitality = vitality;
        this.power = power;
    }


    //getters and setters
    public int getAge() {
        return age;
    }

    public double getVitality() {
        return vitality;
    }

    public double getPower() {
        return power;
    }

    public void setVitality(double vitality) {
        this.vitality = vitality;
    }

    public void setPower(double power) {
        this.power = power;
    }
    /**
    * (only returns true only when the current object and the input monster
    * are of the same class, otherwise returns false, use getClass().getName()\
    * to get the class name and not override every time for subclassesd)
    *
    * @param (Monster monster) (current monster object))
    * @return (description of the return value)
    */

    public boolean sameSpecias(Monster monster) {
        return this.getClass().getName().equals(monster.getClass().getName());
    }

    /**
    * (creates the attack of a monster, generate a rabndom number from 1(inclusive)
    * to the power of the current object,(inclusive) and subtracts the vitality
    * of the input monster by the generated number, returns the generated number.)
    *
    * @param (Monster monster) (current monster object))
    * @return (description of the return value)
    */
    public double attack(Monster monster) {
        power = getPower();
        double damage = Math.random() * (power - 1) + 1;
        monster.setVitality(monster.getVitality() - damage);
        return damage;
        
    }
    /**
    * (returns the string representation of the Monster object, OVERRIDE,
    * retrns the string representation of a monster)
    *
    * @return (string representation of the Monster object)
    */
    @Override
    public String toString() {
        return "(" + getClass().getName() + ")" + " age: " + getAge() +
                "; vitality: " + getVitality() + "; power: " + getPower();
    }

    public abstract void rest();
    
}
