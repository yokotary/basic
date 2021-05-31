package objectSample.streamSample.lambda;

import java.util.function.Supplier;

class SupplierSample {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/function/Supplier.html
        class Test{}
        Supplier<String> supplier1 = () -> "abc";
        Supplier<Test> supplier2 = () -> new Test();

        System.out.println(supplier1.get());//abc
        Test test = supplier2.get();//new Test() インスタンスを作成
    }
}
