/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcarecenter;

/**
 *
 * @author SOLOMON ANNAN
 */
public class PetServices {
  private int sNo = 1;
  private String serviceNo;
  private String serviceName;
  private String[] serviceElement;
  private String[] petService = { "1 Bath", "2 Massage", "3 Combing", "4 HairTrimming" };

/**********----------------PET SERVICE NAME---------------------***************/
  public String getPetServiceName() {
    return serviceName;
  }
  public void setPetServiceName() {
    serviceElement          = petService[sNo-1].split(" ");
    this.serviceName = serviceElement[1];
  }
/**********----------------END PET SERVICE NAME-----------------***************/
  
/**********----------------PET SERVICE NUMBER-------------------***************/
  public String getPetServiceNo() {
    return serviceNo;
  }
  public void setPetServiceNo() {
    serviceElement          = petService[sNo-1].split(" ");
    this.serviceNo = serviceElement[0];
  }
/**********--------------END PET SERVICE NUMBER-----------------***************/
}
