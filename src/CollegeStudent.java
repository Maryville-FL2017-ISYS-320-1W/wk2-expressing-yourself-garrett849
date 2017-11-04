/*
  	ISYS 320
  	Name(s):Garrett Weissenborn
  	Date:   11/4/2017
*/

public class CollegeStudent {

	public static void main(String[] args) {
		int Total_number_of_classes = 5;
		double Math = 3.5;
		double English = 3.7;
		double Health = 3.0;
		double Autoshop = 4.0;
		double PE = 3.3;
		Object GPA = (Math + English + Health + Autoshop + PE) / Total_number_of_classes;
		System.out.println("My GPA is "+ GPA);
	}

}
