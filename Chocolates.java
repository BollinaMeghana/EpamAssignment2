package MavenSample.EpamAssessment1;

import java.util.TreeMap;

public class Chocolates extends NewYearGift{
	String name ;
	public static TreeMap<Integer,String> t = new TreeMap<Integer,String>() ;
	public Chocolates(int weight , int price , String name) {
		w = weight ;
		p = price ;
		wait.add(w) ;
		if(!t.containsKey(price)) {
			t.put(price, name) ;
		}
		else {
			t.put(price, t.get(price)) ;
		}
	}
	public Chocolates() {
		// TODO Auto-generated constructor stub
	}
	public void sortChocos() {
		for(int i : t.keySet()) {
			System.out.println(t.get(i)+" "+i) ;
		}
	}
	public void getChocos(int l , int h) {
		System.out.println("Candies in range Rs."+l+" Rs."+h) ;
		for(int i : t.keySet()) {
			if(i >= l && i <= h) {
				System.out.println(i+" "+t.get(i));
			}
		}
		System.out.println();
	}
}
