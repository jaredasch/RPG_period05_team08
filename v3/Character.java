public class Character {
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;

    /**
     *  Create a new character using given values
     *  @param healthP the health of of the character
     *  @param strengthP the strength of the character
     *  @param defenseP the defense of the character
     *  @param attackP the attack value of the character
     */

    public Character(int healthP, int strengthP, int defenseP, double attackP){
        health = healthP;
        strength = strengthP;
        defense = defenseP;
        attack = attackP;
    }

    /** 
     *   isAlive returns boolean indicating if the monster is alive based on if
     *   the health is greater tha 0
     */

    public boolean isAlive(){
        return health > 0;
    }

    /**
     *  Accessor for the defense field
     */

    public int getDefense(){
        return defense;
    }

    /** 
     *  Lower the health of the Monster object by a given int value
     *  @param damage how much to lower the the health of the Monster
     */

    public void lowerHP(int damage){
        health -= damage;
    }

    /**
     *  Attacks a Protagonist object and lowers its health
     *      o Calculates damage using this formula: calculates damage using this formula: damage = (strength * attack rating) - warrior defense
     *      o Damage is casted to an integer value
     *  @param p the Protagonist object the monster is to attack
     */


    public int attack(Character c){
       int damage = (int) (strength * attack) - c.getDefense();
       c.lowerHP(damage);
       return damage;
    }

    /**
     *  Half the character's defense and double its attack rating in preparation for a special attack
     */

    public void specialize(){
        defense /= 2;
        attack *= 2; 
    }

    /**
     *  Double the character's defense and half its attack rating in preparation for a normal attack
     */

    public void normalize(){
        defense *= 2;
        attack /= 2;
    }
}