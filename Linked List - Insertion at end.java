import java.util.Scanner;

class Main {

    private static class MyLinkedList {
        private class node {
            int value;
            node next;

            public node(int val) {
                this.value = val;
                this.next = null;
            }
        }
        node head;

        public MyLinkedList() {
            head = null; 
        }

        public void insertAtEnd(int val) {

            node newnode = new node(val);

            if (this.head == null) {
                this.head = newnode;
            }
            else {
                node current = this.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newnode;
            }
        }

        public void print() {
            node temp = this.head;
            while (temp != null) {
                System.out.printf("%d ", temp.value);
                temp = temp.next;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        list.print();
    }
}
