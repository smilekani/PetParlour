/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcarecenter;

import java.util.List;

/**
 *
 * @author SOLOMON ANNAN
 */
public class PetSitters {
  private String sName;
  private List<PetAppointment> petAppointment;
  
  public PetSitters() {
}
  
  public PetSitters(String sName) {
	super();
	this.sName = sName;
}

public String getsName()
	{
		return this.sName;
	}
	
	public void setsName(String name)
	{
		this.sName = name;
	}

	public List<PetAppointment> getPetAppointment() {
		return petAppointment;
	}

	public void setPetAppointment(List<PetAppointment> petAppointment) {
		this.petAppointment = petAppointment;
	}
	
	
  
}
