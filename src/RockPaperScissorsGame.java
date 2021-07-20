import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
	
		
		Scanner input=new Scanner(System.in);
		
		

		System.out.println("Enter the name of player 1");
		String p1=input.nextLine();
		System.out.println("Enter the name of player 2");
		String p2=input.nextLine();
		System.out.println(" Round 1"); 
		System.out.println("What does "+p1+" play ? (R, P, or S)");
		String l1=input.nextLine();
		System.out.println("What does "+p2+" play ? (\"R\", \"P\", or \"S\")");
		String l2=input.nextLine();
		input.nextLine();
		int a=0;
		int b=0;
		if((l1.equals("R")||l1.equals("P")||l1.equals("S")) && (l2.equals("R")||l2.equals("P")||l2.equals("S"))) {
			
		
		if(l1.equals("R")&&l2.equals("S")) {
			a+=1;
			
		}
		
				
			else if(l1.equals("R")&&l2.equals("P")) {
						b+=1;
			}
		
		
				else if(l1.equals("R")&&l2.equals("R")) {
			a=0;
			b=0;
			
		}
		
				
			else if(l1.equals("S")&&l2.equals("R")) {
						b+=1;
			}
			else if(l1.equals("S")&&l2.equals("P")) {
			a+=1;
			
		}
		
				
			else if(l1.equals("S")&&l2.equals("S")) {
				a=0;
				b=0;
				
			}
			else if(l1.equals("P")&&l2.equals("R")) {
			a+=1;
			
		}
		
				
			else if(l1.equals("P")&&l2.equals("S")) {
						b+=1;
			}
			else  {
				a=0;
				b=0;
						
	}
		
		System.out.println(a+"  "+b);
		System.out.println(" Round 2"); 
		System.out.println("What does "+p1+" play ? (R, P, or S)");
		 String l1B=input.nextLine();
		System.out.println("What does "+p2+" play ? (\"R\", \"P\", or \"S\")");
		String  l2B=input.nextLine();
		input.nextLine();
		
		int a2=a;
		int b2=b;
		
		if((l1B.equals("R")||l1B.equals("P")||l1B.equals("S"))&&(l2B.equals("R")||l2B.equals("P")||l2B.equals("S"))) {
		if(l1B.equals("R")&&l2B.equals("S")) {
			a2+=1;
			
		}
		
				
			else if(l1B.equals("R")&&l2B.equals("P")) {
						b2+=1;
			}
		
		
				else if(l1B.equals("R")&&l2B.equals("R")) {
			a2=a;
			b2=b;
			
		}
		
				
			else if(l1B.equals("S")&&l2B.equals("R")) {
						b2+=1;
			}
			else if(l1B.equals("S")&&l2B.equals("P")) {
			a2+=1;
			
		}
		
				
			else if(l1B.equals("S")&&l2B.equals("S")) {
				a2=a;
				b2=b;
				
			}
			else if(l1B.equals("P")&&l2B.equals("R")) {
			a2+=1;
			
		}
		
				
			else if(l1B.equals("P")&&l2B.equals("S")) {
						b2+=1;
			}
	
			else  {
				a2=a;
				b2=b;
				
	
			}
		System.out.println(a2+"  "+b2);
		int a3=a2;
		int b3=b2;
	
		System.out.println(" Round 3"); 
		System.out.println("What does "+p1+" play ? (R, P, or S)");
		 l1B=input.nextLine();
		System.out.println("What does "+p2+" play ? (\"R\", \"P\", or \"S\")");
		 l2B=input.nextLine();
		input.nextLine();

		
		
		
		if((l1B.equals("R")||l1B.equals("P")||l1B.equals("S"))&&(l2B.equals("R")||l2B.equals("P")||l2B.equals("S"))) {
		
		if(l1B.equals("R")&&l2B.equals("S")) {
			a3+=1;
			
		}
		
				
			else if(l1B.equals("R")&&l2B.equals("P")) {
						b3+=1;
			}
		
		
				else if(l1B.equals("R")&&l2B.equals("R")) {
			a3=a2;
			b3=b2;
			
		}
		
				
			else if(l1B.equals("S")&&l2B.equals("R")) {
						b3+=1;
			}
			else if(l1B.equals("S")&&l2B.equals("P")) {
			a3+=1;
			
		}
		
				
			else if(l1B.equals("S")&&l2B.equals("S")) {
				a3=a2;
				b3=b2;
				
			}
			else if(l1B.equals("P")&&l2B.equals("R")) {
			a3+=1;
			
		}
		
				
			else if(l1B.equals("P")&&l2B.equals("S")) {
						b3+=1;
			}
			else  {
				a3=a2;
				b3=b2;
				
	
			}	
		System.out.println(a3+"  "+b3);
		if(a3 >b3) {
			System.out.println(p1+" wins"); 
		}
		else if(b3 >a3){
			System.out.println(p2+" wins"); 
		}
		else {
			System.out.println(" Game over: a tie between "+p1+" and "+p2);
		}
		}
		else {
			System.out.println(" Error"); 
		}
		
		
		}
		else {
			System.out.println(" Error"); 
		}
		
		}
		else {
			System.out.println(" Error"); 
		}
		
		input.close();
		
	

}
}