class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character,Integer> iaHMs = new HashMap<>();
        HashMap <Character, Integer> iaHMt = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            iaHMs.put(s.charAt(i), iaHMs.getOrDefault(s.charAt(i),0 )+1);
        }

        for(int j = 0 ; j < t.length(); j++){
            iaHMt.put(t.charAt(j), iaHMt.getOrDefault(t.charAt(j), 0)+1);
        }

        if(iaHMs.equals(iaHMt)){
            return true;
        }else{
            return false;
        }

    }
}
