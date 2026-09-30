class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Contar la frecuencia de cada elemento
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. Crear los cubos (buckets) indexados por frecuencia
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        // 3. Recolectar los k elementos más frecuentes desde el final
        int[] res = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i >= 0; i--) {
            for (int num : freq[i]) {
                res[index++] = num;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}