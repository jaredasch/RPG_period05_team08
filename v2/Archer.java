public class Archer extends Protagonist {
	private static final int ARCHER_HEALTH = 125;
    private static final int ARCHER_STRENGTH = 100;
    private static final int ARCHER_DEFENSE = 30;
    private static final double ARCHER_ATTACK = 0.5;

	public Archer(String name){
		super(name, ARCHER_HEALTH, ARCHER_STRENGTH, ARCHER_DEFENSE, ARCHER_ATTACK);
	}
}