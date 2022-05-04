package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {


    public static List<String> getFizzs(){
        List <String > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("fizzbuzz"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();

            while(line != null){

                String result = line.split(" ")[2];
                if(result.equals("Fizz")){
                    String fizzNumber=line.substring(0,line.indexOf("=")-1);
                    list.add(fizzNumber);
                }


                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }

    public static List<String> getBuzzs(){
        List <String > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("fizzbuzz"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();

            while(line != null){

                String result = line.split(" ")[2];
                if(result.equals("Buzz")){
                    String buzzNumber=line.substring(0,line.indexOf("=")-1);
                    list.add(buzzNumber);
                }


                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }

    public static List<String> getFizzBuzzs(){
        List <String > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("fizzbuzz"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();

            while(line != null){

                String result = line.split(" ")[2];
                if(result.equals("FizzBuzz")){
                    String fizzBuzzNumber=line.substring(0,line.indexOf("=")-1);
                    list.add(fizzBuzzNumber);
                }


                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }

    public static List<String> getAllData(){
        List <String > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("fizzbuzz"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();

            while(line != null){

                list.add(line);


                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }

}
