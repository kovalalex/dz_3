package task2;

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
        objectBox.dump();
    }

}
