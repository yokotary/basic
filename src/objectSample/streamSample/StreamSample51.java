package objectSample.streamSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

class StreamSample51 {
    public static void main(String[] args) {
        List<Data> dataList = List.of(
                new Data("1","Tom"),
                new Data("2","Bob"),
                new Data("3","jack")
        );

        Path csv = Paths.get("src","objectSample","streamSample","data3.csv");

        //Function<Data,String> toCsv = d -> String.join(",",d.getId(),d.getName());

        //小規模ファイル向け
        try {
            List<String> lines = dataList.stream()
                    .map(data -> String.join(",", data.getId(), data.getName()))
                    .collect(Collectors.toList());
            Files.write(csv,lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}