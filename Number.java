package Question3;

public abstract class Number { // CLASS
	
	abstract double getNumber();
	
	public static void main(String[] args) { // MAIN
		// TODO Auto-generated method stub
		
		GenericCircle<NumberDouble> c1 = new GenericCircle<NumberDouble>(new NumberDouble(6.9));
		GenericCircle<NumberInt> c2 = new GenericCircle<NumberInt>(new NumberInt(6));
		
		c1.display();
		c2.display();
		
	} /// end MAIN

	
} // end CLASS
