package reviw;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        double sum = 0;
        for (Integer i:list) {
            sum += i;
        }

        double ave = sum/list.size();

        System.out.println(sum);
        System.out.println(ave);

        OptionalDouble optAve = list.stream()
                .mapToDouble(i -> (double) i)
                .average();
        optAve.ifPresent(System.out::println);
    }
}
