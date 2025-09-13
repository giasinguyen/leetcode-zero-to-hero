class Solution {
    public int maxFreqSum(String s) {
        String vowels = "aeiou";
        Map<Character, Integer> freq = new HashMap<>();

        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int maxVowel = 0;
        int maxConsonant = 0;
        for(char c : vowels.toCharArray()){
            if(freq.containsKey(c)){
                maxVowel = Math.max(maxVowel, freq.get(c));
            }
        }

        for(char c : freq.keySet()){
            if(vowels.indexOf(c) == -1){
                maxConsonant = Math.max(maxConsonant, freq.get(c));
            }
        }

        return maxVowel + maxConsonant;
    }
}