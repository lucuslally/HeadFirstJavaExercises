class Shuffle1 { //a-b c-d
	public static void main (String[] args){
		int x = 3; //1
		
		while (x > 0){ //2
			if (x > 2) {
				System.out.print("a");//3
			}

			if (x == 2) {
				System.out.print("b c"); //5
			}

			if (x == 1) {
				System.out.print("d");
				x = x - 1; //4
			}

			x = x - 1;
			System.out.print("-");//4
		}

	}

}