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
	public static String creatureSave;
	public static String sorcerySave;
	public static String instantSave;
	public static String enchantmentSave;
	public static String artifactSave;
	public static String landSave;	
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
		String creatureName, creatureAbility, creatureType;
		int redManaCost,blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, power, toughness;
		
		System.out.println("Creature name: ");
		kbReader = new Scanner(System.in);
		creatureName = kbReader.nextLine();
		
		System.out.println("Creature ability: ");
		kbReader = new Scanner(System.in);
		creatureAbility = kbReader.nextLine();
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		
		System.out.println("Creature's power: ");
		kbReader = new Scanner(System.in);
		power = kbReader.nextInt();
		
		System.out.println("Creature's toughness: ");
		kbReader = new Scanner(System.in);
		toughness = kbReader.nextInt();
		
		System.out.println("Creature type: ");
		kbReader = new Scanner(System.in);
		creatureType = kbReader.nextLine();
		
		creatureSave = creatureName;
		Creature creatureSave = new Creature(creatureName, creatureAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, power, toughness, creatureType);
		
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
		String sorceryName, sorceryAbility, sorceryType;
		int redManaCost,blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost;
		
		System.out.println("Sorcery name: ");
		kbReader = new Scanner(System.in);
		sorceryName = kbReader.nextLine();
		
		System.out.println("Sorcery ability: ");
		kbReader = new Scanner(System.in);
		sorceryAbility = kbReader.nextLine();
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		
		System.out.println("Sorcery type: ");
		kbReader = new Scanner(System.in);
		sorceryType = kbReader.nextLine();
	
		sorcerySave = sorceryName;
		
		Sorcery sorcerySave = new Sorcery(sorceryName, sorceryAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, sorceryType);
		
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
		String instantName, instantAbility, instantType;
		int redManaCost,blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost;
		
		System.out.println("Instant name: ");
		kbReader = new Scanner(System.in);
		instantName = kbReader.nextLine();
		
		System.out.println("Instant ability: ");
		kbReader = new Scanner(System.in);
		instantAbility = kbReader.nextLine();
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		
		System.out.println("Instant type: ");
		kbReader = new Scanner(System.in);
		instantType = kbReader.nextLine();
	
		instantSave = instantName;
		
		Instant In1 = new Instant(instantName, instantAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, instantType);
	
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
		String enchantmentName, enchantmentAbility, enchantmentType;
		int redManaCost,blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost;
		
		System.out.println("Enchantment name: ");
		kbReader = new Scanner(System.in);
		enchantmentName = kbReader.nextLine();
		
		System.out.println("Enchantment ability: ");
		kbReader = new Scanner(System.in);
		enchantmentAbility = kbReader.nextLine();
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		
		System.out.println("Enchantment type: ");
		kbReader = new Scanner(System.in);
		enchantmentType = kbReader.nextLine();
		
		System.out.println("What would you like this Enchantment saved as?");
		kbReader = new Scanner(System.in);
		enchantmentSave = enchantmentName;
		
		Enchantment En1 = new Enchantment(enchantmentName, enchantmentAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, enchantmentType);
		
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
		String artifactName, artifactAbility, artifactType;
		int redManaCost,blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost;
		
		System.out.println("Artifact name: ");
		kbReader = new Scanner(System.in);
		artifactName = kbReader.nextLine();
		
		System.out.println("Artifact ability: ");
		kbReader = new Scanner(System.in);
		artifactAbility = kbReader.nextLine();
		
		System.out.println("Red mana cost: ");
		kbReader = new Scanner(System.in);
		redManaCost = kbReader.nextInt();
		
		System.out.println("Blue mana cost: ");
		kbReader = new Scanner(System.in);
		blueManaCost = kbReader.nextInt();
		
		System.out.println("Green mana cost: ");
		kbReader = new Scanner(System.in);
		greenManaCost = kbReader.nextInt();
		
		System.out.println("White mana cost: ");
		kbReader = new Scanner(System.in);
		whiteManaCost = kbReader.nextInt();
		
		System.out.println("Black mana cost: ");
		kbReader = new Scanner(System.in);
		blackManaCost = kbReader.nextInt();
		
		System.out.println("Colourless mana cost: ");
		kbReader = new Scanner(System.in);
		colourlessManaCost = kbReader.nextInt();
		
		System.out.println("Artifact type: ");
		kbReader = new Scanner(System.in);
		artifactType = kbReader.nextLine();
		
		artifactSave = artifactName;
		
		Artifact Ar1 = new Artifact(artifactName, artifactAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, artifactType);
		
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
		String landName, landAbility, landType;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		
		System.out.println("Land name: ");
		kbReader = new Scanner(System.in);
		landName = kbReader.nextLine();
		
		System.out.println("Land ability: ");
		kbReader = new Scanner(System.in);
		landAbility = kbReader.nextLine();
		
		System.out.println("Land type: ");
		kbReader = new Scanner(System.in);
		landType = kbReader.nextLine();

		landSave = landName;
		
		Land Ln1 = new Land(landName, landAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, landType);
		
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
		if (cardName == creatureSave)
		{
			System.out.println();
			
		}
		else if (cardName != creatureSave)
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
		
	}
	public static void SorceryOutput()
	{
		int menuOption;
		System.out.println("Please enter the sorcery card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();
		if (cardName == Card.class.toString())
		{
			
		}
		else if (cardName != Card.class.toString())
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
		if (cardName == Card.class.toString())
		{
			
		}
		else if (cardName != Card.class.toString())
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
		if (cardName == Card.class.toString())
		{
			
		}
		else if (cardName != Card.class.toString())
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
		if (cardName == Card.class.toString())
		{
			
		}
		else if (cardName != Card.class.toString())
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
		if (cardName == Card.class.toString())
		{
			
		}
		else if (cardName != Card.class.toString())
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


