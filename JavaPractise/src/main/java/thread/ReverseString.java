package thread;

public class ReverseString {

    public void reverseString(String str) {
        char[] strArray = str.toCharArray();

        for(int i= strArray.length-1;i>=0;i--){
            System.out.print(strArray[i]);
        }
    }
}
