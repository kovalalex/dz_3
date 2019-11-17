package task1;

public class Main {

    public static void main(String[] args) {

            Number[] array ={3,6,9};
            try {
                MathBox mathBox = new MathBox(array);
                mathBox.splitter(3);
                System.out.println(mathBox.toString());
                Integer x = new Integer(1);
                mathBox.delete(x);
                System.out.println(mathBox.toString());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

    }
}
