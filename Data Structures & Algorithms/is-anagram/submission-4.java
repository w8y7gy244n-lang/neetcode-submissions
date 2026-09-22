class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> anagramS = new HashMap<>();
        HashMap<Character, Integer> anagramT = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }
        char[] characterS = s.toCharArray();
        char[] characterT = t.toCharArray();

        for(char cS : characterS)
        {
            anagramS.put(cS , anagramS.getOrDefault(cS, 0) +1);
        }

        for(char cT : characterT)
        {
            anagramT.put(cT, anagramT.getOrDefault(cT, 0) +1);
        }

        return anagramS.equals(anagramT);

    }
}
