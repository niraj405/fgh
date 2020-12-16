class tryFinally{

	private static void square(String[] args ){
		System.out.println("Accquiring Resources...");
			try{
				double value = Float.parseFloat(args[0]);
				System.out.printf("Square of %f is: %f%n",value,value * value);
			}finally{
				System.out.println("Releasing Resources...");
			}
		}
	
	
	public static void main(String args[])
	{
		System.out.println("Welcome user");
		try{
			square(args);
		}catch(Exception e){
			System.out.printf("Input error: %s%n", e.getMessage());
		}
		System.out.println("Goodbye user");
	}
}
