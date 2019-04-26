

		import java.util.Scanner;

		public class Two{
  public static void main(String[] args){

			Scanner input = new Scanner(System.in);

    //Declare variables/types

    	int x;
    	int y;


    //Add code here for Inputs, if/else statements, while loops

    		System.out.print("Enter a number for x: ");
    			x = input.nextInt();


    		System.out.print("Enter a number for y: ");
    			y = input.nextInt();



    		if( (x == 2) && (y == 2) ){
				System.out.println("Both numbers are equal to 2.");
			}
			else if( (x == 2) || (y == 2) ){
				System.out.println("One number is equal to 2");
				if ( x == 2 ){
					System.out.println("x = 2");
				}if ( y == 2){
					System.out.println("y = 2");
				}
			}else{
				System.out.println("Neiher x or y is equal to 2");
			}

			Index.main(null);
  }
}