
public class Enchantment extends Card {

	private String EnchantType="";

	public Enchantment(String name, String ability,
			int abilityManaCost, int manaCost, String enchantType) {
		super(name, ability, abilityManaCost, manaCost);
		EnchantType = enchantType;
	}

	public String getEnchantType() {
		return EnchantType;
	}

	public void setEnchantType(String enchantType) {
		EnchantType = enchantType;
	}
	
	
}
