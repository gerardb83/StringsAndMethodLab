
public class StringLab {
	public static void main(String[] args) {
		capitalize("blaZes");
		wheresWaldo("striped Waldo!");
		firstThingsFirst("dog", "cat");
		reverse("All the kings men");
		soLong("So fun", "So all");
		afterMath("All is love");
		letterize("Java");
		
		StringMethods sm = new StringMethods();
		System.out.println(sm.capitalize("word"));
		System.out.println(sm.wheresWaldo("I wonder where Waldo is"));
		System.out.println(sm.firstThingsFirst("zebra", "cow"));
		System.out.println(sm.reverse("So many words!"));
		System.out.println(sm.afterMath("All math is love"));
		System.out.println(sm.camelCase("desert survival is all fun and games"));
	}

	public static void capitalize(String word) {
		System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
	}

	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("Waldo"));
	}

	public static void firstThingsFirst(String a, String b) {
		if (a.toLowerCase().charAt(0) < b.toLowerCase().charAt(0)) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b + " " + a);
		}
	}

	public static void reverse(String s) {
		int stringLength = s.length() - 1;
		for (int i = stringLength; i > -1; i--) {
			System.out.print(s.charAt(i));

		}
		System.out.println("");
	}

	public static void soLong(String a, String b) {
		if (a.length() == b.length()) {
			System.out.println(a + " " + b);
		} else if (a.length() > b.length()) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	public static void afterMath(String phrase) {
		if (phrase.toLowerCase().indexOf("math") != -1) {
			System.out.println(phrase.substring(phrase.indexOf("math")));
		} else {
			System.out.println("dud");
		}
	}
	
	public static void letterize(String word) {
		int wordLength = word.length();
		for(int i = 0; i < wordLength; i++) {
			System.out.println(word.charAt(i));			
		}
	}
	
}
