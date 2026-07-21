package TakeUForward.ChooseFlask;

import java.util.*;

public class ChooseFlask1 {

    public static void main(String[] args) {

        int[] requirements = {4, 6, 6, 7};

        int flaskCount = 3;

        List<List<Integer>> markings = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(0, 5),
                Arrays.asList(0, 7),
                Arrays.asList(1, 6),
                Arrays.asList(1, 8),
                Arrays.asList(1, 9),
                Arrays.asList(2, 6),
                Arrays.asList(2, 5),
                Arrays.asList(2, 5)
        );

        int result = chooseFlask(requirements, flaskCount, markings);

        System.out.println("Chosen Flask = " + result);
    }

    private static int chooseFlask(int[] requirements, int flaskCount, List<List<Integer>> markings) {

        //Convert it into a map:
        Map<Integer,List<Integer>> flaskMap = new HashMap<>();

        for(List<Integer> list:markings) {
            flaskMap.computeIfAbsent(list.get(0),k-> new ArrayList<>()).add(list.get(1));
        }

        for(List<Integer> values:flaskMap.values()) {
            Collections.sort(values);
        }

        boolean valid = true;
        int minWaste=0;
        int flaskNo=-1;
        for(int i=0;i<flaskCount;i++) {
int waste =0;
            List<Integer> marks = flaskMap.get(i);

            for(int req:requirements) {

                int index = getValidMarking(marks, req);

                if(index==marks.size()) {
                    valid=false;
                    continue;
                }

                waste += marks.get(index)-req;
                if(valid && waste<minWaste) {
                    minWaste=waste;
                    flaskNo=i;
                }
            }
        }

        return flaskNo;
    }

    private static int getValidMarking(List<Integer> marks, int req) {

        int low=0;
        int high = marks.size()-1;

        while(low<high) {
            int mid = (low+high)/2;
            if(marks.get(mid)<req) {
                low = mid+1;
            }else {
                high =mid-1;
            }
        }

        return low;
    }


}
