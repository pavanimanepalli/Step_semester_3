package string_operations.class_problems;

public class VowelConsonantCounter {

    public void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch != ' ') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels
                + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        VowelConsonantCounter obj = new VowelConsonantCounter();
        obj.countVowelsAndConsonants("Java Programming");
    }
}