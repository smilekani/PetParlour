/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcarecenter;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SOLOMON ANNAN
 */
public class Pets {
  Scanner input = new Scanner( System.in );
//  private String[] petDetails  =  { "d 001 Roxy MALE 10 beagle" ,
//                                    "c 002 Puss FEMALE 05 Ragdoll" ,
//                                    "d 003 Lucy FEMALE 12 Poodle" 
//                                  };
//  private PetCareEmp emp;
//  
//  public void describe() {
//    for( int i = 0; i < petDetails.length; i++ ){
//        System.out.println( petDetails[i] );
//      }
////  }
//  public void petValidate(String ownNo){
//    for( String s : petDetails ) {
//      String[] s2 = s.split(" ");
//      for( String results : s2 ) {
//        if( results.equals( ownNo ) ) {
//          System.out.println( " PET DETAILS " );
//          System.out.println( " \033[35m " + " NAME : "     + s2[2] + " \033[0m " );
//          System.out.println( " \033[35m " + " GENTER : "   + s2[3] + " \033[0m ");
//          System.out.println( " \033[35m " + " AGE : "      + s2[4] + " \033[0m ");
//          System.out.println( " \033[35m " + " PET TYPE : " + s2[5] + " \033[0m ");
//          emp = new PetCareEmp();
//          emp.petSitter();
//        }
//      }
//    }
//  }
  
  private String dogType = "Unknown";
  private String catType = "Unknown";
  private String petNameOne = "Unknown";
  private String petNameTwo = "Unknown";
  private String petNameThree = "Unknown";
  private String petNameFour = "Unknown";
  private String petNameFive = "Unknown";
  private String petNameSix = "Unknown";
  private String petNameSeven = "Unknown";
  private String petNameEight = "Unknown";
  private String petNameNine = "Unknown";
  private String petNameTen = "Unknown";
  private String petId;
  private String petType;
  private String petName;
  private String petGender;
  private String petAge;
  private String petBreeds;
  private String petOwner;
//  
  
  private List<PetAppointment> bookedAppointments;
  private List<String> petProducts;
 
  public Pets( String type, String id, String petOwner, String name, String gender, String age, String breeds ){
    this.petType = type;
    this.petId = id;
    this.petName = name;
    this.petGender = gender;
    this.petAge = age;
    this.petBreeds = breeds;
    this.petOwner = petOwner;
  }
  
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
  
  public String getPetId() {
		return petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}
  
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetGender() {
		return petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	public String getPetAge() {
		return petAge;
	}
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}
	public String getPetBreeds() {
		return petBreeds;
	}
	public void setPetBreeds(String petBreeds) {
		this.petBreeds = petBreeds;
	}

	public String getPetOwner() {
		return petOwner;
	}

	public void setPetOwner(String petOwner) {
		this.petOwner = petOwner;
	}

	public List<PetAppointment> getBookedAppointments() {
		return bookedAppointments;
	}

	public void setBookedAppointments(List<PetAppointment> bookedAppointments) {
		this.bookedAppointments = bookedAppointments;
	}

	public List<String> getPetProducts() {
		return petProducts;
	}

	public void setPetProducts(List<String> petProducts) {
		this.petProducts = petProducts;
	}
	
	
	
//  Pets(String dog) {
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//  }
 
  
}