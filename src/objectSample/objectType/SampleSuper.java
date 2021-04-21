package objectSample.objectType;

//継承元のスーパークラス
public class SampleSuper {
    //スーパークラスのフィールド
    protected String superFiled;
    //コンストラクタ
    public SampleSuper(String superFiled) {
        this.superFiled = superFiled;
    }
    //メソッド
    public String getSuperFiled() {
        return superFiled;
    }
}
