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
public class PetAppointment {
	Scanner in = new Scanner(System.in);
	int days;
	int times;
	String yourDay;
	String selectDays;
	String selectTime;
	String[] workDays = { "1) Mon","2) Tue","3) Wed","4) Thu","5) Fri","6) Sat","7) Sun" };
	String[] apptmtTime = { "1) 11:30","2) 14:00","3) 16:00","4) 17:00" };
	String appointmentStatus;

	//***************** SHOW TABLE ******************//
	public PetAppointment showTimeDetail(){
		System.out.println( " APPOINTMENT TIME " );

		for ( int i = 1; i <= 78; i++ ) {
			System.out.print( "*" );
		}
		System.out.println();

		System.out.print("                         APPOINTMENT TIME TABLE               ");
		System.out.println();

		for ( int j = 1; j <= 78; j++ ) {
			System.out.print( "*" );
		}

		System.out.println();

		for ( int sw = 0; sw < workDays.length; sw++ ) {
			String sDays = workDays[sw].substring( 3, workDays[sw].length() );
			System.out.printf( sDays+"\t" );
			for ( int st = 0; st < apptmtTime.length; st++ ) {
				String sTime = apptmtTime[st].substring( 3, apptmtTime[st].length() );
				System.out.printf( "\t" + sTime );
			}
			if ( sw < 4 ) {
				System.out.println();
			}
		}

		System.out.println();

		for ( int k = 1; k <= 78; k++ ) {
			System.out.print( "*" );
		}
		System.out.println();
		//*************END OF TIME TABLE*******************
		//************SELECT THE DAYS********************** 

		for( int i=0; i < workDays.length; i++ ){
			System.out.println( workDays[i] );
		}

		System.out.println( "Select your days. Only 1 - 7 days are allowed " );
		System.out.println( "Select your days." );
		days = in.nextInt();

		if ( days == 0 || days < 0 || days > 7 ) {
			System.out.println( "Only 1 - 7 days are allowed. Please try again: " );
			days = in.nextInt();
		}
		selectDays = workDays[days-1].substring( 3, workDays[days-1].length() );
		if( days == 1 ){
			System.out.println( "Your day is " + selectDays + "day" );
			System.out.printf( "Available AppointmentTime on %s. ", selectDays + "day" );
			System.out.println();
			yourDay =  selectDays + "day \n";
		}else if( days == 2 ){
			System.out.println( "Your day is " + selectDays + "sday \n" );
			System.out.printf( "Available AppointmentTime on %s. " , selectDays + "sday" );
			System.out.println();
			yourDay =  selectDays + "sday \n";
		}else if( days == 3 ){
			System.out.println( "Your day is " + selectDays + "nesday \n" );
			System.out.printf( "Available AppointmentTime on %s. " , selectDays + "nesday" );
			System.out.println();
			yourDay =  selectDays + "nesday \n";
		}else if( days == 4 ){
			System.out.println( "Your day is " + selectDays + "rsday" );
			System.out.printf( "Available AppointmentTime on %s. " , selectDays + "rsday" );
			System.out.println();
			yourDay =  selectDays + "rsday \n";
		}else if( days == 5 ){
			System.out.println( "Your day is " + selectDays + "day" );
			System.out.printf( "Available AppointmentTime on %s. " , selectDays + "day" );
			System.out.println();
			yourDay =  selectDays + "day \n";
		}else if( days == 6 ){
			System.out.println( "Your day is " + selectDays + "urday" );
			System.out.printf( "Available AppointmentTime on %s. " , selectDays + "urday" );
			System.out.println();
			yourDay =  selectDays + "urday \n";
		}else if( days == 7 ){
			System.out.println( "Your day is " + selectDays + "day" );
			System.out.printf( "Available AppointmentTime on %s. " , selectDays + "day" );
			System.out.println();
			yourDay =  selectDays + "day \n";
		}
		//*************END OF SELECT DAYS ***********************
		//*************START SELECT TIMES ***********************

		for( int i=0; i < apptmtTime.length; i++ ){
			//      String dTime = apptmtTime[i].substring( 3, apptmtTime[i].length() );
			//      System.out.println( "\t" + dTime );
			System.out.println( apptmtTime[i] );
		}
		System.out.println( "Select your appointment time. Only 1 - 4 times are allowed " );
		System.out.println( "Select your appointment time " );
		times = in.nextInt();
		if ( times == 0 || times < 0 || times > 4 ) {
			System.out.println( "Only 1 - 4 times are allowed. Please try again: " );
			times = in.nextInt();
		}
		selectTime = apptmtTime[times-1].substring( 3, apptmtTime[times-1].length() );
		PetAppointment petAppointment = new PetAppointment();
		petAppointment.setYourDay(yourDay);
		petAppointment.setSelectTime(selectTime);
		System.out.println( "Appointment Time " + selectTime + " "+yourDay );
		System.out.println( "successfully booked." );
		return petAppointment;
	}

	public String getYourDay() {
		return yourDay;
	}

	public void setYourDay(String yourDay) {
		this.yourDay = yourDay;
	}

	public String getSelectTime() {
		return selectTime;
	}

	public void setSelectTime(String selectTime) {
		this.selectTime = selectTime;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

}
