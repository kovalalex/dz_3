package task3;

/**
 * Класс для проверки
 *
 * @author Александр Коваленко
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("ObjectBox:");
        ObjectBox objectBox = new ObjectBox();
        objectBox.addObject("Привет!");
        objectBox.addObject( 3);
        objectBox.addObject( 6);
        objectBox.deleteObject(6);
        objectBox.dump();

        System.out.println("MathBox:");
        try {
            Number[] array = {3, 6, 9};
            MathBox mathBox = new MathBox(array);
            mathBox.addObject(19f);
            //mathBox.addObject("w"); //Некомпилирует!
            mathBox.dump();
            System.out.println(mathBox.summator());
            mathBox.splitter(3);
            mathBox.delete(3);
            mathBox.dump();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
