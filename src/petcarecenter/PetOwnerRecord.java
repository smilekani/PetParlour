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
public class PetOwnerRecord {
  
	private String cusId;
  private String cusName;
  private String cusAddr;
	private String cusContact;
	
	public PetOwnerRecord(String id, String name, String addr, String number) {
		this.setcusId(id);
		this.setcusName(name);
		this.setcusAddr(addr);
		this.setcusContact(number);
	}
	public PetOwnerRecord()
	{
		this.cusId = "1";
		this.cusName = "Anonymous";
		this.cusName = "Anonymous";
		this.cusAddr = "Anonymous";
	}
  
  public String getcusId()
	{
		return this.cusId;
	}
	
	public void setcusId(String id)
	{
		this.cusId = id;
	}
  
  public String getcusName()
	{
		return this.cusName;
	}
	
	public void setcusName(String name)
	{
		this.cusName = name;
	}
  
  public String getcusAddr()
	{
		return this.cusAddr;
	}
	
	public void setcusAddr(String addr)
	{
		this.cusAddr = addr;
	}
  
  public String getcusContact()
	{
		return this.cusContact;
	}
	
	public void setcusContact(String number)
	{
		this.cusContact = number;
	}
	@Override
	public String toString() {
		return "PetOwnerRecord [cusId=" + cusId + ", cusName=" + cusName + ", cusAddr=" + cusAddr + ", cusContact="
				+ cusContact + "]";
	}
	
	
  
//  Scanner input = new Scanner( System.in );
//  private String[] ownerRecord  = { "001 PO Rosy 10,oldstreet,london 0987654321" ,
//                                    "002 PO Mary 5,bigstreet,london 0123456789" ,
//                                    "003 PO Lol 12,newstreet,london 0912345678" };
//  private Pets pet;
//  private String ownerNo;
//  private String cusName;
//  private int flag = 0;
  
//  public void inputValidate(){
//    do{
//      cusName = input.nextLine();
//      for( String s : ownerRecord ) {
//      String[] s2 = s.split(" ");
//      for( String results : s2 ) {
//        if( results.equals( cusName ) ) {
//          flag = 3;
//          ownerNo = s2[0];
//          System.out.println( " YOUR DETAILS " );
//          System.out.println( " \033[0;1m " + " NUMBER : " + s2[0] );
//          System.out.println( " \033[0;1m " + " NAME : " + s2[2] );
//          System.out.println( " \033[0;1m " + " ADDRESS : " + s2[3] );
//          System.out.println( " \033[0;1m " + " PHONE NUMBER : " + s2[4] );
//          pet = new Pets();
////          pet.petValidate(ownerNo);
//        }
//      }
//    }
//    flag++;
//    if( flag < 3 ) {
////    System.out.println( flag );
//    System.out.println( "This is only for registed customer" );
//    System.out.println( "Please type your name in correct spelling bcoz this projcet is case sensitive " );
//    }
//    if( flag == 3 ){
//    System.out.println( " Last Attempt " );
//    }
//    } while( flag < 4 );
//    System.exit(0);
//  }
}
