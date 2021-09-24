public class operators {
    public static void main(String[] args) {
        int a = 60; // 0011 1100
        int b = 13; // 0000 1101

        // System.out.println("a+b = "+ (a+b));
        // System.out.println("a-b = "+ (a-b));
        // System.out.println("a*b = "+ (a*b));
        // System.out.println("a/b = "+ (a/b));
        // System.out.println("A%B = "+ (a%b));
        // System.out.println("a++ = "+ (a++));
        // System.out.println("++b = "+(++b));

        // System.out.println("a == b : " + (a==b));
        int c = 0;
        c = a&b ; // 12 = 0000 1100
        System.out.println("a&b : " + c);
        c = a | b; // 61 - 0011 1101
        System.out.println("a|b : "+c);

        c = a^b; // 49 (0011 0001)
        System.out.println("a ^b : "+c);

    }
}
