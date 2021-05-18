package objectSample.stringSample;

class StringSample2 {
    //テスト
    public static void main(String[] args) {
        //indexOfで検索
        String name = "山田佐藤太郎花子";
        String key = "花";

        if (name.indexOf(key) >= 0){
            System.out.println(name + "のなかに" + key + "は" + (name.indexOf(key)) + "番目");
        }else {
            System.out.println("なし");
        }
    }
}
