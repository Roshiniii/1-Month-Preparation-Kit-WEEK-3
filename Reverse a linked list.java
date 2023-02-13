    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if(llist == null) return llist;
    
    SinglyLinkedListNode prev = null;
    SinglyLinkedListNode curr = llist;
    
    while(curr != null){
        SinglyLinkedListNode next_node = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next_node;
    }
      return prev;
    }
