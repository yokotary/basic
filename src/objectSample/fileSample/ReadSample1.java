package objectSample.fileSample;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


//テキストファイルの読み込みその１
class ReadSample1 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        //readAllLinesは一気に読み込む、その為ファイルサイズが大きいと失敗することもあるので注意
        //AutoCloseableなので読み込み失敗すると勝手に閉じる
        //文法的には簡単なので小さいファイルはこれで良い
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String line:lines) System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}