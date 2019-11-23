package babol;

public class BabolMain {
    public static void main(String[] args) {
        int[] t = TableUtilities.createAndFillTable(10,5,20);
        BubbleSort bs = new BubbleSort();
        System.out.println("tablica przed sortowaniem");
        TableUtilities.print(t);
        bs.sort(t);
        System.out.println("tablica po sorotwaniu");
        TableUtilities.print(t);
    }
}
