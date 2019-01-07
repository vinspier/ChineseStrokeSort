package com.stroke.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ChineseStroke {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Chinese.txt"));
        PrintWriter out = new PrintWriter("Stroke.s");
        String oldLine = "999999";
        int stroke = 0;
        while (in.hasNextLine()) {
           /* String line = in.nextLine();
            if (line.compareTo(oldLine) < 0) {
                stroke++;
            }
            oldLine = line;
            out.println(line + "," + stroke);*/
            /********/
            String line = in.nextLine();
            String[] contents = line.split(",");
            String unicodeNo = contents[0];
            if (unicodeNo.compareTo(oldLine) < 0) {
                stroke++;
            }
            oldLine = unicodeNo;
            out.println(unicodeNo + "," + stroke);
            /********/
        }
        out.flush();
        out.close();
        in.close();
    }
}
