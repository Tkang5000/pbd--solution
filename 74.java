import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Type a message...");
  String msg = sc.nextLine();
  System.out.println("Your message is " + msg.length() + " letters long.");
  int length = msg.length();
  System.out.println("Your first letter is " + msg.charAt(0) + " at number 0 and your last letter is " + msg.charAt(length-1)+ "at number " + length);  
  }
}
