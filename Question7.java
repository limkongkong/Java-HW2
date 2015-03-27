public class Question7 {

    public static void main (String[] args) {
    	System.out.println("pi = 4*( 1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) is");
    	System.out.println (4 * ( 1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) ) );
    	System.out.println("pi = 4*( 1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13) is");
    	System.out.println (4 * ( 1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) +  (1.0/13)) );
    }
    
    
}
/*for the 2nd calculation, all 1 should be replaced with 1.0.*/