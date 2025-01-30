
import java.io.BufferedReader;
import java.io.FileReader;

public class SerializationTest {
    public static void main(String[] args) {
        try {
            FileReader fReader=new FileReader("C:\\Users\\MSI\\Desktop\\SerializationTest.txt");
            BufferedReader bf=new BufferedReader(fReader);

            String input="";
            while((input =bf.readLine())!=null)
            {

                System.out.println(input);


                String [] arr =input.split("\\s+");
                int num1=Integer.parseInt(arr[0]);
                int num2=Integer.parseInt(arr[1]);

                int sum=num1+num2;
                System.out.println(sum);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
