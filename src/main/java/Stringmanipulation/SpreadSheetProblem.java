package Stringmanipulation;

import java.util.HashMap;
import java.util.Map;

public class SpreadSheetProblem {

    private static final Map<Integer,Character> map = new HashMap<>();

    static {
        for(int i=1;i<=26;i++) {
            map.put(i,(char) ('A' + i - 1));
        }
    }

    public static void main(String[] args) {
//        int target = 52;
//        String result ="";
//
//
//        while(target>0) {
//            //1234
//            int reminder = target%26;//4
//            if(reminder ==0) {
//                result = result+map.get(26);
//                target = (target / 26) - 1;
//            } else {
//                result = result+map.get(reminder);
//                target = target/26;
//            }
//        }
//
//        System.out.println(result);
//        String res = "";
//        //reverse
//        for(int i=result.length()-1;i>=0;i--) {
//            res = res + result.charAt(i);
//        }

        System.out.println(convert(52));
    }

    public static String convert(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int rem = num % 26;

            if (rem == 0) {
                sb.append(map.get(26));
                num = (num / 26) - 1;
            } else {
                sb.append(map.get(rem));
                num /= 26;
            }
        }

        return sb.reverse().toString();
    }
}
