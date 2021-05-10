package ex.ex13;


import java.util.Comparator;
import java.util.List;

class Ex131 {
    public static void main(String[] args) {
        Branch branch = new Branch("札幌");
        System.out.println(branch.getName());
        List<Employee> employees = branch.getEmployees();
        for (Employee e:employees){
            System.out.println(e + " " + e.getAllSales() +
                    " " + e.getSum() +
                    " " + e.getAve());
        }
        //支店売り上げの合計を算出する
        int sum = 0;
        for (Employee e:employees) {
            sum += e.getSum();
        }
        System.out.println(branch.getName() + "支店の合計" + sum);

        //売上の上位3名の名前と売上総額を上位から表示する
        employees.sort(Comparator.comparing(Employee::getSum,Comparator.reverseOrder()));
        for (int i = 0; i < 3; i++) {
            System.out.println(employees.get(i).getName() + employees.get(i).getSum());
        }

    }
}
