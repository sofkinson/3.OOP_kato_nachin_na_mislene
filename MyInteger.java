package tretoPaketche;

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isOdd() {
		return MyInteger.isOdd(this.value);
	}
	
	public boolean isEven() {
		return MyInteger.isEven(this.value);
	}
	
	public boolean isPrime() {
		return MyInteger.isPrime(this.value);
	}
	
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	public static boolean isEven(int value) {
		return ! MyInteger.isOdd(value);
	}
	
	public static boolean isPrime(int value) {
		int maxDivider = (int)Math.sqrt(value);
		for(int i = 2; i <= maxDivider; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isOdd(MyInteger value) {
		return MyInteger.isOdd(value.getValue());
	}
	
	public static boolean isEven(MyInteger value) {
		return ! MyInteger.isEven(value.getValue());
	}
	
	public static boolean isPrime(MyInteger value) {
		return MyInteger.isPrime(value.getValue());
	}
	
	static int parseInt(char[] array) {
		return MyInteger.parseInt(new String(array));
	}
	
	static int parseInt(String array) {
		return Integer.parseInt(array);
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger value) {
		return this.value == value.getValue();
	}

}





