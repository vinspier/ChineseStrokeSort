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
            if(methods[i].getName().startsWith("get")){
                try {
                    Object invokeObj = methods[i].invoke(stroke);
                    if(methods[i].getName().equals("getName")) {
                        System.out.println("回调指定属性方法" + methods[i].getName());
                        System.out.println("返回指定属性" + invokeObj.toString());
                    }else{
                        System.out.println(methods[i].getName());
                        System.out.println(invokeObj.toString());
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
