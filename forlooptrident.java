import java.util.LinkedList;
import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int s = sc.nextInt();
		int h = sc.nextInt();
		for (int j=0; j<t; j++) {
			
			//output one star
			System.out.print("*");
			//output s spaces
			for (int i=0; i<s; i++) {
				System.out.print(" ");
			}
			//output one star
			System.out.print("*");
			//output s spaces
			for (int i=0; i<s; i++) {
				System.out.print(" ");
			}
			//output one star
			System.out.print("*");
			System.out.println();
		}

		for (int i=0; i<2*s+3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j=0; j<h; j++) {
			for (int i=0; i<1+s; i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
