package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text string:");
        String exampleText = input.nextLine();
        //String exampleText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> letterCount = new HashMap<>();
        char[] lettersInString = exampleText.toUpperCase().toCharArray();
        for (char character: lettersInString) {
            if (!letterCount.containsKey(character)) {
                letterCount.put(character, 1);
            }else {
                letterCount.put(character,letterCount.get(character)+1);
            }
        } for (Map.Entry<Character, Integer> letter : letterCount.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
