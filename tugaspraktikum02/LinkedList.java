package tugaspraktikum02;

/**
 * @Author Abhinaya
 */

import java.util.Scanner;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void tambahNode(String soal, String kunciJawaban) {
        Node newNode = new Node(soal, kunciJawaban);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public boolean cekJawaban(String jawaban, String kunciJawaban) {
        return jawaban.equalsIgnoreCase(kunciJawaban);
    }

    public void mulaiGame() {
        Scanner sc = new Scanner(System.in);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.soal);
            System.out.print("Jawaban\t: ");
            String jawaban = sc.nextLine();
            if (cekJawaban(jawaban, temp.kunciJawaban)) {
                System.out.println("Jawaban Benar!");
                temp = temp.next;
            } else {
                System.out.println("Jawaban Salah! Silakan coba lagi.");
            }
        }
        System.out.println("\n==================================================================");
        System.out.println("== Selamat! Anda telah Memenangkan Quiz dan Mendapatkan Hadiah! ==");
        System.out.println("==================================================================");
    }
    
}
