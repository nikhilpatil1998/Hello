package Interaupted;
class Thread1 extends Thread{
	@Override
	public void run() {
	
		
			
			try {
				for(int i=1;i<=5;i++) {
				System.out.println("child Thread"+i);
				Thread.sleep(1000);
				}
			} catch (Exception e) {
				
				System.out.println("in exception block");
			}
		
		
	}
	
}
public class App {

	public static void main(String[] args) {
		Thread1 t= new Thread1();
		t.start();
		t.interrupt();
	

	}

}
