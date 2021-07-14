package edu.cnm.deepdive;

public class TheArithmeticOperators {

  public static void main(String[] args) {

    int result = 3 - 2 + 2 * 2 + 3; //first the multiplication so result is 8.
    System.out.println("result = " + result);

    result = 4 / 2 + 1 - 4* 2 + 10;
    //2 + 1 - 8 + 10 = 5
    System.out.println("result = " + result);

    int a = 4;
    int b = 3 - 2 * --a;//unary operators before *, / and %. First decrement, then use.
    //b = 3 - 2 * 3
    //b = 3 - 6
    //b = -3
    System.out.println("a = " + a + " and b = " + b);

    a = 4;
    b = 3 - 2 * a--;//first use, then decrement.
    //b = 3 - 2 * 4 (now decrement so a becomes 3).
    //b = 3 - 8
    //b = -5 and a = 3
    System.out.println("a = " + a + " and b = " + b);

    long c = 2;
    long d = 4 + 3 * c++;
    //d = 4 + 3 * 2 (has been used, now increment c to 3).
    //d = 4 + 6
    //d = 10 and c = 3.
    System.out.println("c = " + c + " and d = " + d);

    result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
    // result = 10 - 3 * 3 - 4 / 4
    //result = 10 - 9 - 1
    //result = 0.
    System.out.println("result = " + result);

    int i = 10;
    int y = 3;
    int k = i % y;
    //10 divided by 3 equals 3, rest 1. So k = 1.
    System.out.println("k = " + k);
    int e = 10 % 2;
    // 10 divided by 2 = 5, rest is 0. So e = 0.
    System.out.println("e = " + e);

    int f = 12;
    int g = 5;
    int h = 2;
    int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
    //m = 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
    //m = 6 - 3 - 24 % 5 - 6
    //m = 6 - 3 - 4 - 6
    //m = -7
    System.out.println("m = " + m);
  }

}
