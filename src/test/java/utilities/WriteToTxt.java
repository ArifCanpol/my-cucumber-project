package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToTxt {


    public static void saveFizzBuzzResults(String result){
        try{

            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("fizzbuzz"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(result+"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
