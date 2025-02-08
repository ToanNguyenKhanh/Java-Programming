public class MulTable {
    public static void main(String[] args) {
        int val;
        System.out.println("Multiplication Table");

        for (int i = 1; i < 10; i++) {
            System.out.printf("\t%d",i);
        }
        System.out.println("\n-------------------------------------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.print(i+"|"+"\t");
            for (int j = 1; j < 10; j++) {
                val = i * j;
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
