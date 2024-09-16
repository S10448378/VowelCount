public class VowelCount {

    public static void main(String[] args) {
        // Create a scanner to take user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Call the countVowels function and display the result
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase to handle both uppercase and lowercase vowels
        sentence = sentence.toLowerCase();
        // Initialize a variable to store the count of vowels
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            // Check if the character is a vowel
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        // Define a string containing all vowels
        String vowels = "aeiou";
        // Check if the character is in the string of vowels
        return vowels.indexOf(c) != -1;
    }
}
