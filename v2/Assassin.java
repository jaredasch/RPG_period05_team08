public class Assassin extends Protagonist {
	private static final int ASSASSIN_HEALTH = 80;
    private static final int ASSASSIN_STRENGTH = 120;
    private static final int ASSASSIN_DEFENSE = 30;
    private static final double ASSASSIN_ATTACK = 0.6;

	public Assassin(String name){
		super(name, ASSASSIN_HEALTH, ASSASSIN_STRENGTH, ASSASSIN_DEFENSE, ASSASSIN_ATTACK);
	}
}