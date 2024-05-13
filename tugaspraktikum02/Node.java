package tugaspraktikum02;

/**
 * @author Abhinaya
 */

public class Node {
    String soal;
    String kunciJawaban;
    Node next;

    public Node(String soal, String kunciJawaban) {
        this.soal = soal;
        this.kunciJawaban = kunciJawaban;
        this.next = null;
    }
}
