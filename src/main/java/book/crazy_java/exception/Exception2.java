package book.crazy_java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2 {
    public static void main(String[] args) throws Exception{
        try {
            FileInputStream fs = new FileInputStream("a.bin");
            fs.read();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException io) {
            io.printStackTrace();
        }



    }
}
