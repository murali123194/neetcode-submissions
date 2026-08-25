class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Sort the Array of words
        // Take the first letter of the first word and then check whehter it contains that at the same index ,if S add it to the result 
        // If not return th result

        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        String firstWord=strs[0];
        for(int i=0;i<firstWord.length();i++){
            for(String s: strs){
                if(s.charAt(i)!=firstWord.charAt(i)){
                    return sb.toString();
                }

            }
            sb.append(firstWord.charAt(i));
        }

        return sb.toString();
        
        
    }
}