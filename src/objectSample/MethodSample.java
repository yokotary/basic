package objectSample;

import javax.swing.*;

class MethodLib {
    /**
     *
     * @param x
     * @param y
     * @return x+y (int)
     */
    public static int plus(int x,int y) {
        return x+y;
    }

    public static int minus(int x, int y) {
        return x-y;
    }

    public static double ave(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        double ave = sum/ array.length;
        return ave;
    }
}

//staticはnewほにゃらら書かなくていい
class MethodSample {
    public static void main(String[] args) {
        int a = MethodLib.plus(10,5);
        int a2 = MethodLib.minus(10,6);
        double[] array = {2.2,5.5,3.3};
        System.out.println(a);
        System.out.println(a2);
        System.out.println(MethodLib.ave(array));
    }
}
