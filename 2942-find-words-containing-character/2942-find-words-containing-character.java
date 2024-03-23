class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            // if(words[i].indexOf(x)!=-1){
            //     al.add(i);
            // }
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    al.add(i);
                    break;
                }
            }
        }
        return al;
    }
}