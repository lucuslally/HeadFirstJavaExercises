class MixedMessages {
	public static void main(String[] args){
		int x = 0;
		int y = 0;

		while (x < 5){
			
			//input example start
			if ( y < 5) {
				x = x + 1;
				
				if ( y < 3){
					x = x - 1;
				}//if
			}//if
			y = y + 2;
			//input example end
			System.out.print(x + "" + y + " ");
			x = x + 1;
			//Output: 02 14 36 48  
		}//while	
	}//statement
}//class
