package objectSample.exceptionSample.original;

import java.util.Scanner;

class ErrorCheckSample {
    public static Data createData(String name,Gender gender,int age) throws CreateDataException {
        boolean nameError = false,ageError = false;

        //名前のチェック
        if (name != null) {
            if(name.isEmpty() || name.length() > 10) nameError = true;
        } else {
            nameError = true;
        }

        //年齢のチェック
        if(age < 0 || age > 120) ageError = true;

        //例外のスロー
        if (nameError || ageError) {
            throw new CreateDataException(nameError, ageError);//ここでthrowを出す
        }
        //例外でなければDateインスタンスを返す
        return new Data(name,gender,age);
    }

    public static void main(String[] args) {
        //外部からフィールドの値を入力されたイメージで処理をする

        boolean hasError = false;//入力にエラーがあればtrue
        Data data = null;//Dataインスタンスの保存用

        //入力処理
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("名前を入力してください（１～１０文字）");
            String name = sc.nextLine();
            System.out.println("性別を数字で入力してください（1:男性 1以外:女性)");
            int genderNo = sc.nextInt();
            Gender gender = genderNo == 1 ? Gender.MEN:Gender.WOMEN;
            System.out.println("年齢を入力してください（0 ~ 120）");
            int age = sc.nextInt();

            //検証して問題なければインスタンス作成
            try {
                data = createData(name,gender,age);
                hasError = false;
            } catch (CreateDataException e) {//作成時例外があればここでthrowsをキャッチする
                if (e.isNameError()) System.out.println("名前の文字数が不正です");
                if (e.isAgeError()) System.out.println("年齢の値が不正です");
                System.out.println("再入力してください");
                hasError = true;
            }

        } while (hasError);

        System.out.println("データが作成されました");
        System.out.println(data);

    }
}
