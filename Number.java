

		import java.util.Scanner;

		public class Number{
 		 public static void main(String[] args){


		Scanner input = new Scanner(System.in);

    //Declare variables/types

    int x = 0;


    //Add code here for Inputs, if/else statements, while loops


    System.out.println("Enter a number: ");
    	x = input.nextInt();

    	if(x > 0){
				System.out.println("Your number is positive");
		}else if(x < 0){
			System.out.println("Your number is negative");
		}else if(x == 0){
			System.out.println("The number you entered is zero");
		}

		Index.main(null);
  }
}