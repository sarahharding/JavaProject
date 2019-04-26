import java.util.Scanner;
import java.util.Random;
public class Cards{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	Cards m = new Cards();

	String[] deck = new String[52];
	int c = -1;
		for(int i = 1; i <= 13; i++){
			deck[++c]=i+"_of_Diamonds";
			deck[++c]=i+"_of_Clubs";
			deck[++c]=i+"_of_Hearts";
			deck[++c]=i+"_of_Spades";
		}

	System.out.println("Not Shuffled");
	System.out.println("");
	for(int x = 1; x < deck.length; x++){
		System.out.println(deck[x]);
	}

	m.shuffle(deck);
	System.out.println("");
	System.out.println("");
	System.out.println("Shuffled");
	System.out.println("");
	for(int z = 1; z < deck.length; z++){
		System.out.println(deck[z]);
	}
		Index.main(null);

}

	public String[] shuffle(String[] deck){
		Random rnd = new Random();
		for (int i = deck.length -1; i >= 0; i--){
			int index = rnd.nextInt(i + 1);

			String a = deck[index];
			deck[index] = deck[i];
			deck [i] = a;
		}
		return deck;
	}
}





