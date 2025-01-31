
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("C:\\Users\\MSI\\Desktop\\FileWrite.txt");
            BufferedWriter bw=new BufferedWriter(fw);

            bw.write("i am a full stack developer\n");

            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
