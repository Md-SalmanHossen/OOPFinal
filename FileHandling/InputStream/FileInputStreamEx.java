
import java.io.FileInputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fi=new FileInputStream("C:\\Users\\MSI\\Desktop\\Output.txt");
            System.out.println("available: "+fi.available());
            System.out.println((char)fi.read());
            System.out.println((char)fi.read());
            System.out.println((char)fi.read());
            System.out.println("available: "+fi.available());

            int ch;
            while ((ch = fi.read()) != -1) {  // Corrected loop
                System.out.print((char) ch);
            }
            System.out.println("avaible: "+fi.available());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
