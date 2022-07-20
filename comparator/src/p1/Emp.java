package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Emp  {

	/*
	 * @Override public int compareTo(Emp o) {
	 * 
	 * return this.getEmpId()-o.getEmpId(); }
	 */
	
	private String name;
	private String phone;
	private int empId;
	
	
	public Emp(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public int getEmpId() {
		return empId;
	}
	
	
	
		@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}

		public static void main(String...args) {
	
			ArrayList<Emp> emps= new ArrayList<>();
			emps.add(new Emp("durgesh","1234",12));
			emps.add(new Emp("ankit","123",11));
			emps.add(new Emp("bhavesh","977",45));
			
			System.out.println(emps);
			
			Collections.sort(emps,new Comparable());
			System.out.println(emps);
			
			Collections.sort(emps,new NameComparable());
			System.out.println(emps);
			
		}

		
}
