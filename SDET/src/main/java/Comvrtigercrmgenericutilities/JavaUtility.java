package Comvrtigercrmgenericutilities;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

public int generateRandomNum()

{
	Random ran = new Random();
	return ran.nextInt(1000);
	
}
public String getDateandTime(){
	Date date = new Date();
	return date.toString().replace(" ", "-").replace(":","-");	
			}

public static void main(String[] args) {
	System.out.println(new JavaUtility().generateRandomNum());
	System.out.println(new JavaUtility().getDateandTime());

}


}
