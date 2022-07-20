package p2;

public class Shape {
	Shape(){
		
	}
	

}
class Square extends Shape{
	int a1;
	Square(int a){
		super();
		a1=a;
	}
	void display() {
		System.out.println("area of square is"+a1*a1);
	}
	
	
}
class Rectangle extends Square{
	int a2;
	Rectangle(int x,int y){
		super(x);
		a2=y;
	}
	void display() {
		System.out.println("area of rectangle is:"+a1*a2);
	}
	
}
class Main{
	
	public static void main(String...a) {
		Square ss= new Square(6); 
		
		Rectangle rr= new Rectangle(10,6);
		rr.display();
		
	}
}
