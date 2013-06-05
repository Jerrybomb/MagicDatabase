import java.util.Scanner;

/*
 Ian Ostrowski
 Computer Science 20
 2012-2013 Semester two
 Centennial High School
 */
/*
 Ryan Butler
  Computer Science 30
  2012-2013 Semester 30
  Centennial High School
 */
public class MagicInterface 
{
	public static Scanner kbReader;
	private static String cardName;
	public static void main (String[]args)
	{
		
		int menuOption;
		System.out.println("What would you like to do?");
		System.out.println("");
		System.out.println("1. Add a card");
		System.out.println("2. Retrieve a card");
		System.out.println("3. Quit");
		System.out.println("");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			MagicInput();
			
		}
		else if (menuOption == 2)
		{
			MagicOutput();
			
		}
		else if (menuOption == 3)
		{
			return;
		}
	}
	
	public static void MagicInput()
	{
		int typeOption;
		
		System.out.println("Add a card:");
		System.out.println("");
		System.out.println("What type of card are you adding?");
		System.out.println("1. Creature");
		System.out.println("2. Sorcery");
		System.out.println("3. Instant");
		System.out.println("4. Enchantment");
		System.out.println("5. Artifact");
		System.out.println("6. Land");
		kbReader = new Scanner(System.in);
		typeOption = kbReader.nextInt();
		
		if (typeOption == 1)
		{
			CreatureInput();
		}
		else if (typeOption == 2)
		{
			SorceryInput();
		}
		else if (typeOption == 3)
		{
			InstantInput();
		}
		else if (typeOption == 4)
		{
			EnchantmentInput();
		}
		else if (typeOption == 5)
		{
			ArtifactInput();
		}
		else if (typeOption == 6)
		{
			LandInput();
		}
	}
	
	public static void CreatureInput()
	{
		int menuOption;
		String creatureName = null, creatureAbility = null, creatureType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0, power = 0, toughness = 0;
		
		Creature Cr1 = new Creature(creatureName, creatureAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, power, toughness, creatureType);

		System.out.println("Creature name: ");
		kbReader = new Scanner(System.in);
		creatureName = kbReader.nextLine();
		Cr1.setName(creatureName);
		
		System.out.println("Creature ability: ");
		kbReader = new Scanner(System.in);
		creatureAbility = kbReader.nextLine();
		Cr1.setAbility(creatureAbility);
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		Cr1.setRedManaCost(redManaCost);
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		Cr1.setBlueManaCost(blueManaCost);
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		Cr1.setGreenManaCost(greenManaCost);
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		Cr1.setWhiteManaCost(whiteManaCost);
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		Cr1.setBlackManaCost(blackManaCost);
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		Cr1.setColourlessManaCost(colourlessManaCost);
		
		System.out.println("Creature's power: ");
		kbReader = new Scanner(System.in);
		power = kbReader.nextInt();
		Cr1.setPower(power);
		
		System.out.println("Creature's toughness: ");
		kbReader = new Scanner(System.in);
		toughness = kbReader.nextInt();
		Cr1.setToughness(toughness);
		
		System.out.println("Creature type: ");
		kbReader = new Scanner(System.in);
		creatureType = kbReader.nextLine();
		Cr1.setCreatureType(creatureType);
		
		//Return to main menu
		System.out.println("");
		System.out.println("Return to menu?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			main(null);
		}
		else if (menuOption == 2)
		{
			return;
		}
	}
	public static void SorceryInput()
	{
		int menuOption;
		String sorceryName = null, sorceryAbility = null, sorceryType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		
		Sorcery Sr1 = new Sorcery(sorceryName, sorceryAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, sorceryType);

		System.out.println("Sorcery name: ");
		kbReader = new Scanner(System.in);
		sorceryName = kbReader.nextLine();
		Sr1.setName(sorceryName);
		
		System.out.println("Sorcery ability: ");
		kbReader = new Scanner(System.in);
		sorceryAbility = kbReader.nextLine();
		Sr1.setAbility(sorceryAbility);

		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		Sr1.setRedManaCost(redManaCost);
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		Sr1.setBlueManaCost(blueManaCost);
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		Sr1.setGreenManaCost(greenManaCost);
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		Sr1.setWhiteManaCost(whiteManaCost);
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		Sr1.setBlackManaCost(blackManaCost);
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		Sr1.setColourlessManaCost(colourlessManaCost);
		
		System.out.println("Sorcery type: ");
		kbReader = new Scanner(System.in);
		sorceryType = kbReader.nextLine();
					
		//Return to main menu
		System.out.println("");
		System.out.println("Return to menu?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			main(null);
		}
		else if (menuOption == 2)
		{
			return;
		}
	}
	public static void InstantInput()
	{
		int menuOption;
		String instantName = null, instantAbility = null, instantType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		
		Instant In1 = new Instant(instantName, instantAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, instantType);

		System.out.println("Instant name: ");
		kbReader = new Scanner(System.in);
		instantName = kbReader.nextLine();
		In1.setName(instantName);
		
		System.out.println("Instant ability: ");
		kbReader = new Scanner(System.in);
		instantAbility = kbReader.nextLine();
		In1.setAbility(instantAbility);

		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		In1.setRedManaCost(redManaCost);
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		In1.setBlueManaCost(blueManaCost);
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		In1.setGreenManaCost(greenManaCost);
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		In1.setWhiteManaCost(whiteManaCost);
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		In1.setBlackManaCost(blackManaCost);
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		In1.setColourlessManaCost(colourlessManaCost);
		
		//Return to main menu
		System.out.println("");
		System.out.println("Return to menu?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			main(null);
		}
		else if (menuOption == 2)
		{
			return;
		}
	}
	public static void EnchantmentInput()
	{
		int menuOption;
		String enchantmentName = null, enchantmentAbility = null, enchantmentType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		
		Enchantment En1 = new Enchantment(enchantmentName, enchantmentAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, enchantmentType);

		System.out.println("Enchantment name: ");
		kbReader = new Scanner(System.in);
		enchantmentName = kbReader.nextLine();
		En1.setName(enchantmentName);
		
		System.out.println("Enchantment ability: ");
		kbReader = new Scanner(System.in);
		enchantmentAbility = kbReader.nextLine();
		En1.setAbility(enchantmentAbility);
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		En1.setRedManaCost(redManaCost);
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		En1.setBlueManaCost(blueManaCost);
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		En1.setGreenManaCost(greenManaCost);
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		En1.setWhiteManaCost(whiteManaCost);
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		En1.setBlackManaCost(blackManaCost);
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		En1.setColourlessManaCost(colourlessManaCost);
		
		System.out.println("Enchantment type: ");
		kbReader = new Scanner(System.in);
		enchantmentType = kbReader.nextLine();
		En1.setEnchantType(enchantmentType);

		//Return to main menu
		System.out.println("");
		System.out.println("Return to menu?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			main(null);
		}
		else if (menuOption == 2)
		{
			return;
		}
	}
	public static void ArtifactInput()
	{
		int menuOption;
		String artifactName = null, artifactAbility = null, artifactType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		
		Artifact Ar1 = new Artifact(artifactName, artifactAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, artifactType);

		System.out.println("Artifact name: ");
		kbReader = new Scanner(System.in);
		artifactName = kbReader.nextLine();
		Ar1.setName(artifactName);
		
		System.out.println("Artifact ability: ");
		kbReader = new Scanner(System.in);
		artifactAbility = kbReader.nextLine();
		Ar1.setAbility(artifactAbility);
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		Ar1.setRedManaCost(redManaCost);
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		Ar1.setBlueManaCost(blueManaCost);
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		Ar1.setGreenManaCost(greenManaCost);
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		Ar1.setWhiteManaCost(whiteManaCost);
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		Ar1.setBlackManaCost(blackManaCost);
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		Ar1.setColourlessManaCost(colourlessManaCost);
		
		System.out.println("Artifact type: ");
		kbReader = new Scanner(System.in);
		artifactType = kbReader.nextLine();
		Ar1.setColourlessManaCost(colourlessManaCost);
				
		//Return to main menu
		System.out.println("");
		System.out.println("Return to menu?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			main(null);
		}
		else if (menuOption == 2)
		{
			return;
		}
	}
	public static void LandInput()
	{
		int menuOption;
		String landName = null, landAbility = null, landType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		
		Land Ln1 = new Land(landName, landAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, landType);

		System.out.println("Land name: ");
		kbReader = new Scanner(System.in);
		landName = kbReader.nextLine();
		Ln1.setName(landName);
		
		System.out.println("Land ability: ");
		kbReader = new Scanner(System.in);
		landAbility = kbReader.nextLine();
		Ln1.setAbility(landAbility);
		
		System.out.println("Land type: ");
		kbReader = new Scanner(System.in);
		landType = kbReader.nextLine();
		Ln1.setLandType(landType);
				
		//Return to main menu
		System.out.println("");
		System.out.println("Return to menu?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			main(null);
		}
		else if (menuOption == 2)
		{
			return;
		}
	}

	public static void MagicOutput()
	{
		int menuOption;
		
		System.out.println("Retrieve a card:");
		System.out.println("");
		System.out.println("What is the type of card you are looking for?");
		System.out.println("1. Creature");
		System.out.println("2. Sorcery");
		System.out.println("3. Instant");
		System.out.println("4. Enchantment");
		System.out.println("5. Artifact");
		System.out.println("6. Land");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();

		if (menuOption == 1)
		{
			CreatureOutput();
		}
		
		else if (menuOption == 2)
		{
			SorceryOutput();
		}
		
		else if (menuOption == 3)
		{
			InstantOutput();
		}
		
		else if (menuOption == 4)
		{
			EnchantmentOutput();
		}
		
		else if (menuOption == 5)
		{
			ArtifactOutput();
		}
		
		else if (menuOption == 6)
		{
			LandOutput();
		}
			
	}
	public static void CreatureOutput()
	{
		int menuOption;
		System.out.println("Please enter the creature card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();	
		if (cardName == (((Card) Creature.Cr1).getName()))
		{
			System.out.println("Creature Card Information: ");
			System.out.println("Name: " + ((Card) Creature.Cr1).getName());
			System.out.println("Ability: " + ((Card)Creature.Cr1).getAbility());
			System.out.print("Mana cost: "); 
			System.out.println("");
		}
		else if (cardName != ((Card) Creature.Cr1).getName())
		{
			System.out.println("No card of that name has been saved.");
			System.out.println("Would you like to save this card now?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			kbReader = new Scanner(System.in);
			menuOption = kbReader.nextInt();
			if (menuOption == 1)
			{
				CreatureInput();
			}
			else if (menuOption == 2)
			{
				return;
			}
		}
		//Return to main menu
		System.out.println("");
		System.out.println("Return to menu?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			main(null);
		}
		else if (menuOption == 2)
		{
			return;
		}	
	}
	public static void SorceryOutput()
	{
		int menuOption;
		System.out.println("Please enter the sorcery card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();
		if (cardName == Sr1.Card.getName())
		{
			
		}
		else if (cardName != Card.getName())
		{
			System.out.println("No card of that type has been saved.");
			System.out.println("Would you like to save this card now?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			kbReader = new Scanner(System.in);
			menuOption = kbReader.nextInt();
			if (menuOption == 1)
			{
				SorceryInput();
			}
			else if (menuOption == 2)
			{
				return;
			}
		}
		
	}
	public static void InstantOutput()
	{
		int menuOption;
		System.out.println("Please enter the instant card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();
		if (cardName == Card.getName())
		{
			
		}
		else if (cardName != Card.getName())
		{
			System.out.println("No card of that type has been saved.");
			System.out.println("Would you like to save this card now?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			kbReader = new Scanner(System.in);
			menuOption = kbReader.nextInt();
			if (menuOption == 1)
			{
				InstantInput();
			}
			else if (menuOption == 2)
			{
				return;
			}
		}
	}
	public static void EnchantmentOutput()
	{
		int menuOption;
		System.out.println("Please enter the enchantment card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();
		if (cardName == Card.getName())
		{
			
		}
		else if (cardName != Card.getName())
		{
			System.out.println("No card with that ability has been saved.");
			System.out.println("Would you like to save this card now?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			kbReader = new Scanner(System.in);
			menuOption = kbReader.nextInt();
			if (menuOption == 1)
			{
				EnchantmentInput();
			}
			else if (menuOption == 2)
			{
				return;
			}
		}
		
	}
	public static void ArtifactOutput()
	{
		int menuOption;
		System.out.println("Please enter the artifact card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();
		if (cardName == Card.getName())
		{
			
		}
		else if (cardName != Card.getName())
		{
			System.out.println("No card with that ability has been saved.");
			System.out.println("Would you like to save this card now?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			kbReader = new Scanner(System.in);
			menuOption = kbReader.nextInt();
			if (menuOption == 1)
			{
				ArtifactInput();
			}
			else if (menuOption == 2)
			{
				return;
			}
		}
	}
	public static void LandOutput()
	{
		int menuOption;
		System.out.println("Please enter the land card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();
		if (cardName == Card.getName())
		{
			System.out.println("Land name: " + Card.getName());
			System.out.println("Land ability: " + Card.getAbility());
			System.out.println("Land Mana Cost: ");Card.totalManaCost();
			System.out.println("Land type: " + Land.getLandType());
		}
		else if (cardName != Card.getName())
		{
			System.out.println("No card of that type has been saved.");
			System.out.println("Would you like to save this card now?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			kbReader = new Scanner(System.in);
			menuOption = kbReader.nextInt();
			if (menuOption == 1)
			{
				LandInput();
			}
			else if (menuOption == 2)
			{
				return;
			}
		}
		
	}		
}


