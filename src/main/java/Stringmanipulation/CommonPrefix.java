package Stringmanipulation;

public class CommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"floewr","flow","flight"};
        System.out.println(commonPrefix(strs));

    }

    public static String commonPrefix(String[] strs) {

        if(strs == null || strs.length==0) {
            return "";
        }

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++) {

            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0){
                    return "";
                }
            }
        }
        return prefix;
    }
}
