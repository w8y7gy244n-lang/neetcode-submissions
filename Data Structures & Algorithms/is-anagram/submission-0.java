//Un anagrama es una palabra que contiene exactamente las mismas letras pero en otro orden.
//Podemos hacer un bucle que cuente el length ya que tendria que ser el mismo para ser un anagrama
//Y tambien comparar los caracteres de ambas strings sean los mismos

class Solution {
    public boolean isAnagram(String s, String t) 
    {
        
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        String sortedStringS = new String(charArrayS);
        String sortedStringT = new String(charArrayT);

        if(sortedStringS.equals(sortedStringT))
        {
            return true;
        }
        else
        {
            return false;
        }



    }
}
