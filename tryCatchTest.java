class tryCatchTest{

	private static void square(String[] args ){
		try{
			double value = Float.parseFloat(args[0]);
			System.out.printf("Square of %f is: %f%n",value,value * value);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Missing Input.");
		}catch(NumberFormatException e){
			System.out.println("Bad Input.");
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Welcome user");
			square(args);
		System.out.println("Goodbye user");
	}
}
