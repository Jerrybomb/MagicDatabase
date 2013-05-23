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
		String menuOption = null;
		String cardType, cardName, cardSubtype, cardAbility;
		int r, u, g, w, b, x;
		System.out.println("Add a card:");
		System.out.println("");
		System.out.println("What type of card are you adding?");
		kbReader = new Scanner(System.in);
		cardType = kbReader.nextLine();
		System.out.println(cardType + " Name");
		kbReader = new Scanner(System.in);
		cardName = kbReader.nextLine();
		System.out.println(cardType + " Mana cost:");
		System.out.println("Red Mana:");
		kbReader = new Scanner(System.in);
		r = kbReader.nextInt();
		System.out.println("Blue Mana: ");
		kbReader = new Scanner(System.in);
		u = kbReader.nextInt();
		System.out.println("Green Mana: ");
		kbReader = new Scanner(System.in);
		g = kbReader.nextInt();
		System.out.println("White Mana: ");
		kbReader = new Scanner(System.in);
		w = kbReader.nextInt();
		System.out.println("Black Mana: ");
		kbReader = new Scanner(System.in);
		b = kbReader.nextInt();
		System.out.println("Colourless Mana: ");
		kbReader = new Scanner(System.in);
		x = kbReader.nextInt();
		System.out.println(cardType + " Subtype: ");
		kbReader = new Scanner(System.in);
		cardSubtype = kbReader.nextLine();
		System.out.println(cardType + " Abilities: ");
		kbReader = new Scanner(System.in);
		cardAbility = kbReader.nextLine();
		System.out.println("");
		System.out.println("Return to menu?");
		
		if (menuOption == "yes")
		{
			//Return to main();
		}
		else if (menuOption == "no")
		{
			return;
		}
	}
	
	public static void MagicOutput()
	{
		int menuOption;
		String cardType, cardName, cardSubtype, cardAbility;
		int r, u, g, w, b, x;
		System.out.println("Retrieve a card:");
		System.out.println("");
		System.out.println("How would you like to search for a card?");
		System.out.println("");
		System.out.println("1. Search by name");
		System.out.println("2. Search by type");
		System.out.println("3. Search by Mana cost");
		System.out.println("4. Search by ability");
		
		kbReader = new Scanner(System.in);
		menuOption = kbReader.nextInt();
		if (menuOption == 1)
		{
			System.out.println("What is the name of the card you are looking for?");
			kbReader = new Scanner(System.in);
			cardName = kbReader.nextLine();
			
		}
		else if (menuOption == 2)
		{
			System.out.println("What is the type of the card you are looking for?");
			kbReader = new Scanner(System.in);
			cardType = kbReader.nextLine();
			
		}
		else if (menuOption == 3)
		{
			System.out.println("What is the mana cost of the type you are looking for?");
			System.out.println("Red mana cost: ");
			kbReader = new Scanner(System.in);
			r = kbReader.nextInt();
			System.out.println("Blue mana cost: ");
			kbReader = new Scanner(System.in);
			u = kbReader.nextInt();
			System.out.println("Green mana cost: ");
			kbReader = new Scanner(System.in);
			g = kbReader.nextInt();
			System.out.println("White mana cost: ");
			kbReader = new Scanner(System.in);
			w = kbReader.nextInt();
			System.out.println("Black mana cost: ");
			kbReader = new Scanner(System.in);
			b = kbReader.nextInt();
			System.out.println("Colourless mana cost: ");
			kbReader = new Scanner(System.in);
			x = kbReader.nextInt();
		}
		else if (menuOption == 4)
		{
			System.out.println("What is the ability keyword of the card you are looking for?");
			kbReader = new Scanner(System.in);
			cardAbility = kbReader.nextLine();
		}
	}
}
