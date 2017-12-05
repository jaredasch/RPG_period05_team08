public class Protagonist {
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double attack;

    /** 
     *    Constructor for Progaonist class
     *        o initializes all attributes (life=125, strength=100, defense=40, attack=0.4)
     *    @param name the name the user wants to give the Protagonist
     */


    public Protagonist(String name){
        this.name = name;
        health = 125;
        strength = 100;
        defense = 40;
        attack = 0.4;
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
     *  Accessor for the name field
     */

    public String getName(){
        return name;
    }

    /** 
     *  Lower the health of the Protagonist object by a given int value
     *  @param damage how much to lower the the health of the Protagonist
     */

    public void lowerHP(int damage){
        health -= damage;
    }

    /**
     *  Attacks a Monster object and lowers its health
     *      o Calculates damage using this formula: calculates damage using this formula: damage = (strength * attack rating) - monster defense
     *      o Damage is casted to an integer value
     *  @param m the Monster object the monster is to attack
     */

    public int attack(Monster m){
       int damage = (int) (strength * attack) - m.getDefense();
       m.lowerHP(damage);
       return damage;
    }

    

    public void specialize(){
        defense /= 2;
        attack *= 2; 
    }

    public void normalize(){
        defense *= 2;
        attack /= 2;
    }
}

/*

fields

name
life/health/HP as an int
strength as an int
defense as an int
attack rating as a double



methods

constructor
takes String input to name the Protagonist
initializes all attributes (eg, 125, 100, 40, 0.4)
isAlive  returns boolean indicating living or dead
getDefense
getName
lowerHP   takes an int parameter, decreases life attribute by that amount
attack
takes a Monster as a parameter
calculates damage using this formula: damage = (strength * attack rating) - monster defense
damage should be an integer value
specialize
prepares the Protagonist to perform a special attack
decreases defense attribute
increases attack attribute
normalize
prepares the Protagonist to perform a normal attack
resets defense attribute
resets attack attribute*/