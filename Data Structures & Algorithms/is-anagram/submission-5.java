class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> anagramHM = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        //Since lengths equal, evaluate under same for loop.
        for(int i = 0; i < s.length() ; i++){ 

            int frequencyS = anagramHM.getOrDefault(s.charAt(i),0)+1;
            if(frequencyS == 0){
                anagramHM.remove(s.charAt(i));
            }else{
                anagramHM.put(s.charAt(i), frequencyS);
            }
            int frequencyT = anagramHM.getOrDefault(t.charAt(i),0)-1;
            if(frequencyT == 0){
                anagramHM.remove(t.charAt(i));
            }else{
                anagramHM.put(t.charAt(i), frequencyT);
            }
        }
        return anagramHM.isEmpty();

        }

    }
