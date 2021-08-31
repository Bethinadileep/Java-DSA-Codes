package Algorithms_String_Tries;

import java.util.HashMap;
import java.util.Map;

public class Trienode {
    private int numprefixes = 0;
    private boolean isEndOfWord = false;
    Map<Character, Trienode> children = new HashMap();


    boolean insert(String word,int index) {
        if(index == word.length()) {
            if(isEndOfWord)
                return false;
            else{
                numprefixes++;
                isEndOfWord = true;
                return true;
            }
        }
        if(children.get(word.charAt(index))== null) {
            children.put(word.charAt(index),new Trienode());
        }
        if(children.get(word.charAt(index)).insert(word,index+1)) {
            numprefixes++;
            return true;
        }
        return false;
    }

    boolean search(String word, int index) {
        if(index == word.length()) {
            return isEndOfWord;
        }
        if(children.get(word.charAt(index))== null) {
            return false;
        }
        return children.get(word.charAt(index)).search(word,index+1);
    }

    boolean delete(String word, int index) {
        if(word.length() == index) {
            if(isEndOfWord){
                numprefixes--;
                isEndOfWord = false;
                return true;
            }
            return false;
        }
        if(children.get(word.charAt(index))== null){
            return false;
        }
        if(children.get(word.charAt(index)).delete(word,index+1)) {
            numprefixes--;
            if(numprefixes==0){
                children.remove(word.charAt(index));
            }
            return true;
        }
        return false;
    }

    public static void main(String... args){
        Trienode obj = new Trienode();
        System.out.println(obj.insert("Dileep",0));
        System.out.println(obj.insert("Dethina",0));
        System.out.println(obj.insert("Dell",0));
        System.out.println(obj.search("Dell",0));
        System.out.println(obj.delete("Delll",0));
    }
}
