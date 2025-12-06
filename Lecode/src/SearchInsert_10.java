public class SearchInsert_10 {

  public int searchInsert(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= target) {
        return i;
      }
    }
    return nums.length;
  }

  public static void main(String[] args) {
    var solution = new SearchInsert_10();
    System.out.println(solution.searchInsert(new int[] {1,3,5,6}, 7));
  }
}