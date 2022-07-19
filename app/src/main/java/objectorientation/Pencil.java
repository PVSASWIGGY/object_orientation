package objectorientation;

abstract class Pencil {
    String color;
    int length;
    public void sharpen(){
        this.length--;
    }
}
