import java.util.*;

public class Practise {

    public static void main(String[] args)  {

        String a = "SILENT";
        String b = "LISTWEN";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        boolean isAnagram =false;
        for(char c: a.toCharArray()) {

            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }

        System.out.println(map);

       for(char c: b.toCharArray()) {
           if(!map.containsKey(c)) {
               isAnagram =false;
               break;
           }
           else {
               map.put(c,map.get(c)-1);
           }
           if(map.get(c)==0) {
               map.remove(c);
           }
       }

       if(map.isEmpty()) {
           isAnagram = true;
       }

        System.out.println(isAnagram);
    }

    public void FirstRepeastAndNonRepeat() {
        String a ="JAVACONCEPTOTHEDAY";
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();

        for(char i:a.toCharArray()) {
            if(set.contains(i)) {
                result.add(i);
            }
            set.add(i);
        }

    }
}
