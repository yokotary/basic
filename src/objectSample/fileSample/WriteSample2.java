package objectSample.fileSample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WriteSample2 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.addAll(Arrays.asList(
                "相澤凜,女,1996-08-22",
                "伊藤樹,男,2002-02-07",
                "上野詩,女,1984-04-15",
                "遠藤蓮,男,1974-11-27",
                "太田紬,女,1968-01-23"
        ));

        Path path = Paths.get("src", "objectSample", "fileSample", "output2.csv");

        //StandardOpenOption.APPENDで追記
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            for (String line:data) {
                //書く
                bw.write(line);
                //改行（２行目の頭に行く）
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}