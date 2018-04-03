import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
class Main{

	public static void main(String[] args) {
		
    Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welome to alvin's blackjack program!");
	  
	  //You draw 2 cards
	  int first = 2 + r.nextInt(11);
	  int second = 2 + r.nextInt(11);
	  System.out.println("you get a " + first + " and a " + second);
	  System.out.println("you card's total is " + (first + second));
	  //dealer draw 2 cards
	  int dfirst = 2 + r.nextInt(11);
	  int dsecond = 2 + r.nextInt(11);
	  System.out.println("\nThe dealer has a " + dfirst + " showing and a card hidden card.");
	  System.out.println("His total is hidden, too.");
	  
	  //hit or stay
	  System.out.println("\nHit or Stay");
	  String hos = sc.next();
	  int total = 0;
	  int hit1 = 2 + r.nextInt(11);
	  while (hos.equals("Hit")) {
	    hit1 = 2 + r.nextInt(11);
	    System.out.println("\nYou drew an " + hit1);
	    total = total + hit1;
	    System.out.println("Your new card total is " + (first+second+total));
	    System.out.println("\nHit or Stay");
	    hos = sc.next();
	    hit1 = 2 + r.nextInt();
	    
	  }
	    System.out.println("It is the dealer's turn");
	    System.out.println("His other card is " + dsecond);
	    System.out.println("His total was " + dfirst + dsecond);
	    while ((dfirst + dsecond)>=16){
	      System.out.println("The dealer hits");
	      int dhit = 2 + r.nextInt(11);
	      System.out.println("He drew a " + dhit +" and his total is dfirst + dsecond + dhit");
	    }
	    
	  }
  }

