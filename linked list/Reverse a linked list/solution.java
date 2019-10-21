static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode present = head;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode prev = null;
        while(present != null) {
            next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
