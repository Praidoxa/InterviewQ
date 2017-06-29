package WordInWord;

import java.util.*;
public class StringsMaps {

    public static void main(String[] args) {
        System.out.println(isWordOfWordLetters("la","la"));
    }

    private static boolean isWordOfWordLetters(String word1, String word2){

        Map<Character,Integer> mapWord1=getMapCharacters(word1);
        Map<Character,Integer> mapWord2=getMapCharacters(word2);
        for(Map.Entry<Character,Integer> entry : mapWord1.entrySet()){
            Integer occur = mapWord2.get(entry.getKey());
            if(occur==null || entry.getValue() <= occur)
                return false;

        }
        return true;
    }

    private static Map<Character,Integer> getMapCharacters(String word) {
        Map<Character,Integer> res = new HashMap<>();
        for(int i=0, n = word.length(); i< n; i++){
            char c =word.charAt(i);
            Integer value = res.get(c);
            if(value!=null){
                value+=1;
                res.put(c,value);
            }else {
                res.put(c,1);
            }

        }
        return res;
    }
}
