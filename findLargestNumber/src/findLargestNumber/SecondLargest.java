package findLargestNumber;

public class SecondLargest {
	public static int meth1(int a[],int b) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					a[i]=a[j];
					temp=a[i];
					a[j]=temp;
				}
			}
			
		}
		
		return a[b-1];
	}

	public static void main(String[] args) 
	{
		int a[] = {1,4,6,7};
	System.out.println("1 st largest "+meth1(a,4));
	
	}

}
