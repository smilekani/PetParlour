package petcarecenter;

import java.util.List;
import java.util.Set;

public interface PetDataAPI 
{
	Set<String> getAllPetOwners();
	PetOwnerRecord getPetOwnerRecord(String ownerName);
	Pets getPetDetails();
	Pets getPetDetailForOwner(String ownerName);
	PetSitters getFreeSitter();
	PetSitters findAnotherFreeSitter();
	void updatePitSittersAppointment(PetSitters freeSitter);
	List<PetSitters> getAllPetSitter();
	void getFinalReport();
	void getPetProductsReport();
}
