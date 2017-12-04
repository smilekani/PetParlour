/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcarecenter;

import java.util.Scanner;

/**
 *
 * @author SOLOMON ANNAN
 */
public class PetViews {
  
 // PetControl petc = new PetControl();
   
  public void printPetCareWelcome(){
    
    System.out.println();

/*    for ( int i = 1; i <= 58; i++ ) {
        System.out.print( "-" );
    }
*/
    System.out.print( "------------------------------ WELCOME TO PETCARE CENTER -----------------------------------" );

/*    for ( int j = 1; j <= 58; j++ ) {
      System.out.print( "-" );
    }
*/    
//    System.out.println();

    System.out.println( "\n HELLO... I AM DUTY SECRETARY " );
    System.out.println( "PLEASE ENTER YOUR NAME :" );
  }
  public void printPetCareReport(){
    
    System.out.println(this);
    
    System.out.println();

    for ( int i = 1; i <= 58; i++ ) {
        System.out.print( "-" );
    }

    System.out.print( " PET CARE CENTER " );

    for ( int j = 1; j <= 58; j++ ) {
      System.out.print( "-" );
    }
    
    System.out.println();
    
    System.out.print("                                                 LATEST REPORT               ");
    
    System.out.println();
    System.out.println();
  
    System.out.println( "                    CUSTOMER NO        : 001             CUTOMER-NAME          : solomon" );
    System.out.println( "                    CUTOMER-ADDRESS    : LONDON          CONTACT-NO            : 00000000" );
    System.out.println( "                    PET-NAME           : jimmy           PET-AGE               : 12" );
    System.out.println( "                    PET-GENDER         : FEMALE          PET-TYPE              : SHEPERD" );
    System.out.println( "                    PET-SERVICE        : TRIM            PET-SITTER-NAME       : SOLOMON" );
    System.out.println( "                    APPOINTMENT-BOOKED : 12              APPOINTMENT-CANCELLED : 5" );
    
    System.out.println();
    
    for ( int i = 1; i <= 58; i++ ) {
        System.out.print( "-" );
    }

    System.out.print( " THANK YOU VISIT AGAIN " );

    for ( int j = 1; j <= 58; j++ ) {
      System.out.print( "-" );
    }    
    

  }
  public void printPetCareNewUser(){
    System.out.println( "WELCOME TO OUR PETCARE CENTER NEW USER" );
  }
  public void printPetCareExitUser(){
    System.out.println( "WELCOME TO OUR PETCARE CENTER EXISTING USER" );
  }
  
}
