package MavenSample.EpamAssessment1;

import java.util.ArrayList;

public class NewYearGift {
	public int w ;
	public int p ;
	public static ArrayList<Integer> wait = new ArrayList<Integer>() ;
	public int getWeight() {
		int totalWeight = 0 ;
		for(int i = 0 ; i < wait.size() ; i++) {
			totalWeight += wait.get(i) ;
		}
		return totalWeight ;
	}
}
