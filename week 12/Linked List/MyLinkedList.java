class MyLinkedList {

    private Node head;

    public void addNode(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = n;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.name);
            currentNode = currentNode.next;
        }
    }

    public void insertBefore(int index, Node n) {
        if (index <= 0 || head == null) {
            n.next = head;
            head = n;
        }

        Node current = head;
        int count = 0;
        while (current.next != null && count < index - 1) {
            current = current.next;
            count++;
        }

        n.next = current.next;
        current.next = n;
    }

    public int indexOf(String str) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.name.equals(str)) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public void removeNodeAt(int index) {
        if (head != null || index >= 0) {
            if (index == 0) {
                head = head.next;
            }

            Node current = head;
            int count = 0;

            while (current.next != null && count < index - 1) {
                current = current.next;
                count++;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }

}
