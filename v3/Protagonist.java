public abstract class Protagonist extends Character {
    private static final int PROTAGONIST_HEALTH = 125;
    private static final int PROTAGONIST_STRENGTH = 100;
    private static final int PROTAGONIST_DEFENSE = 40;
    private static final double PROTAGONIST_ATTACK = 0.4;

    // "error: Protagonist is not abstract and does not override abstract method toString() in Protagonist" when the class is not abstract

    private String name;

    /**
     *    Calls the constructor of the Character superclass using constants specified in the class;
     *    @param name the name the user wants to give the Protagonist
     */

    public Protagonist(String name){
        super(PROTAGONIST_HEALTH, PROTAGONIST_STRENGTH, PROTAGONIST_DEFENSE, PROTAGONIST_ATTACK);
        this.name = name;
    }

    public Protagonist(String name, int healthP, int strengthP, int defenseP, double attackP){
        super(healthP, strengthP, defenseP, attackP);
        this.name = name;
    }

    /**
     *  Accessor for the name field
     */

    public String getName(){
        return name;
    }

    public abstract String toString();
}
