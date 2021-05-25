package objectSample.fileSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//テキストファイルの読み込みその２
class ReadSample2 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        //BufferedReaderは大きいファイルを読み込むときにも使う、少しずつ読み込む
        //newBufferedReaderでBufferedReaderを作る
        try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);) {
            //.readLineで一行読み込んでStringで返す
            String line = br.readLine();
            //.readLineで読み込んだ一行がnullでなければ～
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}