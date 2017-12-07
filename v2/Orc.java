public class Orc extends Monster {
	private static final int ORC_HEALTH = 170;
	private static final int ORC_MAX_STRENGTH = 100;
	private static final int ORC_MIN_STRENGTH = 40;
	private static final int ORC_DEFENSE = 10;
	private static final double ORC_ATTACK = 1;

	public Orc(){
		super(ORC_HEALTH, (int) (Math.random() * (ORC_MAX_STRENGTH - ORC_MIN_STRENGTH) + ORC_MIN_STRENGTH), ORC_DEFENSE, ORC_ATTACK);
	}

	public String toString(){
		return  "{ Orc " + super.toString() + " }"; 
	}
}