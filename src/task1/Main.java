package task1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Number[] array ={3,6,9};
        MathBox mathBox = new MathBox(array);
        mathBox.splitter(3);
        System.out.println(mathBox.toString());
        Integer x =new Integer(1);
        mathBox.delete(x);
        System.out.println(mathBox.toString());
    }
}
