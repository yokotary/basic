package objectSample.streamSample;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StreamSample7 {
    public static void main(String[] args) {
        //Listをフィールドに持つクラスがあるとする
        class Group {
            private List<Data> dataList = new ArrayList<>();

            public void add(Data data) {
                dataList.add(data);
            }

            public List<Data> getDataList() {
                return new ArrayList<>(dataList);
            }

            @Override
            public String toString() {
                return "Group{" +
                        "dataList=" + dataList +
                        '}';
            }
        }

        //３つのグループを作成
        Group groupA = new Group();
        Group groupB = new Group();
        Group groupC = new Group();

        //メンバーを追加
        groupA.add(new Data("1", "Bob"));
        groupA.add(new Data("4", "Susan"));
        groupA.add(new Data("7", "Paul"));

        groupB.add(new Data("2", "Tom"));
        groupB.add(new Data("5", "Mike"));
        groupB.add(new Data("8", "Nancy"));

        groupC.add(new Data("3", "John"));
        groupC.add(new Data("6", "Cathy"));
        groupC.add(new Data("9", "Emma"));

        //登録確認の表示
        System.out.println("groupA:" + groupA);
        System.out.println("groupB:" + groupB);
        System.out.println("groupC:" + groupC);

        //GroupのListを作成し追加
        List<Group> groupList = List.of(groupA, groupB, groupC);

        //併合する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function)
        List<Data> flatDataList = groupList.stream()
                .flatMap(g -> g.getDataList().stream())
                .collect(Collectors.toList());

        System.out.println("併合後");
        flatDataList.forEach(System.out::println);

        System.out.println("併合後(IDの昇順)");
        flatDataList.stream()
                .sorted(Comparator.comparing(Data::getId))
                .forEach(System.out::println);

    }
}