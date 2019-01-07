import com.stroke.entity.Stroke;

import java.lang.reflect.Method;

public class TestMethodInvoke {
    public static void main(String[] args) {
        Stroke stroke = new Stroke();
        stroke.setName("范小彪");
        stroke.setCode(457689);
        stroke.setOrder(123456);

        Class clazz = stroke.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getName());
            if(methods[i].getName().startsWith("get")){
                try {
                    Object invokeObj = methods[i].invoke(stroke);
                    System.out.println(invokeObj.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
