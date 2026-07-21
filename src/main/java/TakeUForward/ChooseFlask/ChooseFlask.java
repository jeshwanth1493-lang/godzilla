package TakeUForward.ChooseFlask;

import java.util.*;

public class ChooseFlask {

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

        Map<Integer,List<Integer>> flaskMap = new HashMap<>();

        // Group markings by flask id
        for(List<Integer> mark : markings) {
            flaskMap.computeIfAbsent(mark.get(0),k-> new ArrayList<>() ).add(mark.get(1));
        }

        // Sort markings of every flask
        int i=0;
        while(i<flaskCount) {
            List<Integer> values = flaskMap.get(i);
            Collections.sort(values);
            i++;
        }
        long minWaste = Long.MAX_VALUE;
        int answer = -1;
        for(int flask=0;flask<flaskCount;flask++) {
            if (!flaskMap.containsKey(flask))
                continue;

            List<Integer> sizes = flaskMap.get(flask);

            long waste = 0;
            boolean valid = true;

            for(int req:requirements) {
                int idx = lowerBound(sizes, req);

                if (idx == sizes.size()) {
                    valid = false;
                    break;
                }

                waste += sizes.get(idx) - req;
            }
            if (valid) {
                if (waste < minWaste || (waste == minWaste && flask < answer)) {
                    minWaste = waste;
                    answer = flask;
                }
            }

        }

        return answer;

    }

    // Binary Search: First element >= target
    private static int lowerBound(List<Integer> list, int target) {

        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) < target)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}
