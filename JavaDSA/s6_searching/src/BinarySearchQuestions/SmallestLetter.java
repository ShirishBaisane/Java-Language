package BinarySearchQuestions;

public class SmallestLetter {

	public static void main(String[] args) {
		char[] letters1 = {'c','f','j'};
		char target1 = 'a';
		char[] letters2 = {'c','f','j'};
		char target2 = 'c';
		char[] letters3 = {'x','x','y','y'};
		char target3 = 'z';
		
		System.out.println("Smallest letter greater that target is: "+nextGreatestLetter(letters1, target1));
		System.out.println("Smallest letter greater that target is: "+nextGreatestLetter(letters2, target2));
		System.out.println("Smallest letter greater that target is: "+nextGreatestLetter(letters3, target3));
	}

}
