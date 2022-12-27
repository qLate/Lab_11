import Task3.ImageProxy;
import Task3.MyImage;

public class Main {
    public static void main(String[] args) {
        MyImage image = new ImageProxy("test_10mb.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}