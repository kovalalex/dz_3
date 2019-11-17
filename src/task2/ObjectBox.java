package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Класс ObjectBox
 * @author Александр Коваленко
 */
public class ObjectBox  {
    /**
     * Коллекция элементов
     */
    protected Collection<Object> collection;

    public ObjectBox() {
        collection = new ArrayList<Object>();
    }
    public ObjectBox(Object[] array) {
        collection = new ArrayList<Object>();
        collection.addAll(Arrays.asList(array));
    }
    public  ObjectBox(Collection<Object> values){
        collection = values;
    }

    public void addObject(Object o){
        collection.add(o);
    }
    public void deleteObject (Object o){
        collection.remove(o);
    }

    /**
     * метод dump, выводит элементы коллекции в строку
     */
    public void dump(){
        StringBuilder builder = new StringBuilder();
        Iterator<Object> iter = collection.iterator();
        while (iter.hasNext()){
            builder.append(iter.next());
            if (iter.hasNext()){
                builder.append(", ");
            }
        }

        System.out.println(builder.toString());
    }


}
