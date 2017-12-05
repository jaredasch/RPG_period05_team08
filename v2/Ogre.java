public class Ogre extends Monster {
	private static final int OGRE_HEALTH = 125;
    private static final int OGRE_MAX_STRENGTH = 65;
    private static final int OGRE_MIN_STRENGTH = 20;
    private static final int OGRE_DEFENSE = 50;
    private static final double OGRE_ATTACK = 1.2;

	public Ogre(){
		super(OGRE_HEALTH, (int) (Math.random() * (OGRE_MAX_STRENGTH - OGRE_MIN_STRENGTH) + OGRE_MIN_STRENGTH), OGRE_DEFENSE, OGRE_ATTACK);
	}

	public String toString(){
		return  "[Ogre,  Health: " + health + "]";
	}
}