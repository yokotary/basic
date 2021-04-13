package intro;

//whileサンプル２
public class While2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4};
        int i = 0;
        while (array[i]>=0) {
            System.out.println(array[i]);
            i++;
            if (i>= array.length) System.out.println("おわり");
            if (i>= array.length) break;//変数iが配列の大きさ超えたら終了
        }
    }
}
