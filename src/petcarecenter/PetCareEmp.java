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

public class PetCareEmp {
  Scanner input = new Scanner( System.in );
  PetViews view = new PetViews();
  PetOwnerRecord owner = new PetOwnerRecord();
  private int sitters;
  private int sitters1;
  private String pSitter;
  private String sDays;
  private String sTime;
  private String sTime1;
  private String selectSitter;
  String ownName;
  
//  private String[] petCareEmpSec  = { 
//                                      "1 1stShift PCS Secretary1 10,oldstreet,london 0987654321" ,
//                                      "2 2ndShift PCS Secretary2 11,oldstreet,london 0987654322" ,
//                                      "3 3rdShift PCS Secretary3 12,oldstreet,london 0987654323" ,
//                                    };
  private String[] petCareEmpSit  = { "1) Sam", "2) Madi", "3) Rajesh", "4) Ramesh", "5) Karthy" };
//  private String[] workPetSitterDays = { "1) Mon","2) Tue","3) Wed","4) Thu","5) Fri" };
//  private String[] apptmtSitterTime = { "1) 09:00","2) 10:00","3) 11:00","4) 12:00", "5) 01:00" };
//  private String[] petCareEmpKeep = { 
//                                      "060 SK Shopkeeper 12,newstreet,london 0912345678" 
//                                    };
  
//  private PetOwnerRecord getChkPetOwnerRecord(){
//      model.setName("Robert");
//      model.setRollNo("10");
//      return model;
//   }
//  private void inputValidate(){
//    owner.getOwnerName();
//    //System.out.println(name);
//    //ownName = input.nextLine();
//    
//  }
//  public void petSitter(){
//  /*-------------------------------START TABLE--------------------------------*/  
//    
//    System.out.println( " APPOINTMENT TIME FOR PET SITTER" );
//    
//    for ( int i = 1; i <= 62; i++ ) {
//        System.out.print( "*" );
//    }
//    System.out.println();
//
//    System.out.print("                         PET SITTER TIME TABLE               ");
//    System.out.println();
//
//    for ( int j = 1; j <= 62; j++ ) {
//      System.out.print( "*" );
//    }
//    
//    System.out.println();
//    for ( int pt = 0; pt < petCareEmpSit.length; pt++ ) {
//      pSitter = petCareEmpSit[pt].substring( 3, petCareEmpSit[pt].length() );
//      sDays = workPetSitterDays[pt].substring( 3, workPetSitterDays[pt].length() );
//      System.out.printf( pSitter + "\t" );
//      System.out.printf( "\t" + sDays );
//      for ( int st = 0; st < apptmtSitterTime.length; st++ ) {
//        sTime = apptmtSitterTime[st].substring( 3, apptmtSitterTime[st].length() );
//        
//        if ( pt == 0 ) {
//          if( st != 1 && st != 4 ){
//            System.out.printf( "\t" + "\033[31m" + sTime  + "\033[0m" );
//          }else {
//            System.out.printf( "\t" + sTime );
//          }
//        } 
//        if ( pt == 1 ) {
//          if( st != 0 && st != 1 ){
//            System.out.printf( "\t" + "\033[31m" + sTime  + "\033[0m" );
//          }else {
//            System.out.printf( "\t" + sTime );
//          }
//        } 
//        if ( pt == 2 ) {
//          if( st != 3 && st != 4 ){
//            System.out.printf( "\t" + "\033[31m" + sTime  + "\033[0m" );
//          }else {
//            System.out.printf( "\t" + sTime );
//          }
//        } 
//        if ( pt == 3 ) {
//          if( st != 2 && st != 0 ){
//            System.out.printf( "\t" + "\033[31m" + sTime  + "\033[0m" );
//          }else {
//            System.out.printf( "\t" + sTime );
//          }
//        } 
//        if ( pt == 4 ) {
//          if( st != 1 && st != 3 ){
//            System.out.printf( "\t" + "\033[31m" + sTime  + "\033[0m" );
//          }else {
//            System.out.printf( "\t" + sTime );
//          }
//        } 
//      }
//      if ( pt < 4 ) {
//        System.out.println();
//      }
//
//    }
//    System.out.println();
//    
//    for ( int k = 1; k <= 62; k++ ) {
//        System.out.print( "*" );
//    }
//    System.out.println();
//  /*---------------------------END TABLE--------------------------------------*/
//
//    for( int i=0; i < petCareEmpSit.length; i++ ){
//      System.out.println( petCareEmpSit[i] );
//    }
//    
//    System.out.println( "RED COLOUR ALREADY BOOKED " );
//    System.out.println( "PLEASE BE SELECT A PET SITTER." );
//    System.out.println( "ONLY 1 - 5 PET SITTER ARE ALLOWED. " );
//    System.out.println( "PLEASE BE SELECT A PET SITTER" );
//    sitters = input.nextInt();
//    if ( sitters == 0 || sitters < 0 || sitters > 5 ) {
//      System.out.println( "ONLY 1 - 5 SITTERS ARE ALLOWED. PLEASE TRY AGAIN " );
//      sitters = input.nextInt();
//    }
//     
//    if(sitters == 1){
//      sTime = apptmtSitterTime[1].substring( 3, apptmtSitterTime[1].length() );
//      sTime1 = apptmtSitterTime[4].substring( 3, apptmtSitterTime[4].length() );
//      sDays = workPetSitterDays[0].substring( 3, workPetSitterDays[0].length() );
//      selectSitter = petCareEmpSit[sitters-1].substring( 3, petCareEmpSit[sitters-1].length() );
//      System.out.println( "Sitter is " + selectSitter  );
//      System.out.println( "Available Timing is " + sDays + "day" );
//      System.out.println( "1) "+ sTime );
//      System.out.println( "2) "+ sTime1 );
//
//      System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. " );
//      System.out.println( " PLEASE BE SELECT A TIME" );
//      sitters1 = input.nextInt();
//      if ( sitters1 == 0 || sitters1 < 0 || sitters1 > 2 ) {
//       System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. PLEASE TRY AGAIN " );
//       sitters1 = input.nextInt();
//      } 
//      if ( sitters1 == 1 ){
//        System.out.println( "BOOKED IN  " + sDays + "day" + "  " + sTime );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//      if ( sitters1 == 2 ){
//       System.out.println( "BOOKED IN  " + sDays + "day" + " \t " + sTime1 );
//       System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//    }
//    
//    if(sitters == 2){
//      sTime = apptmtSitterTime[0].substring( 3, apptmtSitterTime[0].length() );
//      sTime1 = apptmtSitterTime[1].substring( 3, apptmtSitterTime[1].length() );
//      sDays = workPetSitterDays[1].substring( 3, workPetSitterDays[1].length() );
//      selectSitter = petCareEmpSit[sitters-1].substring( 3, petCareEmpSit[sitters-1].length() );
//      System.out.println( "YOUR PET SITTER IS " + selectSitter  );
//      System.out.println( "AVAILABLE TIMING IS " + sDays + "sday" );
//      System.out.println( "1) "+ sTime );
//      System.out.println( "2) "+ sTime1 );
//      
//      System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. " );
//      System.out.println( " PLEASE SELECT YOUR TIME :" );
//      sitters1 = input.nextInt();
//      if ( sitters1 == 0 || sitters1 < 0 || sitters1 > 2 ) {
//        System.out.println( "ONLY 1 - 2 TIMING ARE ALLOWED. PLEASE TRY AGAIN: " );
//        sitters1 = input.nextInt();
//      }
//      if ( sitters1 == 1 ){
//        System.out.println( "BOOKED IN  " + sDays + "sday" + " \t " + sTime );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//      if ( sitters1 == 2 ){
//        System.out.println( "BOOKED IN  " + sDays + "sday" + " \t " + sTime1 );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//    }
//    
//    if(sitters == 3){
//      sTime = apptmtSitterTime[3].substring( 3, apptmtSitterTime[3].length() );
//      sTime1 = apptmtSitterTime[4].substring( 3, apptmtSitterTime[4].length() );
//      sDays = workPetSitterDays[2].substring( 3, workPetSitterDays[2].length() );
//      selectSitter = petCareEmpSit[sitters-1].substring( 3, petCareEmpSit[sitters-1].length() );
//      System.out.println( "SITTER IS " + selectSitter  );
//      System.out.println( "AVAILABLE TIMING IS " + sDays + "nesday" );
//      System.out.println( "1) "+ sTime );
//      System.out.println( "2) "+ sTime1 );
//      
//      System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. " );
//      System.out.println( " PLEASE SELECT TIME :" );
//      sitters1 = input.nextInt();
//      if ( sitters1 == 0 || sitters1 < 0 || sitters1 > 2 ) {
//        System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. PLEASE TRY AGAIN: " );
//        sitters1 = input.nextInt();
//      }
//      if ( sitters1 == 1 ){
//        System.out.println( "BOOKED IN  " + sDays + "nesday" + " \t " + sTime );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//      if ( sitters1 == 2 ){
//        System.out.println( "BOOKED IN  " + sDays + "nesday" + " \t " + sTime1 );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//    } 
//    
//    if(sitters == 4){
//      sTime = apptmtSitterTime[0].substring( 3, apptmtSitterTime[0].length() );
//      sTime1 = apptmtSitterTime[2].substring( 3, apptmtSitterTime[2].length() );
//      sDays = workPetSitterDays[3].substring( 3, workPetSitterDays[3].length() );
//      selectSitter = petCareEmpSit[sitters-1].substring( 3, petCareEmpSit[sitters-1].length() );
//      System.out.println( "SITTER IS " + selectSitter  );
//      System.out.println( "AVAILABLE TIMING IS " + sDays + "rsday" );
//      System.out.println( "1) "+ sTime );
//      System.out.println( "2) "+ sTime1 );
//      
//      System.out.println( "Only 1 - 2 TIMING ARE ALLOWED. " );
//      System.out.println( " PLEASE SELECT TIME:" );
//      sitters1 = input.nextInt();
//      if ( sitters1 == 0 || sitters1 < 0 || sitters1 > 2 ) {
//        System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. PLEASE TRY AGAIN: " );
//        sitters1 = input.nextInt();
//      }
//      if ( sitters1 == 1 ){
//        System.out.println( "BOOKED IN  " + sDays + "rsday" + " \t " + sTime );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//      if ( sitters1 == 2 ){
//        System.out.println( "BOOKED IN  " + sDays + "rsday" + " \t " + sTime1 );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//    } 
//      
//    if(sitters == 5){
//      sTime = apptmtSitterTime[1].substring( 3, apptmtSitterTime[1].length() );
//      sTime1 = apptmtSitterTime[3].substring( 3, apptmtSitterTime[3].length() );
//      sDays = workPetSitterDays[4].substring( 3, workPetSitterDays[4].length() );
//      selectSitter = petCareEmpSit[sitters-1].substring( 3, petCareEmpSit[sitters-1].length() );
//      System.out.println( "SITTER IS " + selectSitter  );
//      System.out.println( "AVAILABLE TIMING IS " + sDays + "day" );
//      System.out.println( "1) "+ sTime );
//      System.out.println( "2) "+ sTime1 );
//      
//      System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. " );
//      System.out.println( " PLEASE SELECT TIME :" );
//      sitters1 = input.nextInt();
//      if ( sitters1 == 0 || sitters1 < 0 || sitters1 > 2 ) {
//        System.out.println( "ONLY 1 & 2 TIMING ARE ALLOWED. PLEASE TRY AGAIN: " );
//        sitters1 = input.nextInt();
//      }
//      if ( sitters1 == 1 ){
//        System.out.println( "BOOKED IN  " + sDays + "day" + " \t " + sTime );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//      if ( sitters1 == 2 ){
//        System.out.println( "BOOKED IN  " + sDays + "day" + " \t " + sTime1 );
//        System.out.println( "SUCCESSFULLY BOOKED." );
//      }
//    } 
//  }
  
  public void dispayView(){				
    view.printPetCareWelcome();
    //view.printPetCareReport();
   // owner.inputValidate();
  }
}
