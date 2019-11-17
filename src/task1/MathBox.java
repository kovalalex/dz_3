package task1;

import java.util.*;

/**
 * Класс MathBox
 * @author Александр Коваленко
 */
public class MathBox {

    private HashSet<Number> set = new HashSet<>();

    public MathBox(Number[] array) throws Exception {
        set.addAll(Arrays.asList(array));
       if (set.size()!=array.length ) throw new Exception("Массив параметр содержит значения-дубликаты!");
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "set=" + set +
                '}';
    }

    /**
     * Метод summator
     * @return double сумма всех number хранимых объектом
     */
    public double summator(){
        double summ = 0;
        for (Number x: set) {
            summ+=x.doubleValue();
        }
        return summ;
    }

    /**
     * Поочередное деление всех элементов на параметр-делитель
     * @param split int
     */
    public void splitter(int split){
        Iterator<Number> i = set.iterator();
        ArrayList<Number> list = new ArrayList<>();
        for (Number x: set)
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
        set.clear();
        set.addAll(list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return set.equals(mathBox.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set);
    }

    public void delete(Integer del){
        if (set.contains(del));
         set.remove(del);

    }
}
