public class Main {
    public static void main(String[] args) {


        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number = 5;
        int min = 5;
        int max = 5;

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < number && i > closestSmaller) {
                closestSmaller = i;
            }
            if (i > number && i < closestLarger) {
                closestLarger = i;
            }
        }
        System.out.print("Dizi: {");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println("Girilen Sayı : "+number);
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+closestLarger);

    }

}

