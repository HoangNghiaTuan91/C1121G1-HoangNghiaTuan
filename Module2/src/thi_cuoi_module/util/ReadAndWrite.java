package thi_cuoi_module.util;



import thi_cuoi_module.model.BenhAn;
import thi_cuoi_module.model.BenhAnBenhNhanThuong;
import thi_cuoi_module.model.BenhAnBenhNhanVip;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWrite {
    public static <E> void writeListToCSVFile(List<E> list, String filePath, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E element : list) {
                if (element instanceof BenhAnBenhNhanThuong) {
                    bufferedWriter.write(((BenhAnBenhNhanThuong) element).thongTinBenhNhanThuong());
                    bufferedWriter.newLine();
                } else if (element instanceof BenhAnBenhNhanVip) {
                    bufferedWriter.write(((BenhAnBenhNhanVip) element).thongTinBenhNhanVip());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<BenhAn> readBenhNhanFromCSVFile(String filePath) {
        List<BenhAn> benhNhanList = new LinkedList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                if (array.length == 8) {
                    BenhAnBenhNhanThuong benhNhanThuong = new BenhAnBenhNhanThuong(Integer.parseInt(array[0]), array[1], array[2],array[3], array[4], array[5],array[6], Double.parseDouble(array[7]));
                   benhNhanList.add(benhNhanThuong);
                } else {
                    BenhAnBenhNhanVip benhNhanVip = new BenhAnBenhNhanVip(Integer.parseInt(array[0]), array[1], array[2],array[3], array[4], array[5], array[6], array[7],array[8]);
                    benhNhanList.add(benhNhanVip);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return benhNhanList;
    }
}
