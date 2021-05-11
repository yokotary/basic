package objectSample.enumSample;

//enumサンプル
public enum Color {
    RED("あか"),BLUE("あお"),YELLOW("きいろ");

    //フィールド
    private String jpName;
    //コンストラクタ
    Color(String jpName) {
        this.jpName = jpName;
    }
    //getter
    public String getJpName() {
        return jpName;
    }
}
