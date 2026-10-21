class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String , List<String>> gaHM = new HashMap<>();

        for(String s : strs){
            char[] sCharArr = s.toCharArray();
            Arrays.sort(sCharArr);
            String sortedString = new String(sCharArr);

            if(!gaHM.containsKey(sortedString)){
                gaHM.put(sortedString, new ArrayList<>());
            }

            gaHM.get(sortedString).add(s);


        }

        List<List<String>> result = new ArrayList<>(gaHM.values());

            return result;
        
    }
}
