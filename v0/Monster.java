public class Monster {    
    private int health;
    private int strength;
    private int defense;
    private double attack;

    /** 
     *    Constructor for Monster class
     *        o initializes all attributes (life=150, defense=20, attack=1)
     *        o sets strength to a random number in range [20, 65)
     */

    public Monster(){
        health = 150;
        strength = (int) (Math.random() * 45 + 20);
        defense = 20;
        attack = 1;
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


    public int attack(Protagonist p){
       int damage = (int) (strength * attack) - p.getDefense();
       p.lowerHP(damage);
       return damage;
    }
}