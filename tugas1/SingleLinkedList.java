package tugas1;

/**
 * @Author Abhinaya
 */

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi linked list\t:");
            while (tmp != null) {
                System.out.print("| NIM : " + tmp.nim +" "+ "Nama : " + tmp.nama + " |");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(String nim, String nama) {
        Node ndInput = new Node(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(String nim, String nama) {
        Node ndInput = new Node(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, String nim, String nama) {
        Node ndInput = new Node(nim, nama, null);
        Node temp = head;
        do {
            if (temp.nim.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, String nim, String nama) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            Node ndInput = new Node(nim, nama, null);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Indeks salah");
                    return;
                }
            }
            ndInput.next = temp.next;
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
}
