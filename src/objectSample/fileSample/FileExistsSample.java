package objectSample.fileSample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileExistsSample {
    public static void main(String[] args) {
        Path existsFile = Paths.get("src","objectSample","fileSample","base.txt");
        Path notExistsFile = Paths.get("src","objectSample","fileSample","copy.txt");
        //existsは存在するかどうか調べる、存在したらtrue
        // https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#exists(java.nio.file.Path,java.nio.file.LinkOption...)
        System.out.println(Files.exists(existsFile));
        System.out.println(Files.exists(notExistsFile));

        //notExistsは、存在しなかったらtrue
        System.out.println(Files.notExists(existsFile));
        System.out.println(Files.notExists(notExistsFile));
    }
}
