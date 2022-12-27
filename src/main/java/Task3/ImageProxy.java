package Task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class ImageProxy implements MyImage {
    @Getter
    private RealImage image;
    private final String fileName;


    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null)
            image = new RealImage(fileName);
        image.display();
    }
}
