
public class Enchantment extends Card 
{

	private String EnchantType="";

	public Enchantment(String name, String ability, int abilityManaCost,
			int redManaCost, int blueManaCost, int greenManaCost,
			int whiteManaCost, int blackManaCost, int colourlessManaCost,
			String enchantType) 
	{
		super(name, ability, abilityManaCost, redManaCost, blueManaCost,
				greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost);
		EnchantType = enchantType;
	}

	public String getEnchantType()
	{
		return EnchantType;
	}

	public void setEnchantType(String enchantType)
	{
		EnchantType = enchantType;
	}


	
}
