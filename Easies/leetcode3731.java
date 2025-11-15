// 3731. Find Missing Elements

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution{
    public List<Integer> findMissingElements(int[] nums) {

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        Set<Integer> presentElements = new HashSet<>(); 

        List<Integer> missingElements = new ArrayList<>();

        for (int num : nums) {
            minVal = Math.min(minVal, num); 


            maxVal = Math.max(maxVal, num); 


            presentElements.add(num); 
        }


        for (int i = minVal + 1; i < maxVal; i++) {

            if (!presentElements.contains(i)) {
                missingElements.add(i); 
            }
        }
        return missingElements;
    }
}
