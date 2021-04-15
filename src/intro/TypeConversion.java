package intro;

//データ変換
public class TypeConversion {
    public static void main(String[] args) {
        String date = "12345";
        //文字列→整数
        Integer num = Integer.valueOf(date);
        Integer num2 = Integer.parseInt("12345");
        Integer num4 = Integer.valueOf("10101",2);
        //文字列→少数
        Double dnum = Double.valueOf("12.34");
        Double dnum2 = Double.parseDouble("12.34");
        //整数→文字列
        Integer num3 = 12345;
        String strNum3 = num3.toString();
        //少数→文字列
        Double dnum3 = 12.34;
        String strdnum3 = dnum3.toString();

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num4);
        System.out.println(dnum);
        System.out.println(dnum2);
        System.out.println(strNum3);
        System.out.println(strdnum3);
    }
}
