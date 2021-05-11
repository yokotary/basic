package objectSample.enumSample;

class EnumSample {
    public static void viewColor(Color color) {
        switch (color) {
            case RED:
                System.out.println("赤");
                break;
            case BLUE:
                System.out.println("青");
                break;
            case YELLOW:
                System.out.println("黄");
                break;
        }
    }
    public static void main(String[] args) {
        //列挙型を表示してみる
        System.out.println(Color.RED);
        viewColor(Color.RED);
        System.out.println(Color.BLUE.getJpName());
        System.out.println(Student.MIDORIGUMI.getJpClass());
        System.out.println(Color.YELLOW.name());
        System.out.println(Color.BLUE.ordinal());

        System.out.println("///列挙型の取得///");
        Color color = Color.valueOf("YELLOW");
        System.out.println(color.getJpName());

        System.out.println("///一覧の取得///");
        Color[] colors = Color.values();
        for (Color c:colors) {
            System.out.println(c);
        }
    }
}
