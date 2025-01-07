package icici.loans.collection;

import java.util.ArrayList;

public class list 
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("ravi");
		a.add(13.67f);
		a.add(20);
		System.out.println(a);
		System.out.println(a);

		System.out.println(a);
		
		a.set(2, "varun");
		System.out.println(a);
		
		a.remove(2);
		System.out.println(a);
		
		System.out.println(a.indexOf("ravi"));
		System.out.println(a.contains("varun"));






		
	}

}
