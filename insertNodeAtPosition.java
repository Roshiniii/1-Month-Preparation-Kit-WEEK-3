    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {

    SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
    
    if(position == 0){
        new_node.next = llist;
        llist = new_node;
        return llist;
    } 
    
    SinglyLinkedListNode p = llist;
    for(int i=1;i<position;i++){
        p=p.next;
    }
    new_node.next = p.next;
    p.next = new_node;
    return llist;

    }
