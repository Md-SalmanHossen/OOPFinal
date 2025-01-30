package FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

    public static void main(String[] args) {
        try{

            FileReader fReader = new FileReader("C:\\Users\\MSI\\Desktop\\File.txt");
            System.out.println("successful");

            BufferedReader bReader=new BufferedReader(fReader);
            String input= bReader.readLine();
            System.out.println(input);

            input= bReader.readLine();
            System.out.println(input);

            input= bReader.readLine();
            System.out.println(input);



        }catch(FileNotFoundException e){

            System.out.println("Exception");
            System.out.println(e.getMessage());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
