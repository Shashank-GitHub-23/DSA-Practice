import java.util.HashMap;

class Solution {

    public boolean checkWord(String word, HashMap<Character, Integer> hm) {
        HashMap<Character, Integer> wordCount = new HashMap<>();

        // Count frequency of characters in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            wordCount.put(ch, wordCount.getOrDefault(ch, 0) + 1);
        }

        // Check if the word contains all characters required by the license plate
        for (char ch : hm.keySet()) {
            if (wordCount.getOrDefault(ch, 0) < hm.get(ch)) {
                return false; // Word does not complete the license plate
            }
        }
        return true; // Word is a valid completing word
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Build a frequency map for letters in the license plate
        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = Character.toLowerCase(licensePlate.charAt(i));
            if (Character.isLetter(ch)) {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }

        String shortestWord = null;

        // Find the shortest word that completes the license plate
        for (String word : words) {
            if (checkWord(word, hm)) {
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }

        return shortestWord;
    }
}
