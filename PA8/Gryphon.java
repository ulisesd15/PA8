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
 * (One of three winged monsters that can be created in the game)
 *
 * Bugs: (a list of bugs and other problems)
 *
 * @author (Ulises Duran)
 */
public class Gryphon extends Monster {

    /**
    * (calls Monster's no-arg constructor)
    *
    */
    public Gryphon() {
        super();
    }

    /**
    * (sets the sage, vitality, and power in its superclass)
    *
    * @param (Monster monster)(monster being eaten by Gryphon)
    */

    public Gryphon(int age, double vitality, double power) {
        super(age, vitality, power);

    }
    /**
    * (When a Gryphon rests, they gain 20 power. Add 20 to the power field.
    * ferocius when fully rested)
    *
    * @param (Monster monster)(monster being eaten by Gryphon)
    */
    
    public void rest() {
        this.setPower(this.getPower() + 20);



    }

    /**
    * (When a Gryphon captures and eats another monster, they gain half of the
    * power of the monster being eaten. Take the power of the input Monster,
    * divide it by 2 and add it to the current Gryphon’s power)
    *
    * @param (Monster monster)(monster being eaten by Gryphon)
    */

    public void strafe(Monster monster) {
        double power = monster.getPower();
        double newPower = power / 2;
        this.setPower(this.getPower() + newPower);
        monster.setPower(0);
    }
}
