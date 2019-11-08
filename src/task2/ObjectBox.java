package task2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс ObjectBox
 * @author Александр Коваленко
 */
public class ObjectBox  {
    private ArrayList list;

    public ObjectBox() {
        list = new ArrayList();
    }
    public ObjectBox(Object[] array) {
        list = new ArrayList(Arrays.asList(array));
    }
    public void addObject(Object o){
        list.add(o);
    }
    public void deleteObject (Object o){
        list.remove(o);
    }
    public void dump(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i).toString());
           if (i < list.size()-1)
            builder.append("+");
        }
        System.out.println(builder.toString());
    }
}
