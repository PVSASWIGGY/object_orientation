package objectorientation;

public class Hair {
    private String style,color;
    public Hair(){
        this.style="regular";
        this.color="black";
    }
    public Hair(String style){
        this();
        this.style=style;
    }
    public Hair(String style,String color){
        this(style);
        this.color=color;
    }
}
