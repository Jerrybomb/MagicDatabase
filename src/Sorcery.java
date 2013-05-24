
public class Sorcery extends Card
{

	private String SorceryAbility="";

	public Sorcery(String name, String ability, int redManaCost,
			int blueManaCost, int greenManaCost, int whiteManaCost,
			int blackManaCost, int colourlessManaCost, String sorceryAbility) 
	{
		super(name, ability, redManaCost, blueManaCost, greenManaCost,
				whiteManaCost, blackManaCost, colourlessManaCost);
		SorceryAbility = sorceryAbility;
	}

	public String getSorceryAbility() 
	{
		return SorceryAbility;
	}

	public void setSorceryAbility(String sorceryAbility) 
	{
		SorceryAbility = sorceryAbility;
	}
	
	
}
