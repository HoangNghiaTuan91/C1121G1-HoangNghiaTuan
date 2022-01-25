package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.utils;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Product> readFromFile(String filePath) {
        List<Product> productList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
//                if(file.length() > 0) {
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    productList = (List<Product>) objectInputStream.readObject();
                    System.out.println("read completed");
//                }
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(objectInputStream!=null){
                        fileInputStream.close();
                        objectInputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return productList;
    }

    public static void writeToFile(String filePath, List<Product> productList) {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            if (file.exists()) {
                fileOutputStream = new FileOutputStream(file);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(productList);

                System.out.println("write completed");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectOutputStream != null) {
                    fileOutputStream.close();
                    objectOutputStream.close();
                }
            }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
