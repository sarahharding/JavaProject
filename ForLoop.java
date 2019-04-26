

	import java.util.Scanner;

public class ForLoop{
  public static void main(String[] args){

	Scanner input = new Scanner(System.in);

    //Declare variables/types

    	int a = 0;
		int sum = 0;



    //Add code here for Inputs, if/else statements, while loops


    	for(int counter = 1; counter <= 10; counter = counter + 1){
				System.out.print("Enter number "+counter+": ");
					 a = input.nextInt();

					 if(a % 2 != 0){
						 sum += a;
					 }

				}


				System.out.println("Sum of all odd numbers is: "+sum);


		Index.main(null);


  }
}