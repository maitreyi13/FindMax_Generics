public class FindMaxValue {
    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3){
        Integer max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static Float maxOfFloat( Float a1, Float a2, Float a3) {
        Float max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    public static String maxOfString(String s1, String s2, String s3) {
        String max = s1;
        if (s2.compareTo(max) > 0)
            max = s2;
        if (s3.compareTo(max) > 0)
            max = s3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Find Maximum Value Problem Using Generics \n");
        System.out.println("The maximum value between the three integer values is : " + maxOfInteger(5, 9, 7));
        System.out.println("The maximum value between the three integer values is : "+maxOfFloat(3.5f, 5.56f, 1.87f));
        System.out.println("The maximum value between the three String values is : "+maxOfString("Apple", "Peach", "Banana"));

    }
}
