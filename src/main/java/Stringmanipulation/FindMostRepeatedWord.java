package Stringmanipulation;

import java.io.*;
import java.util.*;

public class FindMostRepeatedWord {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("/Users/jeshwanthb.l/Desktop/Java/JavaProgrames/src/main/java/sample.txt"));
        HashMap<String,Integer> map = new HashMap<>();

        String line ;
        while(( line=br.readLine())!= null) {
            String[] words = line.split(" ");
            for(String word : words){

                if(map.containsKey(word)) {
                    map.put(word,map.get(word)+1);
                }
                else {
                    map.put(word,1);
                }
            }
        }
        br.close();
        System.out.println(map);
    }
}
