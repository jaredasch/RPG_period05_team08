public class Monster extends Character {    
    private static final int MONSTER_HEALTH = 150;
    private static final int MONSTER_DEFENSE = 20;
    private static final double MONSTER_ATTACK = 1;
    private static final int MAX_MONSTER_STRENGTH = 65;
    private static final int MIN_MONSTER_STRENGTH = 20;

    /**
    *   Calls the constructor of the Character superclass using constants specified in the class;
    */

    public Monster(){
        super(MONSTER_HEALTH, (int) (Math.random() * (MAX_MONSTER_STRENGTH - MIN_MONSTER_STRENGTH) + MIN_MONSTER_STRENGTH), MONSTER_DEFENSE, MONSTER_ATTACK);
    }

    public Monster(int healthP, int strengthP, int defenseP, double attackP){
        super(healthP, strengthP, defenseP, attackP);
    }

    public String toString(){
        return  "[Monster with Health: " + health + "]";
    }
}