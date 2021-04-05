package intro;

//関係演算子
public class RelationalOperator {
    public static void main(String[] args) {
        int x = 10, y = 10, z = 20;
        System.out.println(x + " == " + y + ":" + (x == y)); //true
        System.out.println(x + " == " + z + ":" + (x == z)); //false
        System.out.println(x + " == " + y + ":" + (x != y)); //false
        System.out.println(x + " == " + z + ":" + (x != z)); //true
    }
}
