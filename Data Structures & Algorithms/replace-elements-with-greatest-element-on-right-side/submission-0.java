class Solution {
    public int[] replaceElements(int[] arr) {
        int c = -1;
        int max = 0;
        for(int i = arr.length - 1; i >= 0 ; i--){
                max = Math.max(arr[i], c);
                arr[i] = c;
                c = max;
            }
            return arr;
        }
    }

