# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 is None:
            return l2
        elif l2 is None:
            return l1
        elif l1.val < l2.val:
            l1.next = self.mergeTwoLists(l1.next, l2)
        else:
            l2.next = self.mergeTwoLists(l1, l2.next)
            return l2

    class Solution:
        def mergeTwoLists2(self, l1, l2):
            # maintain an unchanging reference to node ahead of the return node.
            prehead = ListNode(-1)

            prev = prehead
            while l1 and l2:
                if l1.val <= l2.val:
                    prev.next = l1
                    l1 = l1.next
                else:
                    prev.next = l2
                    l2 = l2.next
                prev = prev.next

            # exactly one of l1 and l2 can be non-null at this point, so connect
            # the non-null list to the end of the merged list.
            prev.next = l1 if l1 is not None else l2

            return prehead.next


prehead = ListNode(-3)
print(prehead.val)
prehead.next = 5
print(prehead.next)
