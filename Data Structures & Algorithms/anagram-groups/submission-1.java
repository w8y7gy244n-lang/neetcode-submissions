class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      HashMap<String, List<String>> gaHM = new HashMap<>();

      for(String str : strs){

       char[] strToChArr = str.toCharArray();
       Arrays.sort(strToChArr);
       String sortedKeyStr = new String(strToChArr);

       if(!gaHM.containsKey(sortedKeyStr)){
        List <String> gaList = new ArrayList<>();
        gaHM.put(sortedKeyStr,gaList);
        gaList.add(str);

       }else{
        
        gaHM.get(sortedKeyStr).add(str);
        
       }
      
      }
      return new ArrayList<>(gaHM.values());
        
    }
}
