package no_garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class NoGarbage {
    public static void main(String[] args){
    String filename = "/Users/quocdetran/Documents/HUST/2022-2 semester/OOP/OOP_Lab/OtherProjects/src/garbage_collector/myfile.exe"; // test.exe is the name or path to an executable file
    byte [] inputBytes = { 0 };
    long startTime,endTime;
    try {
        inputBytes = Files.readAllBytes(Paths.get(filename));
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    startTime = System.currentTimeMillis();	
    StringBuilder outputString = new StringBuilder();
    for(byte b : inputBytes) {
        outputString.append((char)b);
    }
    endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);
}
}
