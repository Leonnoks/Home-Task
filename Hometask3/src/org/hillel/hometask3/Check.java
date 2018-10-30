package org.hillel.hometask3;


public class Check {
    public static int isEvenNum (int number, int x) {
        return number & x;

    }
    public static void isEvenNum2 (int a) {
        int result = 32 & 1;
        System.out.println(result);

    }
    public static void main(String[] args) {

        System.out.println(isEvenNum(15, 1));
        Check.isEvenNum2 (0);
        Check. log_or(31);
        Check. log_xor(35);
        System.out.println(log_not(7));
        System.out.println(sweep_right(14,2));
        System.out.println(sweep_left(12,1));
    }
    public static void log_or (int d) {
        int result = 22 | 13; /*10110
                               +01101
                                11111*/
        System.out.println(result);
    }
    public static void log_xor (int r) {
        int result = 45 ^ 14; /*101101
                              - 001110
                                100011 */
        System.out.println(result);
    }
    public static int log_not (int z) {
        return ~z; /* 0111
                     1000*/
    }
    public static int sweep_left (int number, int y){
        return number >> y;    /* 1100 >> 110 */
    }
    public static int sweep_right (int number, int h) {

        return number << h; /*1110 << 111000*/
    }

    }



