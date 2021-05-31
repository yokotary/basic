package test;

class CloneTest {
    public static void main(String[] args) {
        //参照型はint[] array = {1,2,3}みたいなやつ、配列とかListとか
        //基本型のint(プリミティブ型)はint num = 1;だとnumの中に1が入ってる。後からnum = 2;とすると書き換わっちゃう
        System.out.println("基本型");
        int num = 1;
        System.out.println(num);
        num = 2;
        System.out.println(num);

        //int[] array = {1,2,3}は３個のint型、1と２と３を作りましたという意味
        System.out.println("参照型");
        int[] array = {1,2,3};
        // ↓ これだと謎の文字が表示される、メモリの住所とかだった気がする、先生に聞いた方がいいかも
        System.out.println(array);
        //　↓　arrayのi番目を表示
        //メモリの０番目は１、１番目は２、２番目は３出る
        for (int i = 0 ; i < 3 ; i++){
            //iが０から３未満(2)まで繰り返す
            System.out.println(array[i]);
        }

        //クローン作る
        System.out.println("コピー(clone)");
        int[] array2 = array.clone();
        //array2を表示
        System.out.println("array2を表示");
        for (int i = 0 ; i < 3 ; i++){
            //iが０から３未満(2)まで繰り返す
            System.out.println(array2[i]);
        }
        System.out.println("arrayを書き換えて表示する");

        //arrayを4,5,6にしてもarray2は1,2,3のまま
        array = new int[]{4,5,6};

        System.out.println("arrayを表示");
        for (int i = 0 ; i < 3 ; i++){
            //iが０から３未満(2)まで繰り返す
            System.out.println(array[i]);
        }
        System.out.println("array2を表示");
        for (int i = 0 ; i < 3 ; i++){
            //iが０から３未満(2)まで繰り返す
            System.out.println(array2[i]);
        }

    }
}
