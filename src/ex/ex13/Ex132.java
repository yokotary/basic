package ex.ex13;

class Ex132 {
    public static void main(String[] args) {
        Branch1 branch1 = new Branch1("札幌");

        //検索の実行
        System.out.println(branch1.searchEmployee(1));
        System.out.println(branch1.searchEmployee(4));
    }
}
