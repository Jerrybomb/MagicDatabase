
public class Creature extends Card 
{

	//update PLOXURZ
	private int Power;
	private int Toughness;
	
	private String CreatureType="";

	public Creature(String name, String ability, int redManaCost, int blueManaCost, int greenManaCost,
			int whiteManaCost, int blackManaCost, int colourlessManaCost,
			int power, int toughness, String creatureType) 
	{
		super(name, ability, redManaCost, blueManaCost,
				greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost);
		Power = power;
		Toughness = toughness;
		CreatureType = creatureType;
	}

	public int getPower() 
	{
		return Power;
	}

	public void setPower(int power) 
	{
		Power = power;
	}

	public int getToughness() 
	{
		return Toughness;
	}

	public void setToughness(int toughness)
	{
		Toughness = toughness;
	}

	public String getCreatureType()
	{
		return CreatureType;
	}

	public void setCreatureType(String creatureType) 
	{
		CreatureType = creatureType;
	}	
}