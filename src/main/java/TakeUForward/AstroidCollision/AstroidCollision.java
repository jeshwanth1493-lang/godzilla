package TakeUForward.AstroidCollision;

import java.util.*;

public class AstroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {1, 2, 3};
        asteroidCollision(asteroids);
    }

    public static void asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty()
                    && stack.peek() > 0
                    && asteroid < 0) {

                if (stack.peek() < -asteroid) {
                    stack.pop(); // stack asteroid destroyed
                    continue;
                }

                if (stack.peek() == -asteroid) {
                    stack.pop(); // both destroyed
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

       System.out.println(stack);
    }


}
