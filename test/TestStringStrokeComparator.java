
import com.stroke.comparator.StringStrokeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStringStrokeComparator {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();

        name.add("王姑娘");
        name.add("王疆");
        name.add("王宝强");
        name.add("王宝强一");
        name.add("王一宝强");

        /** 使用 */
        Collections.sort(name, new StringStrokeComparator());
        for (String string : name) {
            System.out.println(string);
        }
    }
}
