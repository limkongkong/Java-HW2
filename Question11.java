public class Question11 {
	
	public static void main (String [] args ) {
		System.out.println("One birth every 7 seconds");
		System.out.println("One death every 13 seconds");
		System.out.println("One new immigrant every 45 seconds");
		System.out.println("One days has 24*60*60 = 86400 Sec");
		System.out.println("The population of birth rate in 5 years would be ");
		System.out.println(86400*365/7);
		System.out.println("The population of death would be ");
		System.out.println(86400*365/13);
		System.out.println("The population of new immigrant is ");
		System.out.println(86400*365/45);
		System.out.println("The total population in 5 years would be");
		System.out.println(312032486+(86400*365/45)+(86400*365/7)-(86400*365/13));
	}
	
	}
	/*missing "}" in original code*/
	
