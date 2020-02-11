package conferenceApp;

import java.util.List;

public class DilbertConferenceApp {
	
	private final static String LIST_REGISTERED_ATTENDEES = "1";
	private final static String CHECK_IN_ATTENDEES = "2";
	private final static String PRINT_ATTENDEE_REPORT = "3";
	private final static String EXIT_PROGRAM = "4";
	
	private Menu menu = new Menu();
	private ConferenceService service;
	
	public ConferenceApp() {
		service = new ConferenceService();
	}
	
	public static void main(String[] args) {
		DilbertConferenceApp newApp = new DilbertConferenceApp();
		newApp.run();
	}

	public void run() {
		while(true) {
			String choice = menu.printMainMenu();
			
			if(choice.equals(LIST_REGISTERED_ATTENDEES)) {
				System.out.println("You picked 1");
				List<Attendee> registeredAttendeeList = service.retrieveListOfAttendees();
				printAttendeeList(registeredAttendeeList);
				
			}
			else if(choice.equals(CHECK_IN_ATTENDEES)) {
				
				System.out.println("You picked 2");
				//load submenu
				handleSubMenu();
			}
			else if(choice.equals(PRINT_ATTENDEE_REPORT)) {
				System.out.println("You picked 2");
			}
			else if(choice.equals(EXIT_PROGRAM)) {
				System.out.println("You picked 4, program will now exit");
				System.exit(1);
			}
			else {
				System.out.println("Invalid entry, please try again.");
			}
		}
		
		private void printAttendeeList(List<Attendee> printMeList) {
			for (Attendee a: printMeList) {
				System.out.println();
			}
		}
		
	}
	
}
