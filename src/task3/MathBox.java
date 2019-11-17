package task3;

import java.util.*;

/**
 * Класс MathBox
 * @author Александр Коваленко
 */
public class MathBox extends ObjectBox<Number>{

    public MathBox(Number[] array) throws Exception {

        super(new HashSet<Number>());
        collection.addAll(Arrays.asList(array));
        if (collection.size() != array.length) throw new Exception("Массив параметр содержит значения-дубликаты!");
    }

    /**
     * Метод summator
     * @return double сумма всех number хранимых объектом
     */
    public double summator(){
        double summ = 0;
        for (Number x: collection) {
            summ+=x.doubleValue();
        }
        return summ;
    }

    /**
     * Метод выполняет поочередное деление всех хранящихся
     * в объекте элементов на делитель, являющийся аргументом метода
     * @param split int делитель
     */
    /**
     * Поочередное деление всех элементов на параметр-делитель
     * @param split int
     */
    public void splitter(int split){
        Iterator<Number> i = collection.iterator();
        ArrayList<Number> list = new ArrayList<>();
        for (Number x: collection)
        {
            if (x instanceof Integer)
                list.add(x.intValue()/split);
            else if (x instanceof Long)
                list.add(x.longValue());
            else if (x instanceof Float)
                list.add(x.floatValue()/split);
            else if (x instanceof Byte)
                list.add(x.byteValue()/split);
            else
                list.add(x.doubleValue()/split);
        }
        collection.clear();
        collection.addAll(list);
    }

    public void delete(Integer del){
        if (collection.contains(del));
        collection.remove(del);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return collection.equals(mathBox.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }
}
