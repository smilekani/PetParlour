/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcarecenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author SOLOMON ANNAN
 */
public class PetControl {

	private Scanner input = new Scanner(System.in);
	PetViews view = new PetViews();
	PetOwnerRecord owner = new PetOwnerRecord();
	Pets petInputDetail;
	private String cusName;
	private int flag = 0;
	private Set<String> allPetOwners;
	private int petId = 110;

	public PetControl() {
		PetCareUtils.getInstance().initializePetCareRecords();
	}

	public void hints(){
		int count = 0;
		System.out.println( "THIS LIST OF REGISTERED PET USERS " );
		allPetOwners = PetDataAPIImpl.getInstance().getAllPetOwners();
		for( String s : allPetOwners ) {
			count++;
			System.out.print("\n"+ count +") " +s );
		}
		System.out.println();
	} 


	private PetOwnerRecord ownerInputDetail(){
		do{
			cusName = input.nextLine();
			if(allPetOwners.contains(cusName))
			{
				flag = 4;
			}
			flag++;
			if( flag < 3 ) {
				System.out.println( " This is only for Registed Customers " );
				System.out.println( " Please Do Not Type Integers " );
				System.out.println( " Please Type Correct Name With Spelling Bcoz This App is Case Sensitive " );
			}
			if( flag == 3 ){
				System.out.println( " This is Last Attempt " );
			}
			if( flag == 4 ){
				System.out.println( " Last Attempt Failed" );
				System.exit(0);
			}
		} while( flag <= 3 );
		return owner;
	}

	private Pets petsInputDetail(){
		Pets petDetailForOwner = PetDataAPIImpl.getInstance().getPetDetailForOwner(cusName);

		System.out.println("The Pet Details for the Owner: "+cusName);
		System.out.println("Pet Type: "+petDetailForOwner.getPetType());
		System.out.println("Pet Id: "+petDetailForOwner.getPetId());
		System.out.println("Pet Owner: "+petDetailForOwner.getPetOwner());
		System.out.println("Pet name: "+petDetailForOwner.getPetName());
		System.out.println("Pet gender: "+petDetailForOwner.getPetGender());
		System.out.println("Pet age: "+petDetailForOwner.getPetAge());
		System.out.println("Pet breeds: "+petDetailForOwner.getPetBreeds());

			return petDetailForOwner;
	}

	public PetAppointment bookAppointment(){
		PetAppointment petAppointment = new PetAppointment();
		petAppointment.setAppointmentStatus("BOOKED");
		return petAppointment.showTimeDetail();
	}

	public void dispayView(){		
		view.printPetCareWelcome();
		while(true)
		{
			hints();
			System.out.println("Please Select your Appointment Option from 1-4");
			System.out.println("1.New Pet Arrived for Service \n2.Registrated Pet Arrived for Service \n3.Appointment Process "
					+ "\n4.Final Monthly Report\n4.Pet Products Report");
			Scanner scanner = new Scanner(System.in);
			int appointSelection = scanner.nextInt();
			switch (appointSelection) {
			case 1:
				inputNewPetAndOwnerDetail();
				break;
			case 2:
				ownerInputDetail();
				petInputDetail = petsInputDetail();
				appointmentProcess();
				break;
			case 3:
				appointmentProcess();
				break;
			case 4:
				finalReport();
				break;
			case 5:
				petProductsReport();
				break;
			case 6:
				exitApplication();
				break;

			default:
				break;
			}
			System.out.println("Is Final Report is Needed, Please 'yes' to get the Final Report");

			view.printPetCareReport();
		}
	}

	private void inputNewPetAndOwnerDetail() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Registration for the New with its Owner Details\n");
		System.out.println("Enter the Pet Type");
		String petType = scanner.nextLine();
		petId++;
		String petid = String.valueOf(petId);
		System.out.println("Enter the Pet Name");
		String petName = scanner.nextLine();
		System.out.println("Enter the Gender of the Pet: MALE or FEMALE");
		String gender = scanner.nextLine();
		System.out.println("Enter the  Pet's Age");
		String age = scanner.nextLine();
		System.out.println("Enter the Pet Breed");
		String petBreed = scanner.nextLine();
		System.out.println("Enter the PetOwner");
		String petOwner = scanner.nextLine();
		System.out.println("Enter the PetOwner Address");
		String petOwnerAddr = scanner.nextLine();
		System.out.println("Enter the PetOwner Contact Number");
		String petOwnerContNo = scanner.nextLine();
		Pets newPet = new Pets(petType, petid, petOwner, petName, gender, age, petBreed);
		PetOwnerRecord petOwnerRecord = new PetOwnerRecord(petid, petOwner, petOwnerAddr, petOwnerContNo);
		PetDataAPIImpl.getInstance().registerNewPet(newPet, petOwnerRecord);
		System.out.println("The New Pet " + petName +" is added Succesfully");
	}

	private void exitApplication() {
			System.exit(0);
	}

	private void petProductsReport() {
		PetDataAPIImpl.getInstance().getPetProductsReport();
	}

	private void finalReport() {
		PetDataAPIImpl.getInstance().getFinalReport();
	}

	private void appointmentProcess() {
		System.out.println("Please Select your Appointment Option from 1-4");
		System.out.println("1.Booking\n2.Service Completion\n3.Appointment Cancellation\n4.Failed To Attend Updation");
		Scanner scanner = new Scanner(System.in);
		int appointSelection = scanner.nextInt();
		switch (appointSelection) {
		case 1:
			appointmentServiceProcess("BOOKED");
			break;
		case 2:
			appointmentServiceProcess("COMPLETED");
			petProductsForTreatments();
			break;
		case 3:
			appointmentServiceProcess("FAILED_TO_ATTEND");
			break;
		case 4:
			appointmentServiceProcess("CANCELLED");
			break;
		default:
			break;
		}
	}

	private void petProductsForTreatments() {
		System.out.println("Is Pet Treatment Required?If yes Press 1 else Press 2");
		Scanner scanner = new Scanner(System.in);
		int treatmentSelection = scanner.nextInt();
		switch (treatmentSelection) {
		case 1:
			enterPetProductDetails();
			break;

		default:
			break;
		}
	}

	private void enterPetProductDetails() {
		List<String> petProducts = new ArrayList<>();
		System.out.println("Please type 'stop' for finish the Entering the Pet Products");
		Scanner scanner = new Scanner(System.in);
		String petProduct = scanner.nextLine();
			petProducts.add(petProduct);
			List<String> products = petInputDetail.getPetProducts();
			if(products == null)
			{
				petInputDetail.setPetProducts(petProducts);
			}
			else
			{
				petProducts.add(petProduct);
				petInputDetail.setPetProducts(petProducts);
			}

	}

	private void appointmentServiceProcess(String appointmentType) {
		PetAppointment bookAppointment = bookAppointment();
		bookAppointment.setAppointmentStatus(appointmentType);
		List<PetAppointment> bookedAppointments = petInputDetail.getBookedAppointments();
		if(bookedAppointments == null)
			bookedAppointments = new ArrayList<>();
		bookedAppointments.add(bookAppointment);
		PetSitters freeSitter = PetDataAPIImpl.getInstance().getFreeSitter();
		if(freeSitter == null)
		{
			freeSitter = PetDataAPIImpl.getInstance().findAnotherFreeSitter();
			System.out.println("freeSitter = "+freeSitter);
		}
		System.out.println("Free PitSitter is "+freeSitter.getsName());
		List<PetAppointment> petAppointmentList = freeSitter.getPetAppointment();

		if(petAppointmentList == null)
		{
			petAppointmentList = new ArrayList<>();
		}
		petAppointmentList.add(bookAppointment);
		freeSitter.setPetAppointment(petAppointmentList);
		PetDataAPIImpl.getInstance().updatePitSittersAppointment(freeSitter);	
	}
}
