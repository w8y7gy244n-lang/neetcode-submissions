class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int frequency;

        HashMap <Integer, Integer> tkFHM = new HashMap<>();

        for(int n : nums){
            frequency = tkFHM.getOrDefault(n, 0) +1;
            tkFHM.put(n, frequency);
            
            }
            ArrayList<Map.Entry<Integer,Integer>> tkFAL = new ArrayList<>(tkFHM.entrySet());
            Collections.sort(tkFAL, (a, b) -> b.getValue() - a.getValue());

             int[] ans = new int[k];

            for(int i = 0; i < k ; i++){
                ans[i] = tkFAL.get(i).getKey();

            }
            return ans;
        }

    }
