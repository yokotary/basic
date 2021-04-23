package objectSample.cloneSample;

import java.util.Arrays;

//クローンメソッドの実行
class Sample implements Cloneable{
    //フィールド
   private int num;//基本型
   private Node node;//参照型
    //コンストラクタ
    public Sample(int num, Node node) {
        this.num = num;
        this.node = new Node(node);//ポインタの参照を断ち切るため
//        try {
//            this.node = node.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }
    //セッター
    public void setNum(int num) {
        this.num = num;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "num=" + num +
                ", node=" + node +
                '}';
    }
    //ctrl o でクローンを生成
    @Override
    public Sample clone(){
        Sample clone = null;
        try {
            //オブジェクトクラスのクローンメソッドで複製する
            clone = (Sample) super.clone();
            //参照型のフィールドを個別に複製する
            clone.node = node.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();//例外時のトレース
        }
        return clone;
    }
}
