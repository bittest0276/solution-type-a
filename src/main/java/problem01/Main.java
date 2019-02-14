package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		int count = 0;
		String str = Integer.toString(number);	
		
		if(str.contains("3")) {
			count++;
		} 
		if (str.contains("6")) {
			count++;
		} 
		if (str.contains("9")) {
			count++;
		}
		if(str.equals("33") || str.equals("66") || str.equals("99")) {
			count = 2;
		}
		
		return count;
		
		/*
		int count = 0;
		String str = Integer.toString(number);
		int strLength = str.length();
		
		
		for(int i = 0; i < strLength; i++) {
			if(strLength == 1) {
				continue;
			} else if (str.charAt(i).equals(number)))
		}
		*/
	}
}