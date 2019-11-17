package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Класс ObjectBox
 * @author Александр Коваленко
 */
public class ObjectBox<T>  {
    /**
     * Коллекция элементов
     */
    protected Collection<T> collection;

    public ObjectBox() {
        collection = new ArrayList<T>();
    }

    public  ObjectBox(Collection<T> values){
        collection = values;
    }

    public void addObject(T o){
        collection.add(o);
    }
    public void deleteObject (T o){
        collection.remove(o);
    }

    /**
     * метод dump, выводит элементы коллекции в строку
     */
    public void dump(){
        StringBuilder builder = new StringBuilder();
        Iterator<T> iter = collection.iterator();
        while (iter.hasNext()){
            builder.append(iter.next());
            if (iter.hasNext()){
                builder.append(", ");
            }
        }

        System.out.println(builder.toString());
    }


}
