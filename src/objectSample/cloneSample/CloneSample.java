package objectSample.cloneSample;

class CloneSample {
    public static void main(String[] args) {
        Node node = new Node("abc");

        //クローンメソッドを実装している場合
        Sample sample1 = new Sample(10,node);
        Sample sample2 = sample1.clone();

        sample1.setNum(20);
        sample1.setNode(new Node("xyz"));
        System.out.println(sample1);
        System.out.println(sample2);
        //クローンメソッドを正しく実装していない場合
        Sample2 sample21 = new Sample2(10,node);
        Sample2 sample22 = sample21.clone();

        node.setName("def");//内容の変更が影響する
        System.out.println(sample21);
        System.out.println(sample22);
    }
    }

