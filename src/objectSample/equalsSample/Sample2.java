package objectSample.equalsSample;

import java.util.Objects;

class Sample2 {
    private String name;
    private int age;

    public Sample2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
////サブクラスを同一としない場合
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample2 sample2 = (Sample2) o;
        return getAge() == sample2.getAge() && Objects.equals(getName(), sample2.getName());//ageがおなじ&&（かつ）nameが同じならtrue
    }
    //サブクラス含める場合と比較
    //   public boolean equals(Object o) {
    //        if (this == o) return true;//オブジェクトが同一である
    //        if (!(o instanceof Sample)) return false;//oがsampleと違えばfalse
    //        Sample sample = (Sample) o;//クラスが一致しているので型変換
    //        //型変換ののちObjectsクラスのequalsメソッドで比較する
    //        return Objects.equals(getKeyword(), sample.getKeyword());
    //    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
