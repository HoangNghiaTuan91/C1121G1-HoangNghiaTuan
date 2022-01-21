package ss16_IO_text_file.bai_tap.copy_file_su_dung_characterstream;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input file path");
        String inputFilePath = scanner.nextLine();
        System.out.println("enter the output file path");
        String outputFilePath = scanner.nextLine();
        copyFile(inputFilePath, outputFilePath);
    }

    public static void copyFile(String inputFilePath, String outputFilePath) {
        try {
            File file = new File(inputFilePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(outputFilePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            FileReader fileReader = new FileReader(file);

            int count = 0;
            int sendingByte;
            while ((sendingByte = fileReader.read()) != -1) {
                count++;
                bufferedWriter.write(sendingByte);
            }
            System.out.println("there are totally "+count+" characters that were copied to target file");
            bufferedWriter.close();
            fileReader.close();

        } catch (Exception e) {
            System.out.println("This file is not exist or duplicated");
        }
    }
}
