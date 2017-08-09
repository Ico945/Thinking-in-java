
class ListNode{
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class Solution {
    public static void main(String[] args) {
        ListNode[] x = {new ListNode(7), new ListNode(2), new ListNode(3)};
        ListNode[] y = {new ListNode(4), new ListNode(5), new ListNode(6)};
        x[0].next = x[1];
        x[1].next = x[2];
        x[2].next = null;
        y[0].next = y[1];
        y[1].next = y[2];
        y[2].next = null;
        for(ListNode j = new Solution().addTwoNumbers(x[0], y[0]);j!=null;j = j.next)
        {
            System.out.print(j.val);
        }

    }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode root = new ListNode(0); // 头结点
        ListNode r = root;
        root.next = l1;

        int carry = 0; // 初始进位
        int sum;
        while (p1 != null && p2 != null) {
            sum = p1.val + p2.val + carry;
            p1.val = sum % 10; // 本位的结果
            carry = sum / 10; // 本次进位

            r.next = p1;
            r = p1; // 指向最后一个相加的结点
            p1 = p1.next;
            p2 = p2.next;

        }

        if (p1 == null) {
            r.next = p2;
        } else {
            r.next = p1;
        }

        // 最后一次相加还有进位
        if (carry == 1) {
            // 开始时r.next是第一个要相加的结点
            while (r.next != null) {
                sum = r.next.val + carry;
                r.next.val = sum % 10;
                carry = sum / 10;
                r = r.next;
            }

            // 都加完了还有进位，就要创建一个新的结点
            if (carry == 1) {
                r.next = new ListNode(1);
            }
        }

        return root.next;
    }
}
