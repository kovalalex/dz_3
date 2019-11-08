package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Класс MathBox
 * @author Александр Коваленко
 */
public class MathBox {
    private ArrayList<Number> list;
    public MathBox(Number[] array) {
        list = new ArrayList<>(Arrays.asList(array));
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "list=" + list +
                '}';
    }

    /**
     * Метод summator
     * @return long сумма всех number хранимых объектом
     */
    public long summator(){
        long summ = 0;
        for (Number x: list) {
            summ+=x.longValue();
        }
        return summ;
    }

    /**
     * Поочередное деление всех элементов на параметр-делитель
     * @param split int
     */
    public void splitter(int split){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).intValue()/split);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(list, mathBox.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    public void delete(Integer del){
        if (list.contains(del));
         list.remove(del);

    }
}
