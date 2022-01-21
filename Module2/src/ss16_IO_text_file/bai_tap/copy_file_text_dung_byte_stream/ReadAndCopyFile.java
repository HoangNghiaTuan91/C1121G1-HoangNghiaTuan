package ss16_IO_text_file.bai_tap.copy_file_text_dung_byte_stream;

import java.io.*;
import java.util.Scanner;

public class ReadAndCopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input file path");
        String inputFilePath = scanner.nextLine();
        System.out.println("enter the output file path");
        String outputFilePath = scanner.nextLine();
        try {
            File file = new File(inputFilePath);
            InputStream inputStream = new FileInputStream(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            OutputStream outputStream = new FileOutputStream(outputFilePath);
            int sendingByte;
            int count = 0;
            while ((sendingByte = inputStream.read()) != -1) {
                outputStream.write(sendingByte);
                count++;
            }
            System.out.println("there are totally "+count+" characters that were copied to target file");
            inputStream.close();
            outputStream.close();
        } catch (Exception e){
            System.out.println("This file is not exist or duplicated");
        }
    }

}
