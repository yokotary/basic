package objectSample.objectType;

//Superクラス
class SuperClass {
    public void methodA() {
        System.out.println("A");
    }
}
//Subクラス
class SubClass extends SuperClass {
    public void methodB() {
        System.out.println("B");
    }
}
class ObjectType {
    public static void main(String[] args) {
        //スーパークラス型の変数にサブクラスは格納できる
        Object obj1 = Integer.valueOf(10);
        Object obj2 = Double.valueOf(10.0);
        Object obj3 = "abc";

        //インスタンスの振る舞いはデータ型で制約される
        SuperClass super1 = new SuperClass();
        super1.methodA();//A
        SubClass sub1 = new SubClass();
        sub1.methodA();//A
        sub1.methodB();//B

        SuperClass sub2 = new SubClass();
        //methodBは使用不可
        sub2.methodA();

        SubClass sub3 = (SubClass) sub2;
        sub3.methodA();//A
        sub3.methodB();//B　サブクラスにしたのでまた使えるように
    }
}
