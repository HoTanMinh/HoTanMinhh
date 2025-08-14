package Lec2_variable;
public class ex22 {
    public static void main(String[] args) {
        int x = 1;
        int z = x- x-- - x++ + --x - x + x-- + x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
    }
}
