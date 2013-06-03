
public class Instant extends Card 
{

	private String InstantAbility="";

	public Instant(String name, String ability, int redManaCost,
			int blueManaCost, int greenManaCost, int whiteManaCost,
			int blackManaCost, int colourlessManaCost, String instantAbility) 
	{
		super(name, ability, redManaCost, blueManaCost, greenManaCost,
				whiteManaCost, blackManaCost, colourlessManaCost);
		InstantAbility = instantAbility;
	}
	
	public String getInstantAbility()
	{
		return InstantAbility;
	}

	public void setInstantAbility(String instantAbility) 
	{
		InstantAbility = instantAbility;
	}
	
	
	
}
