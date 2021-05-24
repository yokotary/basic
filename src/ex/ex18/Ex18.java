package ex.ex18;

import java.util.Calendar;

class Ex18 {

    public static void main(String[] args) {
        //実行時の日付/時刻情報を持つカレンダーインスタンス作成
        Calendar cal = Calendar.getInstance();
        //インタンスの持つ日付情報を24日に変更
        cal.set(Calendar.DATE, 24);

        //DAY_OF_WEEKでその日の曜日を返す
        int beforeBlank = cal.get(Calendar.DAY_OF_WEEK)-1;
        //DAY_OF_MONTHでその月が何日まであるか
        int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //ブランクと日数分ループを回す
        for(int i=0;i<beforeBlank+daysCount;i++) {
            String str="";//ブランクは空文字
            //最初のブランク分すぎたら日付
            if(i>=beforeBlank) {
                //カウンター変数iから求める実際の日付
                int date = i+1-beforeBlank;
                str=String.valueOf(date);
            }
            //４文字分のスペースを使って描画
            System.out.printf("%4s", str);
            //7個出力したら改行
            if((i+1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
