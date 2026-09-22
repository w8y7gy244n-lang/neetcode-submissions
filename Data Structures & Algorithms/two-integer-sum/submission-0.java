//Recorrer el array empezando de 0 y sumarlo al siguiente, si es igual a target terminar
//si no es igual seguir en el array.
//Tambien puede ser restarlo al target y cuando sea igual a 0 salir del bucle


class Solution {
    public int[] twoSum(int[] nums, int target) {

int i;
int j;
        for(i=0 ; i<=nums.length ; i++){

            for(j=i+1 ; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] { i, j };

                }

            }

        }

return new int[0];
        
    }
}
