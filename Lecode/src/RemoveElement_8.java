import java.util.Arrays;

public class RemoveElement_8 {

  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) return 0;

    int pointer = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[pointer] = nums[i];
        pointer++;
      }
    }
    return pointer;
  }


  public static void main(String[] args) {
    var solution = new RemoveElement_8();
    int[] ints = {3,2,2,3};
    System.out.println(solution.removeElement(ints, 3));
    System.out.println(Arrays.toString(ints));
  }
}