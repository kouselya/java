import java.util.*;
 class Computer implements Comparable<Computer>{
	String brand;
	int price;
	double ramGb;

		public int compareTo(Computer c1){
			return this.brand.compareTo(c1.brand);
		}
	
	public Computer(String brand,int price,double ramGb){
		this.brand=brand;
		this.price=price;
		this.ramGb=ramGb;
}
}
public class Main1{
		public static void main(String args[]){
		ArrayList<Computer> ar=new ArrayList<Computer>();
		ar.add(new Computer("Dell",14000,5.5));
		ar.add(new Computer("Zenith",11000,6.5));
		ar.add(new Computer("Lenova",18000,4.5));
			Collections.sort(ar);
			Collections.reverse(ar);
		for(Computer t:ar){
			System.out.println("BRAND :"+t.brand);
			System.out.println("PRICE :"+t.price);
			System.out.println("RAM :"+t.ramGb);
}
}
}
