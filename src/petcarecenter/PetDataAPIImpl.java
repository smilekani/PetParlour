package petcarecenter;

import java.util.List;
import java.util.Set;

public class PetDataAPIImpl implements PetDataAPI
{
	private static PetDataAPIImpl petDataAPIImpl;
	
	private PetDataAPIImpl() {
	}
	
	public static PetDataAPIImpl getInstance()
	{
		if(petDataAPIImpl == null)
		{
			petDataAPIImpl = new PetDataAPIImpl();
		}
		return petDataAPIImpl;
	}
	
	@Override
	public Set<String> getAllPetOwners() {
		return PetCareUtils.getInstance().getAllPetOwners();
	}
	
	@Override
	public PetOwnerRecord getPetOwnerRecord(String ownerName) {
		return PetCareUtils.getInstance().getPetOwnerRecord(ownerName);
	}

	@Override
	public Pets getPetDetails() {
		return null;
	}

	@Override
	public Pets getPetDetailForOwner(String ownerName) {
		return PetCareUtils.getInstance().getPetDetailForOwner(ownerName);
	}

	@Override
	public PetSitters getFreeSitter() {
		return PetCareUtils.getInstance().getFreeSitter();
	}

	@Override
	public PetSitters findAnotherFreeSitter() {
		return PetCareUtils.getInstance().findAnotherFreeSitter();
	}
	
	@Override
	public void updatePitSittersAppointment(PetSitters petSitter) {
		PetCareUtils.getInstance().updatePitSitter(petSitter);
	}

	@Override
	public List<PetSitters> getAllPetSitter() {
		return PetCareUtils.getInstance().getAllPetSitter();
	}

	@Override
	public void getFinalReport() {
		PetCareUtils.getInstance().getFinalReport();		
	}

	@Override
	public void getPetProductsReport() {
		PetCareUtils.getInstance().getPetProductsReport();		
	}

	@Override
	public void registerNewPet(Pets pet, PetOwnerRecord petOwnerRecord) {
		PetCareUtils.getInstance().addNewPet(pet, petOwnerRecord);
	}


}
