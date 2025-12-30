class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Create allowed set
        Set<Character> allowedSet = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++) {
            allowedSet.add(allowed.charAt(i));
        }

        int count = 0;

        // Loop through words
        for(int i = 0; i < words.length; i++) {
            boolean consistent = true;
            String word = words[i];

            for(int j = 0; j < word.length(); j++) {
                if(!allowedSet.contains(word.charAt(j))) {
                    consistent = false;
                    break;
                }
            }

            if(consistent) count++;
        }

        return count;
    }
}
