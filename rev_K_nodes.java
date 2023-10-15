class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        Stack<ListNode> stack = new Stack<>();

        ListNode temp = head;
        ListNode ans = new ListNode(-1);
        ListNode l = ans;

        int p =0;

        while(temp!= null)
        {
            while(p!=k && temp!=null)
            {
                stack.add(temp);
                temp = temp.next;
                p++;

            }
            if(stack.size()==k)
            {
                while(!stack.isEmpty())
                {
                ans.next = stack.pop();
                ans = ans.next;
                }
            }
            else
            {
                Stack<ListNode> s = new Stack<>();
                while(!stack.isEmpty())
                {
                    s.push(stack.pop());
                    
                }
                while(!s.isEmpty())
                {
                    ans.next =  s.pop();
                    ans = ans.next;
                }
            }

            p=0;

        }
        ans.next = null;
        return l.next;



        
    }
}
