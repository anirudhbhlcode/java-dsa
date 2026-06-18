package oops.strings;

public class StringQuestions {

    public static boolean isAllDigits(String str){
        return str.matches("[0-9]+");
    }

    public static boolean isAllLetters(String str){
        return str.matches("[a-zA-Z]+");
    }

    public static boolean isAllAlphanumeric(String str){
        return str.matches("[a-zA-Z0-9]+");
    }

    public static boolean isStrongPassword(String str){
        /* 
        - 8 characters minimum
        - atleast one digit
        - atleast one uppercase letter
        */
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        return str.matches(regex);
    }

    public static boolean isValidEmail(String str){
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        //quantifiers like +, *, ? are used to specify how many times a character or group can occur
        return str.matches(regex);
    }

    public static boolean isValidPhoneNumber(String str){
        String regex = "^[0-9]{10}$";
        return str.matches(regex);
    }

    public static void extractWordsFromString(String str){
        String regex = "\\s+";
        String[] words = str.split(regex);
        for(String word : words){
            System.out.println(word);
        }
    }

    public static void replaceVowelsWithAsterisk(String str){
        String regex = "[aeiouAEIOU]";
        String replacedString = str.replaceAll(regex, "*");
        System.out.println(replacedString);
    }

    public static void startWithLowercaseLettersEndwithDigits(String str){
        String regex = "^[a-z]+[0-9]+$";
        System.out.println(str.matches(regex));
    }

    public static boolean checkPalindrome(String str){
        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equals(reversedString);
    }

    public static void countPattern() {
        String text = "The number is 123 and 456";

        // Count how many digits appear
        String[] numbers = text.split("[^0-9]+");
        // ["", "123", "456", ""]
        int count = 0;
        for (String num : numbers) {
            if (!num.isEmpty()) {
                count++;
            }
        }

        System.out.println("Found " + count + " numbers");
    }
    public static void main(String[] args) {
        
        String code = "948928";
        System.out.println(isAllDigits(code));

        String name = "Krishna";
        System.out.println(isAllLetters(name));

        String password = "MyPassword123";
        System.out.println(isStrongPassword(password));

        String email = "krishna@example.com";
        System.out.println(isValidEmail(email));

        String phone = "1234567890";
        System.out.println(isValidPhoneNumber(phone));

        String sentence = "This is a sample sentence.";
        extractWordsFromString(sentence);

        String text = "Hello, my dog is cute";
        replaceVowelsWithAsterisk(text);

        String str = "abc123";
        startWithLowercaseLettersEndwithDigits(str);

        String palindrome = "racecar";
        System.out.println(checkPalindrome(palindrome));
    }
}
