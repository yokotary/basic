package objectSample.fileSample;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class CreateFileSample {
    public static void main(String[] args) {
        Path newFile = Paths.get("src","objectSample","fileSample","newDir","newFile.txt");
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#createFile(java.nio.file.Path,java.nio.file.attribute.FileAttribute...)

        try {
            Files.createFile(newFile);
        }  catch (UnsupportedOperationException e) {
            System.out.println("ディレクトリの作成時に原子的に設定できない属性が配列に含まれる");
        } catch (FileAlreadyExistsException e) {
            System.out.println("その名前のファイルがすでに存在するためにディレクトリを作成できなかった");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
