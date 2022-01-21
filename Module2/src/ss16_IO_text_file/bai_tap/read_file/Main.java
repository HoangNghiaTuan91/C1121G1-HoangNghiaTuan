package ss16_IO_text_file.bai_tap.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
//        public static List<String> readLine (String pathFile){
//            List<String> listLine = new ArrayList<>();
//
//            try {
//                FileReader fileReader = new FileReader(pathFile);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//                String line = null;
//                while ((line = bufferedReader.readLine()) != null){
//                    listLine.add(line);
//                }
//                bufferedReader.close();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//          return listLine;
//            }
public static void main(String[] args) {
    BufferedReader br = null;
    try {
        String line;
        br = new BufferedReader(new FileReader("src/ss16_IO_text_file/bai_tap/read_file/country.csv"));

        while ((line = br.readLine()) != null) {
            printCountry(parseCsvLine(line));
        }

    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (br != null)
                br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country name=" + country.get(2));
    }
}


