package objectSample.cloneSample;

class Sample2 implements Cloneable{
    //フィールド
    private int num;//基本型
    private Node node;//参照型

    public Sample2(int num, Node node) {
        this.num = num;
        this.node = node;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Sample2{" +
                "num=" + num +
                ", node=" + node +
                '}';
    }

    @Override
    public Sample2 clone() {
        Sample2 clone = null;
        try {
            clone = (Sample2) super.clone();
            //参照型をnewもしくはcloneしないとどうなるか
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
