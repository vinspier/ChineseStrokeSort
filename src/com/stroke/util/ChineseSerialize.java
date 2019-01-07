package com.stroke.util;



import com.stroke.entity.Stroke;
import com.stroke.entity.StrokeMap;

import java.io.*;
/**
 * 序列化按一定规则排序的汉字 保存为文件格式
 * res文件夹中stroke.s是从ChinenseStroke.txt变更名称而来
 * */
public class ChineseSerialize {

    private StrokeMap strokeMap = new StrokeMap();
    final String fileInPath = "Chinese.txt";
    final String fileOutPath = "Stroke.s";

    public static void main(String[] args) throws IOException {
        ChineseSerialize cs = new ChineseSerialize();
        cs.readFile();
        cs.writerFile();
    }

    public void readFile() throws IOException{
        InputStreamReader inPutReader = new InputStreamReader(new FileInputStream(fileInPath),"GBK");
        BufferedReader br = new BufferedReader(inPutReader);
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] contents = line.split(",");
            Stroke stroke = new Stroke();
            stroke.setCode(Integer.valueOf(contents[0]));
            stroke.setName(contents[1]);
            stroke.setOrder(Integer.valueOf(contents[2]));
            strokeMap.put(stroke);
        }
        inPutReader.close();
        br.close();
    }

    public void writerFile() throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileOutPath));
        outputStream.writeObject(strokeMap);
        outputStream.close();
    }
}
