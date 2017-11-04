/*
  	ISYS 320
  	Name(s): Garrett Weissenborn
  	Date:  11/4/2017
*/

public class ComputePay {
	public static void main(String[] args) {
		int hours_worked = 20;
		double salary_an_hour = 10.50;
		Object tolal_pay = hours_worked * salary_an_hour;
		
		System.out.println("My total hours worked");
		System.out.println(hours_worked);
		System.out.println("My base pay");
		System.out.println(salary_an_hour);
		System.out.println("My total pay");
		System.out.println(tolal_pay);
	}	
}