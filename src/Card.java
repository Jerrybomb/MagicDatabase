
public class Card {

		
	private String Name="";
	private String Ability="";
	
	private int AbilityManaCost;
	private int ManaCost;
	
	public Card(String name, String ability,
			int abilityManaCost, int manaCost) {
		super();
		Name = name;
		Ability = ability;
		AbilityManaCost = abilityManaCost;
		ManaCost = manaCost;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAbility() {
		return Ability;
	}

	public void setAbility(String ability) {
		Ability = ability;
	}

	public int getAbilityManaCost() {
		return AbilityManaCost;
	}

	public void setAbilityManaCost(int abilityManaCost) {
		AbilityManaCost = abilityManaCost;
	}

	public int getManaCost() {
		return ManaCost;
	}

	public void setManaCost(int manaCost) {
		ManaCost = manaCost;
	}

			
}
