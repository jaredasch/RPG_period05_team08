public class Protagonist extends Character {
    private static final int PROTAGONIST_HEALTH = 125;
    private static final int PROTAGONIST_STRENGTH = 100;
    private static final int PROTAGONIST_DEFENSE = 40;
    private static final double PROTAGONIST_ATTACK = 0.4;

    private String name;

    /** 
     *    Calls the constructor of the Character superclass using constants specified in the class; 
     *    @param name the name the user wants to give the Protagonist
     */


    public Protagonist(String name){
        super(PROTAGONIST_HEALTH, PROTAGONIST_STRENGTH, PROTAGONIST_DEFENSE, PROTAGONIST_ATTACK);
        this.name = name;
    }

    /**
     *  Accessor for the name field
     */

    public String getName(){
        return name;
    }


    public String toString(){
        String result = " ";
        result	+="Name :" + name + ", " + "PROTAGONIST HEALTH :" +     
        PROTAGONIST_HEALTH + ", " + "PROTAGONIST STRENGTH :" + PROTAGONIST_STRENGTH + ", " + "PROTAGONIST DEFENSE:" + PROTAGONIST_DEFENSE +
        ", "+"PROTAGONIST_ATTACK:"+ PROTAGONIST_ATTACK;
        return result;}

    public static void main(String[] args) {
          Protagonist nemo = new Protagonist("nemo");
          System.out.println(nemo);
 
    }
}
