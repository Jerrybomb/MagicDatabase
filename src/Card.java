
public class Card 
{

	//update PLOXURZ
	private String Name="";
	private String Ability="";
	
	private int RedManaCost;
	private int BlueManaCost;
	private int GreenManaCost;
	private int WhiteManaCost;
	private int BlackManaCost;
	private int ColourlessManaCost;
	
	public Card(String name, String ability, int redManaCost, int blueManaCost, int greenManaCost,
			int whiteManaCost, int blackManaCost, int colourlessManaCost) 
	{
		super();
		Name = name;
		Ability = ability;
		RedManaCost = redManaCost;
		BlueManaCost = blueManaCost;
		GreenManaCost = greenManaCost;
		WhiteManaCost = whiteManaCost;
		BlackManaCost = blackManaCost;
		ColourlessManaCost = colourlessManaCost;
	}
	
	public String getName() 
	
	{
		return Name;
	}
	public void setName(String name) 
	
	{
		Name = name;
	}
	public String getAbility() 
	
	{
		return Ability;
	}
	public void setAbility(String ability) 
	
	{
		Ability = ability;
	}

	public int getRedManaCost() 
	
	{
		return RedManaCost;
	}
	public void setRedManaCost(int redManaCost) 
	
	{
		RedManaCost = redManaCost;
	}
	public int getBlueManaCost() 
	
	{
		return BlueManaCost;
	}
	public void setBlueManaCost(int blueManaCost) 
	
	{
		BlueManaCost = blueManaCost;
	}
	public int getGreenManaCost() 
	
	{
		return GreenManaCost;
	}
	public void setGreenManaCost(int greenManaCost) 
	
	{
		GreenManaCost = greenManaCost;
	}
	public int getWhiteManaCost() 
	
	{
		return WhiteManaCost;
	}
	public void setWhiteManaCost(int whiteManaCost)
	
	{
		WhiteManaCost = whiteManaCost;
	}
	public int getBlackManaCost() 
	
	{
		return BlackManaCost;
	}
	public void setBlackManaCost(int blackManaCost) 
	
	{
		BlackManaCost = blackManaCost;
	}
	public int getColourlessManaCost() 
	
	{
		return ColourlessManaCost;
	}
	public void setColourlessManaCost(int colourlessManaCost) 
	
	{
		ColourlessManaCost = colourlessManaCost;
	}
	
	
	
}
	
	