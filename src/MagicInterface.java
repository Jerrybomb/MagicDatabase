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
{	//Global variables for input
	public static Scanner kbReader;
	private static String cardName;
	public static void main (String[]args)
	{	//Variables
		int menuOption;
		
		System.out.println("What would you like to do?");
		System.out.println("");
		System.out.println("1. Add a card");
		System.out.println("2. Retrieve a card");
		System.out.println("3. Quit");
		System.out.println("");
		//Input
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			MagicInput();//Option for card input
			
		}
		else if (menuOption == 2)
		{
			MagicOutput();//Option for card output
			
		}
		else if (menuOption == 3)
		{
			return;//Terminates program
		}
	}
	
	public static void MagicInput()
	{//Variables
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
		//Sets options for each card type's input
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
	{//Variables
		int menuOption;
		String creatureName = null, creatureAbility = null, creatureType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0, power = 0, toughness = 0;
		//Object
		Creature Cr1 = new Creature(creatureName, creatureAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, power, toughness, creatureType);
		//Input
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
	{	//Variables
		int menuOption;
		String sorceryName = null, sorceryAbility = null, sorceryType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		//Object
		Sorcery Sr1 = new Sorcery(sorceryName, sorceryAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, sorceryType);
		//Input
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
	{	//Variables
		int menuOption;
		String instantName = null, instantAbility = null, instantType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		//Object
		Instant In1 = new Instant(instantName, instantAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, instantType);
		//Input
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
	{	//Variables
		int menuOption;
		String enchantmentName = null, enchantmentAbility = null, enchantmentType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		//Object
		Enchantment En1 = new Enchantment(enchantmentName, enchantmentAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, enchantmentType);
		//Variables
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
	{	//Variables
		int menuOption;
		String artifactName = null, artifactAbility = null, artifactType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		//Object
		Artifact Ar1 = new Artifact(artifactName, artifactAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, artifactType);
		//Input
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
	{	//Variables
		int menuOption;
		String landName = null, landAbility = null, landType = null;
		int redManaCost = 0,blueManaCost = 0, greenManaCost = 0, whiteManaCost = 0, blackManaCost = 0, colourlessManaCost = 0;
		//Object
		Land Ln1 = new Land(landName, landAbility, redManaCost, blueManaCost, greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost, landType);
		//Input
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
	{	//Variables
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
		//Menu for card type outputs
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
	{	//Variables
		int menuOption;
		System.out.println("Please enter the creature card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();	
		if (cardName.equals(((Card) Creature.Cr1).getName()));//Checks whether input equals stored name
		{//If the check succeeds, the card's information is printed
			System.out.println("Creature Card Information: ");
			System.out.println("Name: " + ((Card) Creature.Cr1).getName());
			System.out.println("Ability: " + ((Card)Creature.Cr1).getAbility());
			System.out.print("Mana cost: "); 
			System.out.println("");
		}
		if (!cardName.equals(((Card) Creature.Cr1).getName()));
		{//If not, gives a prompt to enter the card type's input
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
	{	//Variables
		int menuOption;
		System.out.println("Please enter the sorcery card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();	
		if (cardName.equals(((Card) Sorcery.Sr1).getName()));//Checks whether input equals stored name
		{//If the check succeeds, the card's information is printed
			System.out.println("Sorcery Card Information: ");
			System.out.println("Name: " + ((Card) Sorcery.Sr1).getName());
			System.out.println("Ability: " + ((Card)Sorcery.Sr1).getAbility());
			System.out.print("Mana cost: "); 
			System.out.println("");
		}
		if (!cardName.equals(((Card) Sorcery.Sr1).getName()));
		{//If not, gives a prompt to enter the card type's input
			System.out.println("No card of that name has been saved.");
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
	public static void InstantOutput()
	{	//Variables
		int menuOption;
		System.out.println("Please enter the instant card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();	
		if (cardName.equals(((Card) Instant.In1).getName()));//Checks whether input equals stored name
		{//If the check succeeds, the card's information is printed
			System.out.println("Instant Card Information: ");
			System.out.println("Name: " + ((Card) Instant.In1).getName());
			System.out.println("Ability: " + ((Card)Instant.In1).getAbility());
			System.out.print("Mana cost: "); 
			System.out.println("");
		}
		if (!cardName.equals(((Card) Instant.In1).getName()));
		{//If not, gives a prompt to enter the card type's input
			System.out.println("No card of that name has been saved.");
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
	public static void EnchantmentOutput()
	{	//Variables
		int menuOption;
		System.out.println("Please enter the enchantment card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();	
		if (cardName.equals(((Card) Enchantment.En1).getName()));//Checks whether input equals stored name
		{//If the check succeeds, the card's information is printed
			System.out.println("Enchantment Card Information: ");
			System.out.println("Name: " + ((Card) Enchantment.En1).getName());
			System.out.println("Ability: " + ((Card)Enchantment.En1).getAbility());
			System.out.print("Mana cost: "); 
			System.out.println("");
		}
		if (!cardName.equals(((Card) Enchantment.En1).getName()));
		{//If not, gives a prompt to enter the card type's input
			System.out.println("No card of that name has been saved.");
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
	public static void ArtifactOutput()
	{	//Variables
		int menuOption;
		System.out.println("Please enter the artifact card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();	
		if (cardName.equals(((Card) Artifact.Ar1).getName()));//Checks whether input equals stored name
		{//If the check succeeds, the card's information is printed
			System.out.println("Artifact Card Information: ");
			System.out.println("Name: " + ((Card) Artifact.Ar1).getName());
			System.out.println("Ability: " + ((Card)Artifact.Ar1).getAbility());
			System.out.print("Mana cost: "); 
			System.out.println("");
		}
		if (!cardName.equals(((Card) Artifact.Ar1).getName()));
		{//If not, gives a prompt to enter the card type's input
			System.out.println("No card of that name has been saved.");
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
	public static void LandOutput()
	{	//Variables
		int menuOption;
		System.out.println("Please enter the land card's save name.");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();	
		if (cardName.equals(((Card) Land.Ln1).getName()));//Checks whether input equals stored name
		{//If the check succeeds, the card's information is printed
			System.out.println("Land Card Information: ");
			System.out.println("Name: " + ((Card) Land.Ln1).getName());
			System.out.println("Ability: " + ((Card)Land.Ln1).getAbility());
			System.out.print("Mana cost: "); 
			System.out.println("");
		}
		if (!cardName.equals(((Card) Land.Ln1).getName()));
		{//If not, gives a prompt to enter the card type's input
			System.out.println("No card of that name has been saved.");
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
}


