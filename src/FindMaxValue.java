public class FindMaxValue {
    public static <T extends Comparable<T>> T maxGeneric(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }


    public static void main(String[] args) {
        System.out.println("Find Maximum Value Problem Using Generics Method\n");
        System.out.println("The maximum value between the three integer values is : " + maxGeneric(5, 9, 7));
        System.out.println("The maximum value between the three integer values is : "+maxGeneric(3.5f, 5.56f, 1.87f));
        System.out.println("The maximum value between the three String values is : "+maxGeneric("Apple", "Peach", "Banana"));

    }
}
