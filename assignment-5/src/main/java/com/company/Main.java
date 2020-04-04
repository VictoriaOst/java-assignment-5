package com.company;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileSourcePath = "sourseText.txt"; //path to txt file
        File file = new File(fileSourcePath);
        List<String> arrayList = null ;
        try {
            arrayList = FileUtil.readFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileUtil.writeListInFIle(new File("destinyFile.txt"),arrayList);
    }
}
