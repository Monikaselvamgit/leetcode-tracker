// Last updated: 7/9/2026, 9:43:52 AM
import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.getDayOfYear();
    }
}