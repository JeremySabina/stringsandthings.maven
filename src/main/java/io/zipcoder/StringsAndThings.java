package io.zipcoder;


import java.util.ArrayList;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    // convert String input into an array of words.
    // check the words if y or z at the end of each word.
    //
    public Integer countYZ(String input) {
        int numberOfYOrZ = 0;
        String[] wordArray = input.split(" ");
        for (int currentIndex = 0; currentIndex < wordArray.length; currentIndex++) {
            String currentWord = wordArray[currentIndex];

            int numberOfCharacters = currentWord.length(); //wordInput.length ex. home = integer 4
            int lastIndex = numberOfCharacters - 1;  // last character = integer 3
            char lastChar = currentWord.charAt(lastIndex); // wordInput gets the index of the last character
            if (lastChar == 'y' || lastChar == 'z') {
                numberOfYOrZ++;
            }
        }
        return numberOfYOrZ;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {

        return base.replace(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */

    // Need to compare the count of "is" and "not"
    // Turn the string into and array?

    // Given a string "isthisnotnot" should return true
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        Integer numberOfIs = 0;
        Integer numberOfNot = 0;
        // String newInput = input.toLowercase(); if we wanted to lowercase

        for (int currentCharacter = 0; currentCharacter < input.length() -1; currentCharacter++) {

            // loops through characters 1 by 1 in a string

            if (input.charAt(currentCharacter) == 'i' && input.charAt(currentCharacter + 1) == 's') {
                numberOfIs++;
            }
            if (input.charAt(currentCharacter) == 'n' && input.charAt(currentCharacter + 1) == 'o' &&
                    input.charAt(currentCharacter + 2) == 't') {
                numberOfNot++;
            }
        } return numberOfIs.equals(numberOfNot);
    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */

    // 'g' will be equal to "happy" if another 'g'
    //
    public Boolean gIsHappy(String input) {
      return input.contains("gg");
    }

      /*  int counter = 0;
        int gIsHappy = 0;
        for (int currentCharacter = 0; currentCharacter < input.length() - 1; currentCharacter++) {

            if (input.charAt(currentCharacter) == 'g' && input.charAt(currentCharacter + 1) == 'g') {
            }

            counter++;
// sad code

*/
    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */


    // Lets break this down..
    // triple = the same character 3 * in a row
    // make a for loop that adds 3 characters of the same name to triple of the same name
    //

    public Integer countTriple(String input){
        int count = 0;
        for(int i = 0; i <= input.length() -3; i++){
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2))

            count++;
        }
        return count;
    }

}
// What was wrong? split my i variable into two different variables. added unneeded brackets on the end of the for loop.

            // Not sure what I did. Could not figure out what code I was combining together.

/*
    }
    */