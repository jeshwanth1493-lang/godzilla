package TakeUForward;

public class GasStation {

    public static void main(String[] args) {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas,cost));
    }


    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas=0;
        int totalCost=0;
        // Calculate total gas and total cost
        for(int i=0;i<gas.length;i++) {
            totalGas+=gas[i];
            totalCost+=cost[i];
        }

        // If total gas is less than total cost, return -1
        if(totalGas<totalCost) {
            return -1;
        }

        int currentGas=0;int startIndex=0;

        // Iterate through the gas stations
        for(int i=0;i<gas.length;i++) {

            currentGas += gas[i]-cost[i];

            // If current gas is negative, reset start index and current gas
            if(currentGas<0) {
                startIndex=i+1;
                currentGas=0;
            }

        }
        // Return the starting index if a valid circuit exists
        return startIndex;

    }
}
