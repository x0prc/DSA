import java.util.ArrayList;
import java.util.List;

class lettercombinations {
  
    // Let's declare a method to generate all possible letter combinations for a given phone number.
    public List<String> letterCombinations(String digits) {
        // A result list to store the final combinations.
        List<String> result = new ArrayList<>();
      
        // Return an empty list if the input digits string is empty.
        if (digits.length() == 0) {
            return result;
        }
      
        // Add an empty string as an initial value to start the combinations.
        result.add("");
      
        // Mapping of digit to letters as seen on a phone keypad.
        String[] digitToLetters = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
      
        // Iterate over each digit in the input string.
        for (char digit : digits.toCharArray()) {
            // Get the corresponding letters for the current digit.
            String letters = digitToLetters[digit - '2'];
          
            // Temp list to hold the combinations for the current digit.
            List<String> temp = new ArrayList<>();
          
            // Combine each result in the list with each letter for the current digit.
            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    // Add the new combination to the temp list.
                    temp.add(combination + letter);
                }
            }
          
            // Update the result list with the new set of combinations.
            result = temp;
        }
      
        // Return the complete list of combinations.
        return result;
    }
}
