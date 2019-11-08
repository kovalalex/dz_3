package task3;
/**
 *
 * Класс для проверки
 * @author Александр Коваленко
 */
public class Main {
    public static void main(String[] args) {
        Number[] array ={3,6,9};
        ObjectBox objectBox = new ObjectBox(array);
        objectBox.addObject("Привет!");
        objectBox.deleteObject(6);
        System.out.println(objectBox.dump());

        MathBox mathBox = new MathBox(array);
       // mathBox.addObject("w"); //Некомпилирует!
        System.out.println(mathBox.dump());
        System.out.println(mathBox.summator());
        mathBox.splitter(3);
        mathBox.delete(3);
        System.out.println(mathBox.dump());

    }
}
