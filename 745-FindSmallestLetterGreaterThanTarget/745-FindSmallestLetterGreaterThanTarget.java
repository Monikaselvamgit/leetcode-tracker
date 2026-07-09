// Last updated: 7/9/2026, 9:44:01 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If left goes past the end, wrap around to the first element
        return letters[left % letters.length];
    }
}
