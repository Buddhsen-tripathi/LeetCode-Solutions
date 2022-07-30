class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character, Integer> countMap = createLetterCountMap(words2);
        return Arrays.stream(words1).filter(word1 -> isUniversal(word1, countMap)).collect(Collectors.toList());
    }

    private Map<Character, Integer> createLetterCountMap(String[] words2) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (String word2 : words2) {
            Map<Character, Integer> word2Letters = new HashMap<>();
            for (char c : word2.toCharArray()) {
                word2Letters.put(c, word2Letters.getOrDefault(c, 0) + 1);
                if (!countMap.containsKey(c) || word2Letters.get(c) > countMap.get(c))
                    countMap.put(c, word2Letters.get(c));
            }
        }

        return countMap;
    }

    private boolean isUniversal(String word1, Map<Character, Integer> countMap) {
        Map<Character, Integer> word1map = new HashMap<>();
        for (char c : word1.toCharArray()) {
            if (countMap.containsKey(c)) {
                word1map.put(c, word1map.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : countMap.keySet()) {
            if (!word1map.containsKey(c) || countMap.get(c) > word1map.get(c))
                return false;
        }
        return true;
    }
}