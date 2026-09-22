//En esta solucion lo que vamos a hacer es crear un HashMap para cada String. Convertir el string en un arreglo de Char y 
//recorrer el array de char. Al final comparar HashMap s con HashMap t con la ayuda de .equals(). Si son iguales
//devolver true y si son diferentes devolver false.

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        char[] chArrayS = s.toCharArray();
        char[] chArrayT = t.toCharArray();

        for(Character ch : chArrayS)
        {
            if(!sMap.containsKey(ch))
            {
                sMap.put(ch,1);
            }else
            {
                sMap.put(ch, sMap.get(ch)+1);
            }
        }

        for(Character ch : chArrayT)
        {
            if(!tMap.containsKey(ch))
            {
                tMap.put(ch,1);
            }else
            {
                tMap.put(ch, tMap.get(ch)+1);
            }
        }

       return sMap.equals(tMap);
    }
}
