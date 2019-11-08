package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Класс MathBox
 * @author Александр Коваленко
 */
public class MathBox extends ObjectBox<Number>{

    public MathBox(Number[] array) {
        super(array);
    }

    /**
     * Метод сумматор
     * @return float сумма элементов list
     */
    public float summator(){
        float summ = 0;
        ArrayList<Number> list = super.getList();
        for (Number x: list) {
            summ+=x.longValue();
        }
        return summ;
    }

    /**
     * Метод выполняет поочередное деление всех хранящихся
     * в объекте элементов на делитель, являющийся аргументом метода
     * @param split int делитель
     */
    public void splitter(int split){
        ArrayList<Number> list = super.getList();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).floatValue()/split);
        }
        super.setList(list);
    }

    public void delete(Integer del){
        if (super.getList().contains(del.floatValue()));
        super.deleteObject(del.floatValue());

    }

    @Override
    public String toString() {
        return this.dump();
    }

}
