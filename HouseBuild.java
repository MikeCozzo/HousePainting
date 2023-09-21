import java.util.Scanner;
public class HouseBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("please enter width of house in feet: "); 
			double housewidth = sc.nextDouble(); 

			 

			System.out.print("please enter length of house in feet: "); 
			double houselength = sc.nextDouble(); 

			 

			System.out.print("please enter the height of house in feet"); 
			double househeight = sc.nextDouble(); 
			
			System.out.print("please enter the number of windows");
			double windnum = sc.nextDouble();
					
			System.out.print("please enter the length of the windows");
			double windlength = sc.nextDouble();
			
			System.out.print("please enter the width of the windows");
			double windwidth = sc.nextDouble();
			
			System.out.print("please enter the number of doors");
			double doornum = sc.nextDouble();
			
			System.out.print("please enter the length of the doors");
			double doorlength = sc.nextDouble();
			
			System.out.print("please enter the width of the doors");
			double doorwidth = sc.nextDouble();
			
			
			
			

			 
		double winddims = (windlength * windwidth);
		double windarea = (winddims * windnum);
		
		double doordims = (doorlength * doorwidth);
		double doorarea = (doordims * doornum);
		
		double minusarea = (windarea + doorarea);
	
		double sqft = (housewidth * houselength); 
		double peakSQ = (houselength * housewidth) + .5*(houselength*(househeight - housewidth)); 
		
		double finarea = (sqft + peakSQ);
		double truearea = (finarea - minusarea);
		double truecost = (truearea * 5);
		
		
			System.out.println("total area is " + truearea + "square feet");
			System.out.println("total cost is " + truecost + "dollars");
	}

}
