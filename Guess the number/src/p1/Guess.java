package p1;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int r=(int) (Math.random()*10);
	System.out.println("enete the number to guess");
	int n=s.nextInt();
	
	int c=1;
	
	while(n!=r) {
	c++;
	
	if(n<r) {
		System.out.println("enter max");
		
		
	}
	else {
		System.out.println("enter min");
	}
		System.out.println("eneter another number");
		n=s.nextInt();
		if(c>3) {
			n=r;
			System.out.println("limit exid game over");
		}
}
		
	
	if(c==1) {System.out.println("you are corect  *****");}
	if(c==2) {System.out.println("you are corect  ****");}
	if(c==3) {System.out.println("you are corect  ***");}
	
	
	}

}
