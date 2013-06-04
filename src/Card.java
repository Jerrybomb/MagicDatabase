
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
	
	public void totalManaCost()
	{
		int r = getRedManaCost();
		int u = getBlueManaCost();
		int g = getGreenManaCost();
		int w = getWhiteManaCost();
		int b = getBlackManaCost();
		
		System.out.print(getColourlessManaCost());
		
		if (r >= 0)
		{
			System.out.print("R");
			r = r - 1;	
		}
		
		if (u >= 0)
		{
			System.out.print("U");
			u = u - 1;
		}
		
		if (g >= 0)
		{
			System.out.print("G");
			g = g - 1;
		}
		
		if (w >= 0)
		{
			System.out.print("W");
			w = w - 1;
		}
		
		if (b >= 0)
		{
			System.out.print("B");
			b = b - 1;
		}
	}
	
}
	
	