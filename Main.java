public class Main {
    public static void main(String[] args) {

        int intNum = 10;
        System.out.println("intNum = " + intNum);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int intNum2 = Integer.MAX_VALUE;
        System.out.println("intNum2 = " + intNum2);
        int intNum3 = Integer.MIN_VALUE;
        System.out.println("intNum3 = " + intNum3);
        long longNum = (long)Integer.MAX_VALUE + 1;
        System.out.println("longNum = " + longNum);

        float floatNum = 1.23f;
        double doubleNum = 1.23f;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);



        int 이진수 = 0b1100;
        System.out.println("이진수 = " + 이진수);
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        int numBase16 = 0xC;
        System.out.println("numBase16 = " + numBase16);

        System.out.println("0b" + Integer.toBinaryString(이진수));
        System.out.println("0" + Integer.toOctalString(numBase8));
        System.out.println("0x" + Integer.toHexString(numBase16));

        boolean 참 = true;
        System.out.println("참 = " + 참);
        boolean 거짓 = false;
        System.out.println("거짓 = " + 거짓);

        char 알파벳첫번째 = 'a';
        System.out.println("알파벳첫번째 = " + 알파벳첫번째);
        char 알파벳마지막 = 'z';
        System.out.println("알파벳마지막 = " + 알파벳마지막);
        System.out.println((int)알파벳첫번째);
        System.out.println((int)알파벳마지막);

        String 참1 = "참";
        System.out.println("참1 = " + 참1);
        String 거짓1 = "거짓";
        System.out.println("거짓1 = " + 거짓1);
        
        String 나 = "시우";
        System.out.println("나 = " + 나);
        String 생년 = "020809";
        System.out.println("생년 = " + 생년);

        String s1 = "Hi! Fuck!";
        System.out.println(s1.indexOf("!"));
        System.out.println(s1.indexOf("!", s1.indexOf("!") + 1));
        
        String s2 = s1.replace("Fuck!", 
                "love!");
        System.out.println("s2 = " + s2);

        System.out.println(s2.substring(0, 6));

        System.out.println(s1.toUpperCase());
        
        StringBuffer new1 = new StringBuffer();
        new1.append("abc");
        System.out.println("new1 = " + new1);
        new1.append("a1b1c1");
        System.out.println("new1 = " + new1);

        String a = "abc";
        String  b = "a1bb1c1";

        a += b;
        System.out.println(a);

        int[] 순서 = {1, 2, 3, 4, 5};
        System.out.println(순서[2]);
        System.out.println(순서[0]);
        System.out.println(순서[1]);
        System.out.println(순서[3]);
        System.out.println(순서[4]);










    }
    }