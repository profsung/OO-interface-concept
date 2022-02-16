package instance_vs_static;

public class Box {
    private int width;
    private int height;
    private static String COLOR = "Brown";

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public static String getColor() {
        return COLOR;
    }
}
