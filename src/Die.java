import java.util.Random;
import java.util.Scanner;

public class Die {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Faces ");
		int faces = sc.nextInt();
		 roll(faces);				
	}

	private static void roll(int faces) {
		// TODO Auto-generated method stub
Random rand = new Random();
		
		if(faces==6){
			
			int rand_int1 = 1 + rand.nextInt(6);	
			System.out.println("\n6 Faced die rolls out to : " + rand_int1);
			
		}
		
		else if(faces==4){
			
			int rand_int1 = 1 + rand.nextInt(4);
			System.out.println("\n4 Faced die rolls out to : " + rand_int1);
			
		}
		
		else
		{
			
			int rand_int1 = rand.nextInt(2);
			
			if(rand_int1==0){
				System.out.println("\n2 Faced die rolls out to : " + "False");
			}
			
			else System.out.println("\n2 Faced die rolls out to : " + "True");
		}

	}
	
}
