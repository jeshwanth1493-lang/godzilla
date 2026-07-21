package TakeUForward;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static  int maxArea(int[] height) {


        int left =0;
        int right = height.length-1;
        int water=0;

        while(left<right) {

            if(height[left]<=height[right]) {

                if((height[left]*(right-left))>water) {
                    water=height[left]*(right-left);
                }
                left++;
            }
            else {
                if((height[right]*(right-left))>water) {
                    water= height[right]*(right-left);
                }
                right--;
            }

        }

        return water;

        }

    public static  int maxArea1(int[] height) {


        int left =0;
        int right = height.length-1;
        int water=0;

        while(left<right) {

            water=Math.max(water,height[left]*(right-left));

            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }

        }

        return water;

    }
}
