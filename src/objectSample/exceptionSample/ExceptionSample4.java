package objectSample.exceptionSample;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//ファイルの読み書き
class ExceptionSample4 {
    public static void main(String[] args) {
        //ファイルの読み込みの準備
        Path in = Paths.get("src","objectSample","exceptionSample","src.txt");
        Path out = Paths.get("src","objectSample","exceptionSample","dist.txt");

        try (BufferedReader br = Files.newBufferedReader(in);
             BufferedWriter bw = Files.newBufferedWriter(out)) {

            String line = br.readLine();//1行読み取り
            while (line != null) {//ファイルが終わるまで
                System.out.println(line);//画面に表示
                bw.write(line);//ファイルにlineを書き込み
                bw.newLine();//改行を書き込み
                line = br.readLine();//次の行を読む
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
