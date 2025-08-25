package string;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// The split() method in Java is used to divide a Strig into an array of
		// substrings
		// based on a specified delimiter (a regular expression).
		System.out.println("God is Faithful");
		System.out.println("God is Merciful");
		System.out.println("God is the Greatest");
		System.out.println("God is Awesome");
		// Addedd
		// Sub

		String sentence = "Jesus is King";
		String[] words = sentence.split(" "); // The space " " is the delimiter
		for (String word : words) {
			System.out.println(word);
		}
		String data = "apple, banana, orange";
		String[] fruits = data.split(",");
		System.out.println(Arrays.toString(fruits));

		String text = "one:two:three:four";
		String[] parts = text.split(":", 3); // With a limit of 2, the string is split only once, and the rest is
												// included in the second part.
		for (String part : parts) {
			System.out.println(part);
		}
		System.out.println(Arrays.toString(parts));

		String texts = "one,two.three";
		String[] parts1 = texts.split("\\."); // not just "."
		for (String part1 : parts1) {
			System.out.println(part1);
		}

	}

}
