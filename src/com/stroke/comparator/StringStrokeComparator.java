package com.stroke.comparator;

import com.stroke.util.MapperFactory;
/**
* 自定义比较器 局限于字符串的比较
 * 以汉字的Unicode为key 查找并比较对应的排列序号orderNo
* */
import java.util.Comparator;

public class StringStrokeComparator implements Comparator<String> {

    private MapperFactory factory = MapperFactory.newInstance();

    @Override
    public int compare(String s1, String s2) {
        if (s1 == null || s2 == null)
            return 0;
        int point1 = 0;
        int point2 = 0;
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            point1 = s1.codePointAt(i);
            point2 = s2.codePointAt(i);
            /**************自定义 姓氏排序 单姓 排在 复姓前 开始*********************/
            if(i == 1){
                if(s1.length() == 2 || s2.length() == 2) {
                    if (s1.length() == 2 && s2.length() == 2)
                        return factory.stroke(point1) - factory.stroke(point2);
                    else
                        return s1.length() - s2.length();
                }
            }
            /**************自定义 姓氏排序 单姓 排在 复姓前 结束*********************/
            if (point1 != point2)
                return factory.stroke(point1) - factory.stroke(point2);
        }
        return s1.length() - s2.length();
    }

}
