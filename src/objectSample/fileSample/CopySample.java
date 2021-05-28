package objectSample.fileSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class CopySample {
    public static void main(String[] args) {
        Path base = Paths.get("src","objectSample","fileSample","base.txt");
        Path copy = Paths.get("src","objectSample","fileSample","copy.txt");

        //ファイルのコピー
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#copy(java.nio.file.Path,java.io.OutputStream)
        try {
            Files.copy(base,copy);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
