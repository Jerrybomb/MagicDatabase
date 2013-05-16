
public class Creature extends Card {

	private int Power;
	private int Toughness;
	
	private String CreatureType="";

	/**
	 * @param manaCost
	 * @param abilityManaCost
	 * @param name
	 * @param flavorText
	 * @param ability
	 * @param power
	 * @param toughness
	 * @param creatureType
	 */
	public Creature(int manaCost, int abilityManaCost, String name,
			String flavorText, String ability, int power, int toughness,
			String creatureType) {
		super(manaCost, abilityManaCost, name, flavorText, ability);
		Power = power;
		Toughness = toughness;
		CreatureType = creatureType;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public int getToughness() {
		return Toughness;
	}

	public void setToughness(int toughness) {
		Toughness = toughness;
	}

	public String getCreatureType() {
		return CreatureType;
	}

	public void setCreatureType(String creatureType) {
		CreatureType = creatureType;
	}
	
	
}
