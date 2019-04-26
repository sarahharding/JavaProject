

		import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){

		Scanner input = new Scanner(System.in);

    //Declare variables/types

    	String name;
    	int age;





    //Add code here for Inputs, if/else statements, while loops

    		System.out.print("Enter your name: ");
    			name = input.next();

    		System.out.print("Enter your age: ");
    			age = input.nextInt();


    			int counter = 1;
    			while(counter <= age){
					System.out.println(counter+". "+name);
				counter++;
			}


		Index.main(null);

  }
}