package codingProject;

// WEEK 3 CODING ASSIGNMENT

// EDITTED BY - Joseph Falzini

public class Week3Project {

	public static void main(String[] args) {
		
// 1.)
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 16};
		
		int first = ages[0]; /// References the first element in an array. 
		int last = ages[ages.length - 1]; // References the last element in an array.
		
		System.out.println("First - Last = " + (first - last));
		
		int avg = 0;
		for (int age  : ages) {
			avg += age;
		}
		int realAvg = avg / ages.length;
		
		System.out.println("Average of the elements in the array: " + realAvg);
		
		
// 2.)
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int totalLength = 0;
		for (int i = 0; i < names.length; i++) {
			totalLength += names[i].length();
		}
		int avgLength = totalLength / names.length;
		
		System.out.println("Avg. Length: " + avgLength);

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();  // Used for spacing in Console.
		
// 3. & 4.) 
		String firstStr = names[0];
		String lastStr = names[names.length - 1];
		
		
// 5. & 6.)
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		int sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		
		System.out.println("Sum of Name Lengths: " + sum);
	
// 7.)
		String firstName = "Joseph";
		int repeat = 5;
		stringConcatenate(firstName, repeat);
		
// 8.)
		String lastName = "Falzini";
		System.out.println("My name is " + fullName(firstName, lastName));
		
// 9.)
		System.out.println("Is the sum of ages[] more than 100? - " + sumMoreThan100(ages));
		int[] newAges = {5, 6, 1, 3, 15, 31};
		System.out.println("Is the sum of newAges[] more than 100? - " + sumMoreThan100(newAges));

// 10.)
		double[] doubleNums = {4.3, 7.8, 10.1, 24.3, 78.0, 1.2};
		System.out.println("Average of doubleNums[] = " + doubleAvg(doubleNums));
	
// 11.)
		double[] doubleNums2 = {5.6, 2.4, 11.5, 26.4, 32.1, 3.1};
		System.out.println("Is doubleNums[] avg. greater than doubleNums2[] avg.? - " + 
							doubleGreaterAvg(doubleNums, doubleNums2));
		
// 12.)
		boolean isHot = true;
		double pocketChange = 15.25;
		System.out.println("Will I buy a drink today? - " + willBuyDrink(isHot, pocketChange));
		
// 13.)
		boolean raining = false;
		boolean hasRained = true;
		int currentTemp = 72;
		willGoHiking(raining, hasRained, currentTemp);
		
		
	}

// METHODS
	
	// 7.)
	public static void stringConcatenate(String word, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(word);
		}
		
		System.out.println();
	}
	
	// 8.)
	public static String fullName(String first, String last) {
		return first + " " + last;
	}
	
	// 9.)
	public static boolean sumMoreThan100(int[] x) {
		int sum = 0;
		
		for (int num : x) {
			sum += num;
		}
		
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// 10.)
	public static double doubleAvg(double[] y) {
		double avg = 0;
		
		for (double num : y) {
			avg += num;
		}
		
		double realAvg = avg / y.length;
		
		return realAvg;
	}
	
	// 11.)
	// Returns true if the first array average is greater than the second array average.
	public static boolean doubleGreaterAvg(double[] x, double[] y) {
		double firstAvg = doubleAvg(x);
		double secondAvg = doubleAvg(y);
		
		if (firstAvg > secondAvg) {
			return true;
		} else {
			return false;
		}
		
	} 
	
	// 12.)
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// 13.)
	// Method to see if the user will go hiking based off weather and other factors.
	public static void willGoHiking(boolean isRaining, boolean hasRained, int temp) {
		if (isRaining == false && hasRained == false && temp > 55) {
			System.out.println("It is a perfect day to go hiking!");
		} else if (isRaining == true) {
			System.out.println("It is raining, so no hiking.");
		} else if (hasRained == true && isRaining == false && temp > 65) {
			System.out.println("The weather is nice, but the trails might be muddy.");
		} else if (temp < 55) {
			System.out.println("It's too cold to hike today.");
		} else {
			System.out.println("Not a good day to go hiking.");
		}
	}
	
}
