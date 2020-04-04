package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileUtil {

   static List<String> readFile(File file) throws IOException {
        BufferedReader bufferedReader = null;
        List<String> listOfLines = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line+'\n');
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return listOfLines;
    }

    private static List<String> sortListByAsc(List<String> list) {
        Collections.sort(list, new StringComparator());
        return list;
    }

   static void writeListInFIle(File file, List<String> list) throws IOException {
        sortListByAsc(list);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
        }
    }
}
