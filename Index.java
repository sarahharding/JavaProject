import java.util.Scanner;

public class Index{
	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("-----------MENU----------");
	System.out.println("");
	System.out.println("");
	System.out.println("1) Exercise 1 - Lisa");
	System.out.println("2) Exercise 2 - BigNumber");
	System.out.println("3) Exercise 3 - Number");
	System.out.println("4) Exercise 4 - Two");
	System.out.println("5) Exercise 5 - NameAge");
	System.out.println("6) Exercise 6 - ForLoop");
	System.out.println("7) Exercise 7 - Months");
	System.out.println("8) Exercise 8 - Cards");
	System.out.println("9) EXIT");
	System.out.println("");
	System.out.print("Please enter the option <1 - 9>: ");
	int choice = input.nextInt();



	if(choice == 1){
		Lisa.main(null);
	}

	else if(choice == 2){
		BigNumber.main(null);
	}

	else if(choice == 3){
		Number.main(null);
	}

	else if(choice == 4){
		Two.main(null);
	}

	else if(choice == 5){
		NameAge.main(null);
	}

	else if(choice == 6){
		ForLoop.main(null);
	}

	else if(choice == 7){
		Months.main(null);
	}

	else if(choice == 8){
		Cards.main(null);
	}




	}
}