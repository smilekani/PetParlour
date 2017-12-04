package petcarecenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PetCareUtils {

	private static PetCareUtils petCareUtils;
	private Map<String, PetOwnerRecord> ownerRecord = new HashMap<String, PetOwnerRecord>();
	private Map<String, Pets> petDetails = new HashMap<String, Pets>();
	private Map<String, PetSitters> petSiters = new HashMap<String, PetSitters>();
	
	private PetCareUtils() {
	}
	
	public static PetCareUtils getInstance()
	{
		if(petCareUtils == null)
		{
			petCareUtils = new PetCareUtils();
		}
		return petCareUtils;
	}

	public void initializePetCareRecords()
	{
		initializeOwner();
		initializePetDetails();
		initializePitSitters();
	}

	private void initializeOwner() {
		ownerRecord.put("Rosy", new PetOwnerRecord("001", "Rosy", "10,oldstreet,london", "0987654321"));
		ownerRecord.put("Mary", new PetOwnerRecord("002", "Mary", "5,bigstreet,london", "0123456789"));
		ownerRecord.put("Solomon", new PetOwnerRecord("003", "Solomon", "5,kalungady,london", "0123456789"));
		ownerRecord.put("Deni", new PetOwnerRecord("004", "Deni", "5,vadasery,london", "0123456789"));
		ownerRecord.put("dharma", new PetOwnerRecord("005", "dharma", "12,leicester,london", "0912345678"));
		ownerRecord.put("Jeevi", new PetOwnerRecord("006", "Jeevi", "12,Camp,london", "0912345678"));
		ownerRecord.put("Gold", new PetOwnerRecord("007", "Gold", "12,EastHam,london", "0912345678"));
		ownerRecord.put("Raju", new PetOwnerRecord("008", "Raju", "12,Durby,london", "0912345678"));
		ownerRecord.put("Merlin", new PetOwnerRecord("009", "Merlin", "12,Birmingham,london", "0912345678"));
		ownerRecord.put("Mayer", new PetOwnerRecord("010", "Mayer", "12,Loton,london", "0912345678"));
	}

	private void initializePetDetails() {
		petDetails.put("Roxy", new Pets("Dog", "001", "1", "Roxy", "MALE", "10", "beagle"));
		petDetails.put("Puss", new Pets("Cat", "002", "2", "Puss", "FEMALE", "05", "beagle"));
		petDetails.put("Lucy", new Pets("Dog", "003", "3", "Lucy", "FEMALE", "7", "beagle"));
		petDetails.put("roy", new Pets("Cat", "004", "4", "roy", "MALE", "6", "beagle"));
		petDetails.put("Jimmy", new Pets("Dog", "005", "5", "Jimmy", "MALE", "9", "beagle"));
		petDetails.put("Dancy", new Pets("Cat", "006", "6", "Dancy", "FEMALE", "12", "beagle"));
		petDetails.put("Judo", new Pets("Dog", "007", "7", "Judo", "MALE", "12", "beagle"));
		petDetails.put("Puppy", new Pets("Cat", "008", "8", "Puppy", "FEMALE", "1", "beagle"));
		petDetails.put("drocy", new Pets("Dog", "009", "9", "drocy", "FEMALE", "11", "beagle"));
		petDetails.put("Cotter", new Pets("Cat", "010", "10", "Cotter", "MALE", "8", "beagle"));
	}
	
	private void initializePitSitters()
	{
		petSiters.put("Tony", new PetSitters("Tony"));
		petSiters.put("Emily", new PetSitters("Emily"));
		petSiters.put("Lisa", new PetSitters("Lisa"));
	}
	
	public Set<String> getAllPetOwners()
	{
		return ownerRecord.keySet();
	}

	public PetOwnerRecord getPetOwnerRecord(String ownerName) {
		return ownerRecord.get(ownerName);
	}
	
	public Pets getPetDetailForOwner(String ownerName) {
		System.out.println("ownerName  = "+ownerName);
		PetOwnerRecord petOwnerRecord = getPetOwnerRecord(ownerName);
		System.out.println("petOwnerRecord  = "+petOwnerRecord);
		String cusId = petOwnerRecord.getcusId();
		Collection<Pets> values = petDetails.values();
		for (Pets pet : values) {
			if(pet.getPetId().equals(cusId))
				return pet;
		}
		return null;
	}
	
	public PetSitters getFreeSitter() {
		for (PetSitters petSiter : petSiters.values()) {
			if(petSiter.getPetAppointment() == null)
			{
				return petSiter;
			}
		}
		return null;
	}
	
	public PetSitters findAnotherFreeSitter()	{
		int[] appointmentsSize = new int[petSiters.size()];
		int i = 0;
		for (PetSitters petSiter : petSiters.values()) {
			appointmentsSize[i] = petSiter.getPetAppointment().size();
			i++;
		}
		Arrays.sort(appointmentsSize);
		for (PetSitters petsitter : petSiters.values()) {
			if(appointmentsSize[0] == petsitter.getPetAppointment().size())
					{
						return petsitter;
					}
		}
		return null;
	}
	
	public void updatePitSitter(PetSitters pitSitter) {
		petSiters.put(pitSitter.getsName(), pitSitter);
	}
	
	public List<PetSitters> getAllPetSitter() {
		List<PetSitters> petSittersList = new ArrayList<>();
		for (PetSitters petSitters : petSiters.values()) {
			petSittersList.add(petSitters);
		}
		return petSittersList;
	}
	
	public void getFinalReport()
	{
		List<PetSitters> allPetSitters = getAllPetSitter();
		System.out.println("allPetSitters size ==== "+allPetSitters.size());
		for (PetSitters petSitter : allPetSitters) {
			int doneAppoints = 0;
			int cancelledAppoints = 0;
			int failedToAttendAppoints = 0;
			int bookedAppoints = 0;
			List<PetAppointment> totalAppointments = petSitter.getPetAppointment();
			if(totalAppointments != null)
			{
			System.out.println("Total Appointments assigned to "+petSitter.getsName() +" = "+totalAppointments.size());
			if(totalAppointments != null)
			{
				for (PetAppointment appointment : totalAppointments) {
					String appStatus = appointment.getAppointmentStatus();
					if(appStatus.equals("COMPLETED"))
						doneAppoints++;
					else if(appStatus.equals("CANCELLED"))
						cancelledAppoints++;
					else if(appStatus.equals("FAILED_TO_ATTEND"))
						failedToAttendAppoints++;
					else if(appStatus.equals("BOOKED"))
						bookedAppoints++;
				}
			}
			}
			System.out.println("The PetSitter "+petSitter.getsName());
			System.out.println("Completed Appointments = "+ doneAppoints);
			System.out.println("Cancelled Appointments = "+cancelledAppoints);
			System.out.println("Failed To Attend Appointments = "+failedToAttendAppoints);
			System.out.println("Booked Appointments = "+bookedAppoints);
//			System.out.println("NO of Products Ordered = " + petSitter.getNoOfProdutsOrdered());

		}
		
	}
	
	public void getPetProductsReport() {
		System.out.println("The List of Pet Products for the Shop are ");
		for (Pets pet : petDetails.values()) {
			List<String> petProducts = pet.getPetProducts();
			if(petProducts != null)
			{
				for (String petProduct : petProducts) {
					System.out.println(petProduct);
				}
			}
		}
	}
}
