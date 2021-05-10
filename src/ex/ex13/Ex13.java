package ex.ex13;

class Ex13 {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"やまだ","男",35);
        //表示する
        System.out.println(employee);
        employee.setSales(1,150);
        employee.setSales(2,100);
        employee.setSales(3,100);
        employee.setSales(4,100);
        employee.setSales(5,100);
        employee.setSales(6,100);
        employee.setSales(7,100);
        employee.setSales(8,100);
        employee.setSales(9,100);
        employee.setSales(10,100);
        employee.setSales(11,100);
        employee.setSales(12,100);

        System.out.println(employee.getSales(2));
        System.out.println("合計" + employee.getSum());
        System.out.println("平均" + employee.getAve());
        System.out.println(employee.getAllSales());
    }
}
