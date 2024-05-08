package tugas1;

/**
 * @Author Abhinaya
 */

public class Node {
    String nim, nama;
    Node next;

    Node(String nim, String nama, Node berikutnya) {
        this.nim = nim;
        this.nama = nama;
        next = berikutnya;
    }
}
