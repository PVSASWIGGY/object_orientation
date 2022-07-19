package objectorientation;

public class Rectangle {
    private int length,width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public void incrementLength() {
        this.length++;
    }

    public int getWidth() {
        return width;
    }

    public void incrementWidth() {
        this.width++;
    }
}
