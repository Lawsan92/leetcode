class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // <- sort the array, this reduces algo's time complexity from O(n^3) -> O(n^2)
        List<List<Integer>> triplets = new ArrayList<>(); // <- final return List
        Set<List<Integer>> tripletsSet = new HashSet<>(); // <- temp SetList to filter duplicates
        int i = 0;
        while (i < nums.length - 2) { // <- bounds check, ptr i should never pass ptr j or ptr k
            int j = i + 1; 
            int k = nums.length - 1; 
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) { // <- sum check at 0
                    List <Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    triplet.sort(null); // <- sort list to trigger Set filter
                    tripletsSet.add(triplet); // <- Set, default membership check
                    j ++;
                    k --;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                } 
            }
            i++;
        }
        for (List<Integer> t: tripletsSet) {
            triplets.add(t);
        }
     return triplets;   
    }
}

/*

- the return set can't contain duplicate triplets => a duplicate means that two sets share the same elements
order doesn't matter
- no repeating  characters => the same character at th same index, you can have an identical character from 
a different index
- the sum of three integers must equal 0

DATA STRUCTURE: Set<List<Integer>>
ALGORITHM: O(n^2), nested loops
FLAGS:
- bounds: i + 2 != array's length
- sum: num[i] + num[j] + num[k] == 0
- key: List<Integers> NOT FOUND in SET<List<Integers>>

 */