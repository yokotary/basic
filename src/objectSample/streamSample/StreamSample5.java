package objectSample.streamSample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.function.Function;

class StreamSample5 {
    public static void main(String[] args) {
        List<Data> dataList = List.of(
                new Data("1","taro"),
                new Data("2","hana"),
                new Data("3","itou")
        );
        Path csv = Paths.get("src","objectSample","streamSample","data2.csv");

        Function<Data,String> toCsv = data -> String.join(",", data.getId(), data.getName());

        try(BufferedWriter bw = Files.newBufferedWriter(csv,StandardOpenOption.CREATE)) {
            dataList.stream()
                    .map(toCsv)
                    .forEach(s -> {
                        try {
                            bw.write(s);
                            bw.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                            }
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
