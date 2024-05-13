package tugaspraktikum02;

/**
 * @Author Abhinaya
 */

public class SLLMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.tambahNode("Soal 1\t: Berapakah hasil 2 x 5?", "10");
        linkedList.tambahNode("Soal 2\t: Berapakah hasil 5 x 6?", "30");
        linkedList.tambahNode("Soal 3\t: Berapakah hasil 3 x 4?", "12");
        linkedList.mulaiGame();
    }
}
