package ex.ex13;

import java.util.HashMap;
import java.util.Map;

class Branch1 {
    private String name;
    private Map<Integer,Employee> employeeMap = new HashMap<>();

    {
        employeeMap.put(1,new Employee(1,"やまだ","男",35));
        employeeMap.put(2,new Employee(2,"たけだ","女",22));
        employeeMap.put(3,new Employee(3,"はまだ","男",42));

        initSales(employeeMap.get(1),100);
        initSales(employeeMap.get(2),300);
        initSales(employeeMap.get(3),200);
    }

    public static void initSales(Employee employee,int value) {
        for (int i = 1; i < 13; i++) {
            employee.setSales(i,value);
        }
    }
//コンストラクタ
    public Branch1(String name) {
        this.name = name;
    }

    //ゲッター
    public String getName() {
        return name;
    }
//ポインターを連携させないようにnew宣言
    public Map<Integer, Employee> getEmployeeMap() {
        return new HashMap<Integer,Employee>(employeeMap);
    }
    public String searchEmployee(int no) {
        if (employeeMap.containsKey(no)){
            return employeeMap.get(no).toString();
        }else{
            return no+"の従業員はいません";
        }
    }
}
