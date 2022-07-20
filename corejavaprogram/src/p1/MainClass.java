package p1;

class Base{
	Base(){
		
	}
	
	Base(int a){
		this();
		System.out.println("the area of rectangle"+a);
		
	}
	
}
class child extends Base{
	int m;
	child(int k){
		super(k);
		m=k;
		System.out.println("child class constructor");
		
	}
	void display() {
		System.out.println("area of square is "+m*m);
	}
	
	
}
public class MainClass {

	public static void main(String[] args) {
		child c= new child(6);
		c.display();
	}

}
