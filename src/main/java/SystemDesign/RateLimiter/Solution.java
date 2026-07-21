package SystemDesign.RateLimiter;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static class TokenBucket {

        private final int capacity;
        private final int refillRate; // tokens per second

        private double tokens;
        private long lastRefillTime;

        TokenBucket(int capacity, int refillRate) {
            this.capacity = capacity;
            this.refillRate = refillRate;
            this.tokens = capacity;
            this.lastRefillTime = System.currentTimeMillis();
        }

        synchronized boolean allowRequest() {
            refill();

            if (tokens >= 1) {
                tokens--;
                return true;
            }

            return false;
        }

        private void refill() {
            long currentTime = System.currentTimeMillis();

            double elapsedSeconds =
                    (currentTime - lastRefillTime) / 1000.0;

            double newTokens = elapsedSeconds * refillRate;

            if (newTokens > 0) {
                tokens = Math.min(capacity, tokens + newTokens);
                lastRefillTime = currentTime;
            }
        }
    }

    static class RateLimiter {

        private final Map<String, TokenBucket> buckets = new HashMap<>();

        boolean isAllowed(String clientId) {
            TokenBucket bucket = buckets.computeIfAbsent(
                    clientId,
                    k -> new TokenBucket(10, 5)
            );

            return bucket.allowRequest();
        }
    }

    public static void main(String[] args) throws Exception {

        RateLimiter limiter = new RateLimiter();

        String client = "clientA";

        for (int i = 1; i <= 20; i++) {

            if (limiter.isAllowed(client)) {
                System.out.println("Request " + i + " -> Allowed");
            } else {
                System.out.println("Request " + i + " -> Rejected (429 Too Many Requests)");
            }

            Thread.sleep(100);
        }
    }

}
