package tugas1;

/**
 * @Author Abhinaya
 */

public class SLLMain {
    
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        System.out.println("=====================================");
        System.out.println("===         Data Mahasiswa        ===");
        System.out.println("=====================================\n");

        singLL.addFirst("20001", "Abhinaya");
        singLL.print();
        singLL.addLast("20002", "Bagas");
        singLL.print();
        singLL.addLast("20003", "Cahya");
        singLL.print();
        singLL.addLast("20004", "Dhika");
        singLL.print();
        singLL.addLast("20005", "Eka");
        singLL.print();

        System.out.println("\n=====================================");
    }
}
