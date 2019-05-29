import java.util.*;
 class Computer {
	String Brand;
	int price;
	double ramGb;
	
	public Computer(String Brand,int price,double ramGb){
		this.Brand=Brand;
		this.price=price;
		this.ramGb=ramGb;
}
}
class sortByBrand implements Comparator<Computer> {
		//@override
		public int compare(Computer c1,Computer c2) {
			return c1.Brand.compareTo(c2.Brand);
}
}
class sortByPrice implements Comparator<Computer> {
		//@override
		public int compare(Computer c1,Computer c2) {
			return (int)(c1.price-c2.price);
}
}
class sortByRam implements Comparator<Computer> {
		//@override
		public int compare(Computer c1,Computer c2) {
			return (int) (c1.ramGb-c2.ramGb);
}
}
public class Main{
		public static void main(String args[]){
		ArrayList<Computer> ar=new ArrayList<Computer>();
		ar.add(new Computer("Dell",14000,5.5));
		ar.add(new Computer("Zenith",11000,6.5));
		ar.add(new Computer("Lenova",18000,4.5));
			//Collections.sort(ar,new sortByBrand());
			//Collections.sort(ar,new sortByPrice());
			Collections.sort(ar,new sortByRam());
		for(Computer t:ar){
			System.out.println("BRAND :"+t.Brand);
			System.out.println("PRICE :"+t.price);
			System.out.println("RAM :"+t.ramGb);
}
}

}
