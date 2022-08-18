class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n < 1) return result;
        if (n == 1) {
            result.add("()");
            return result;
        }
        List<String> list = generateParenthesis(n - 1);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int length = str.length();
            for (int j = 0; j < length; j++) set.add(str.substring(0, j) + "()" + str.substring(j));
            set.add(str.substring(0) + "()");
        }
        result.addAll(set);
        return result;
    }
}