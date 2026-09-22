//En esta solucion lo que vamos a hacer es crear un HashMap para cada String. Convertir el string en un arreglo de Char y 
//recorrer el array de char. Al final comparar HashMap s con HashMap t con la ayuda de .equals(). Si son iguales
//devolver true y si son diferentes devolver false.

class Solution
{
    public boolean isAnagram(String s, String t) 
    {

        if(s.length() != t.length())   //Si el length de los strings es diferente entonces no son anagramas.
        {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0) +1); 
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),0) +1);
        }
        return sMap.equals(tMap);
    }
} 
