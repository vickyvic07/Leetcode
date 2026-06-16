class Solution {
    public int numberOfSpecialChars(String s) {
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                if (Math.abs(s.charAt(i) - s.charAt(j)) == 32) {

                    char ch = Character.toLowerCase(s.charAt(i));

                    if (!s1.contains(String.valueOf(ch))) {
                        s1 += ch;
                    }
                }
            }
        }

        return s1.length();
    }
}