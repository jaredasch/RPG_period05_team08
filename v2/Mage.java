public class Mage extends Protagonist {
	private static final int MAGE_HEALTH = 100;
    private static final int MAGE_STRENGTH = 80;
    private static final int MAGE_DEFENSE = 50;
    private static final double MAGE_ATTACK = 0.6;

	public Mage(String name){
		super(name, MAGE_HEALTH, MAGE_STRENGTH, MAGE_DEFENSE, MAGE_ATTACK);
	}

	public String toString(){
        return "{ Mage " + super.toString() + " }";
    }
}