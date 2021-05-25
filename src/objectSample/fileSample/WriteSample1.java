package objectSample.fileSample;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//テキストファイルの書き込みその１
class WriteSample1 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.addAll(Arrays.asList(
                "相澤凜,女,1996-08-22",
                "伊藤樹,男,2002-02-07",
                "上野詩,女,1984-04-15",
                "遠藤蓮,男,1974-11-27",
                "太田紬,女,1968-01-23"
        ));

        Path path = Paths.get("src","objectSample","fileSample","output1.csv");

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#write(java.nio.file.Path,java.lang.Iterable,java.nio.charset.Charset,java.nio.file.OpenOption...)

        //StandardOpenOption.CREATEで新規作成
        try {
            Files.write(path,data, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}