/**
* <h1>Hdtv</h1>
* This program shows the functionality how we can sort an ArrayList
* having objects of a user defined class
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/
package assignment9.session1;

import java.util.*;


public class Hdtv {
	String brandName;
	int size;
	//parameterized constructor to initialize Hdtv object
	public Hdtv(String brandName, int size) {
		super();
		this.brandName = brandName;
		this.size = size;
	}
	//overriding toString method to print the object details
	public String toString(){
		return "BrandName: "+brandName+", Size: "+size;
	}
	
}

class AddHdtv implements Comparator<Hdtv>{
	public static void main(String[] args) {
		//creating Hdtv objects through parameterized constructor
		Hdtv tv1 = new  Hdtv("Sony",24);
		Hdtv tv2 = new  Hdtv("Samsung",40);
		Hdtv tv3 = new  Hdtv("LG",32);
		//ArrayList to hold the Hdtv objects
		ArrayList<Hdtv> arrayList1 = new ArrayList<Hdtv>();
		//adding Hdtv objects in ArrayList
		arrayList1.add(tv1);
		arrayList1.add(tv2);
		arrayList1.add(tv3);
		//using Collections class sort method to sort Hdtv objects using compare method
		Collections.sort(arrayList1,new AddHdtv());
		//iterator to iterate through the Hdtv objects
		Iterator<Hdtv> itr = arrayList1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
	//overriding compare method to sort the Hdtv objects in ascending order of size
	@Override
	public int compare(Hdtv o1, Hdtv o2) {
		if(o1.size > o2.size){
			return +1;
		}
		else if(o1.size < o2.size){
			return -1;
		}
		else{
			return 0;
		}
	}
}
