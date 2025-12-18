package algorithms.TwoPointer.medium;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {

    int maxArea = 0;
    int start = 0;
    int end = height.length - 1;

    while (start < end) {
      int min = Math.min(height[start], height[end]);
      int area = min * (end - start);
      if (maxArea < area) {
        maxArea = area;
      }
      if (height[start] < height[end]) {
        start++;
      } else {
        end--;
      }
    }

    return maxArea;
  }

  static void main(String[] args) {
    var containerWithMostWater = new ContainerWithMostWater();
    System.out.println(containerWithMostWater.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
  }
}
