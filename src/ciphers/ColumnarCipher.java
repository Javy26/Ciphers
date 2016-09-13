package ciphers;
import java.util.Scanner;
public class ColumnarCipher {
	
	


		
		@SuppressWarnings("resource")
		public static void main(String[] args){
			
			String cipher;
			int matrix;
			
			Scanner columnar = new Scanner(System.in);
			
			System.out.println("Enter a word to be encrypted");
			
			cipher = columnar.nextLine();
			System.out.println("What matrix would you like to be output?");
			System.out.println("2 for 2*2 matrix");
			System.out.println("3 for 3*3 matrix");
			matrix = columnar.nextInt();
			
			
		 for(int i=0, count=0; i<cipher.length();i++)
		 {
			 
			 if(matrix ==2)
				 
			 {
				 count++;
				 char temp=(char) ((cipher.charAt(i)));
				 System.out.print(temp);
				 if (count ==2)
				{
					System.out.println();
					 count=0;
				}
			 }
		 
			if(matrix==3){
				
				count++;
				char temp=(char) ((cipher.charAt(i)));
				System.out.print(temp);
				 
				if(count==3)
				{
					System.out.println();
					count=0;	
				}
				
				 
			}
				
				
		 }
			
			
		}
		 
			
			
		}



