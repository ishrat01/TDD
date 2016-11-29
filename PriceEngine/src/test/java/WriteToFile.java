import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by TUSHAR on 29-11-2016.
 */
public class WriteToFile {


    public static void writeToFile(String inputData) throws IOException {


        File file = new File("input.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(inputData.getBytes());
//        fos.write("iPhone 8\n".getBytes());
//        fos.write("powerbank 9\n".getBytes());getBytes

    }
}
