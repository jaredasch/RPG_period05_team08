public class Goblin extends Monster {
	private static final int GOBLIN_HEALTH = 50;
    private static final int GOBLIN_MAX_STRENGTH = 30;
    private static final int GOBLIN_MIN_STRENGTH = 10;
    private static final int GOBLIN_DEFENSE = 10;
    private static final double GOBLIN_ATTACK = 0.4;

	public Goblin(){
		super(GOBLIN_HEALTH, (int) (Math.random() * (GOBLIN_MAX_STRENGTH - GOBLIN_MIN_STRENGTH) + GOBLIN_MIN_STRENGTH), GOBLIN_DEFENSE, GOBLIN_ATTACK);
	}
}