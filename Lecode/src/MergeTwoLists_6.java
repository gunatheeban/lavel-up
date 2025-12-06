import java.util.List;
import java.util.Stack;

public class MergeTwoLists_6 {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode finalResult = new ListNode(-1);
    ListNode result = finalResult;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        result.next = list1;
        list1 = list1.next;
      } else {
        result.next = list2;
        list2 = list2.next;
      }
      result = result.next;
    }

    if (list1 != null) result.next = list1;
    else result.next = list2;

    return finalResult.next;
  }

  public static void main(String[] args) {
    var solution = new MergeTwoLists_6();
    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

    ListNode listNode = solution.mergeTwoLists(l1, l2);
    while (listNode != null) {
      System.out.println(listNode.val);
      listNode = listNode.next;
    }
  }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}