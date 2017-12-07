import static javax.swing.UIManager.getInt;

public class ExceptionsLecture {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int x;
        try {
            x = numbers[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }

    }
}
