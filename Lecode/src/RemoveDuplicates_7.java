import java.util.Arrays;

public class RemoveDuplicates_7 {

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int pointer = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) { // when new unique element found
        nums[pointer] = nums[i];
        pointer++;
      }
    }
    return pointer;
  }


  public static void main(String[] args) {
    var solution = new RemoveDuplicates_7();
    int[] ints = {1,2};
    System.out.println(solution.removeDuplicates(ints));
    System.out.println(Arrays.toString(ints));
  }
}