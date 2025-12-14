class FindSubstring {

	// Return an array of the starting indices of all the concatenated substrings in s	
	public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> output = new ArrayList<>();

        if (s == null || words == null || words.length == 0) {
            return output;
        }

        int wordSize = words[0].length();
        int wordCount = words.length;
        int stringSize = wordSize * wordCount;

		Map<String, Integer> baseMap = new HashMap<>();
        for (String word : words) {
            baseMap.put(word, baseMap.getOrDefault(word, 0) + 1);
        }

        int start = 0;

        while (start <= s.length() - stringSize) {

			Map<String, Integer> map = new HashMap<>(baseMap);

            if (isValid(s, start, wordSize, wordCount, map)) {
                output.add(start);
            }

            start++;
        }

        return output;
    }

    private static boolean isValid(
            String s,
            int start,
            int wordSize,
            int wordCount,
            Map<String, Integer> map) {

        for (int i = 0; i < wordCount; i++) {
            int idx = start + i * wordSize;
            String word = s.substring(idx, idx + wordSize);

            Integer count = map.get(word);
            if (count == null) {
                return false;
            }

            if (count == 1) {
                map.remove(word);
            } else {
                map.put(word, count - 1);
            }
        }

        return true;
    }
}
