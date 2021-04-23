package objectSample.cloneSample;

class Node implements Cloneable{
    private String name;

    public Node(String name) {
        this.name = name;
    }
    //コンストラクタのオーバーロード
    //引数が異なる(()の中が異なる)同盟及び同じ戻り値のメソッドを多重定義できる
    public Node(Node node) {
        this.name = node.getName();
    }
    //ゲッター
    public String getName() {
        return name;
    }
    //セッター
    public void setName(String name) {
        this.name = name;
    }

    //基本型のクローンはpublicにしてクラスの名前にしてsuperの前に(Node)キャスト変換する
    @Override
    public Node clone() {
        Node clone = null;
        try {
            clone = (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
