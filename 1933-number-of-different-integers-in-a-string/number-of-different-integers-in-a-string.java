class Solution {
    public int numDifferentIntegers(String word) {
        List<String> n = new ArrayList<>();
        StringBuilder n1 = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            if(Character.isDigit(word.charAt(i))){
                n1.append(word.charAt(i));
            }else{
                if(n1.length() > 0){
                    String num = n1.toString().replaceFirst("^0+", "");
                    if(num.equals("")){
                        num = "0";
                    }
                    if(!n.contains(num)){
                        n.add(num);
                    }
                    n1.setLength(0);
                }
            }
        }
        if(n1.length() > 0){
            String num = n1.toString().replaceFirst("^0+", "");
            if(num.equals("")){
                num = "0";
            }
            if(!n.contains(num)){
                n.add(num);
            }
        }
        return n.size();
    }
}