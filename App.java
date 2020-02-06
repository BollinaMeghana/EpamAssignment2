package MavenSample.EpamAssessment1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Chocolates chocolates = new Chocolates() ;
    	Chocolates chocolates1 = new Chocolates(50,100,"asha");
    	Chocolates chocolates2 = new Chocolates(100,150,"kacha mango");
    	Chocolates chocolates3 = new Chocolates(150,200,"eclairs");
    	Chocolates chocolates4 = new Chocolates(100,130,"maha lacto");
    	Chocolates chocolates5 = new Chocolates(75,120,"rose");
    	Sweets sweets1 = new Sweets(50 , 100);
    	Sweets sweets2 = new Sweets(75 , 100);
    	Sweets sweets3 = new Sweets(100 , 150);
    	Sweets sweets4 = new Sweets(150 , 200);
    	Sweets sweets5 = new Sweets(175 , 250);
    	NewYearGift gift = new NewYearGift() ;
    	System.out.println("Total weight : "+gift.getWeight()) ;
    	System.out.println("Chocolates are sorted based on the price of each chocolate : ") ;
    	chocolates.sortChocos();
    	chocolates.getChocos(100,150) ;
    }
}
