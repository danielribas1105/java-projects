public class CompararTipos {
    public static void main(String[] args) {

        byte y1 = 1;
        short h1 = 25;
        int i1 = 1;
        int i2 = 2;
        long l1 = 1597L;
        long l2 = 8599L;
        float f1 = 1.5f;
        float f2 = 2.6f;
        double d1 = 5.2;
        char c1 = 'M';
        char c2 = 'F';

        String s1 = "daniel";
        String s2 = "daniel";

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("i1 == i2 -> " + (i1 == i2));
        System.out.println("i1 != i2 -> " + (i1 != i2));
        System.out.println("i1 >= i2 -> " + (i1 >= i2));
        System.out.println("i1 <= i2 -> " + (i1 <= i2));

        System.out.println("f1 == f2 -> " + (f1 == f2));
        System.out.println("f1 != f2 -> " + (f1 != f2));
        System.out.println("f1 >= f2 -> " + (f1 >= f2));
        System.out.println("f1 <= f2 -> " + (f1 <= f2));

        System.out.println("c1 == c2 -> " + (c1 <= c2));
        System.out.println("c1 != c2 -> " + (c1 != c2));
        System.out.println("c1 >= c2 -> " + (c1 >= c2));
        System.out.println("c1 <= c2 -> " + (c1 <= c2));

        System.out.println("s1 == s2 -> " + (s1 == s2));
        //System.out.println("s1 >= s2 -> " + (s1 >= s2));

    }
}
