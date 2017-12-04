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
public class PetCareProduct {
  
  private int pNo = 1;
  private String[] productList = { "1 Shampoo", "2 Oil","3 Comb", "4 Scissor"};
  private String pName;
  private String[] productElement;
  private String plNum; 

/***************-----------PET PRODUCT NAME-------------***********************/  
  public String getpName() {
    return pName;
  }
  public void setpName(String name) {
    //productElement          = productList[pNo-1].split(" ");
    this.pName = name;
  }
/***************-----------END PET PRODUCT NAME---------***********************/  
  
/***************-----------PET PRODUCT NUMBER-----------***********************/  
  
//  public String getPetProductNo() {
//    return plNum;
//  }
//  public void setPetProductNo() {
//    productElement          = productList[pNo-1].split(" ");
//    this.plNum = productElement[0];
//  }
/***************-----------END PET PRODUCT NUMBER-------***********************/  
}
