class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    HashMap<String, List<String>> gpAnagHM = new HashMap<>();

    for(String st : strs){
      char[] charStr = st.toCharArray();
      Arrays.sort(charStr);
      String sortedStr = new String (charStr);
      
      gpAnagHM.putIfAbsent(sortedStr,new ArrayList<String>());
      gpAnagHM.get(sortedStr).add(st);
      
    }
    return new ArrayList<List<String>>(gpAnagHM.values());

    }
}
