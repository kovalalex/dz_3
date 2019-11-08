package task3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс ObjectBox
 * @author Александр Коваленко
 */
public class ObjectBox<T> {
    /**
     * Array list для хранения объектов
     */
    private ArrayList<T> list;

    public ObjectBox() {
        list = new ArrayList<T>();
    }
    public ObjectBox(T[] array) {
        list = new ArrayList<T>(Arrays.asList(array));
    }
    public void addObject(T o){
        list.add(o);
    }
    public void deleteObject (T o){
        list.remove(o);
    }

    /**
     * Метод сериализации list
     * @return String
     */
    public String dump(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i).toString());
           if (i < list.size()-1)
            builder.append("+");
        }
        return builder.toString();
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }
}
