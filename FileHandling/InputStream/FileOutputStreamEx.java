
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {


            try {
            FileOutputStream fo=new FileOutputStream("C:\\Users\\MSI\\Desktop\\Output.txt");
            String data = "Hello, FileOutputStream!";
            System.out.println(data);

            fo.write(data.getBytes());
            System.out.println("data written successfully");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
