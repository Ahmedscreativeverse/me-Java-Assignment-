import java.util.Scanner;

class Nokia3310Menu{

	static void main(String[] args){

		Scanner inputCollector = new Scanner(System.in);


		String menu = """	
	WELCOME TO NOKIA - AHMED EDITION

	1. phone book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. profiles
	13.Sim services
	


	""";

	System.out.print(mainMenu);

	int mainChoice =  inputCollector.nextInt();

	switch(mainChoice){
	
		case  1 -> {System.out.println("phonebook"); 

		String phonebookMenu = """

	Press 1 - To search
	Press 2 - To access service Nos
	Press 3 - To add name
	press 4 - Erase
	press 5 - Edit
	press 6 - Assign tone 
	press 7 - Send b'card
	press 8- options
	press 9- Speed dials
	press 10- voice tags
	""";
	System.out.println(phonebookMenu); 
	int phonebookChoice =  inputCollector.nextInt();
	switch(phonebookChoice){
		case 1 -> {System.out.print("Search");
		case 2 -> {System.out.print("Service numbers");
		case 3 -> {System.out.print("Adding new contacts");
		case 4 -> {System.out.print("Erasing");
		case 5 -> {System.out.print("Edit");
		case 6 -> {System.out.print("Assign ringtone");
		case 7 -> {System.out.print("business card");
	String optionsMenu = """

	Press 1 - Type of view
	press 2- memory status
	""";
	System.out.println(optionsMenu); 
	int optionsChoice =  inputCollector.nextInt();
	switch(optionsChoice){
		case 1 -> System.out.print("view type");
		case 2 -> System.out.print("Memory");
		
	}

	}
		case 9 -> System.out.print("speeddials");
		case 10 -> System.out.print("voice ");
		default -> System.out.println("option not found");

	}

}
		
		case  2 -> {System.out.printf("Messages");

		String yorubaMenu = """

	1 - write messages
	2 - inbox
	3 - Outbox
	4 - picture messages
	5- Templates
	6- Smileys
	7- Message settings
	8- Info service
	9- voice mailbox number
	10- Service command editor
	""";
	System.out.println(messageMenu); 
	int messageMenuChoice =  inputCollector.nextInt();
	switch(messageChoice){
		case 1 -> System.out.println("new message");
		case 2 -> System.out.println("inbox");
		case 3 -> System.out.print("outbox");
		case 4 -> System.out.print("picture messages");
		case 5-> System.out.print("Templates");
		case 6 -> System.out.print("Smileys");
		case 7 -> messageSettingMenu();
		case 8-> System.out.println("info service");
		case 9-> System.out.println ("voice mail number");
		case 10-> System.out.println ("Service command editor");
		default -> System.out.println("Invalid option");

	}

 }

	public static void messageSettingMenu()  {
	    String menu = """
	    
	    message settings 
	    1. set 1
	    2. common
	    
	    """;
	    
	    System.out.print
	    
		
		case  3 -> System.out.printf("Hausa Menu"); 

		case  4 -> System.out.printf("Igbo Menu");

		case  5 -> System.out.printf("Pidgin Menu"); 

		default -> System.out.println("Oga, you no go school");
	
	}

		



	}

}
