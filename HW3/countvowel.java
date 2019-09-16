package HW3;

public class CountVowels implements Comp730830StringUtils {
    public static void doWork(String[] args) {

        String line = "W3lcom3 2 J2va 830.";  /** Given String */

        int vowels = 0;  /** vowels set to 0 */

        line = line.toLowerCase(); /** converts string to lowercase */

        for(int i = 0; i < line.length(); ++i) /** begins loop */

        {
            char vowel = line.charAt(i);

            if(vowel == 'a' || vowel == 'e' || vowel == 'i'|| vowel == 'o' || vowel == 'u') {

                ++vowels;
            }
        }

        System.out.println("Vowels: " + vowels);

public String getMyName() {
    return "CountVowels() Class";
}