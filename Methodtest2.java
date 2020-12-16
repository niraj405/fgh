class Methodtest2{

	private static double average(double first,double second){ 
		return (first + second) / 2;
	}	

	private static double average(double first,double second,double third){ 
		return (first + second + third) / 3;
	}	

	private static double average(double first,double second,double... remaining){ 
		double total = first + second;
		for(double value : remaining)
			total += value;
		return total / (2 + remaining.length); 
	}	

/*
	private static double getIncome(double invest,int period){
		return getIncome(invest,period,4);
	}	
*/
	public static void main(String args[]){
		System.out.printf("Average of Two Number :%f%n",average(6,18));
		System.out.printf("Average of Three Number :%f%n",average(6,18,36));
		System.out.printf("Average of Five Number :%f%n",average(6,18,36,42,48));
		System.out.printf("Average of Seven Number :%f%n",average(6,18,36,42,48,54,60));
	}
}
