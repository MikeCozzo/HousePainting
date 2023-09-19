import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inputs 
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("please enter width of house in feet: "); 
		double housewidth = sc.nextDouble(); 

		 

		System.out.print("please enter length of house in feet: "); 
		double houselength = sc.nextDouble(); 

		 

		System.out.print("please enter the height of house in feet"); 
		double househeight = sc.nextDouble(); 

		 

		double sqft = (housewidth * houselength); 
		double peakSQ = (houselength * housewidth) + .5*(houselength*(househeight - housewidth)); 

		System.out.print(peakSQ); 
	}

}
