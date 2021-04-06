package ex;

public class Ex2 {
    public static void main(String[] args) {
        double height = 171;
        double weight = 55.0;
        double mh = height/100;
        double bmi = weight / (mh*mh);
        double appropriateWeight = (mh*mh)*22;

        //判定基準
      if (bmi >= 40) {
          System.out.println("あなたは肥満(4度)です");
      } else if (bmi >= 35) {
          System.out.println("あなたは肥満(3度)です");
      } else if (bmi >= 30) {
          System.out.println("あなたは肥満(2度)です");
      } else if (bmi >= 25) {
          System.out.println("あなたは肥満(1度)です");
      } else if (bmi >= 18.5) {
          System.out.println("あなたは普通体重です");
      } else {
          System.out.println("あなたは低体重(痩せ型)です");
      }

        System.out.println(String.format("身長 %.1fcm",height));
        System.out.println("体重 " + weight + "キロ");
        System.out.println(String.format("BMI %.2f",bmi));
        System.out.println(String.format("適正体重 %.2fkg",appropriateWeight));
    }
}
