package ex02;

public class Sides {

    private int height;
    private int width;
    private int concat;

    public int getHeight(){
        return height;
    }

    public void setHeight( int height ) {
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth( int width ) {
        this.width = width;
    }

    public int getConcat(){
        return concat;
    }

    public void setConcat( int concat ) {
        this.concat = this.height * this.width;
    }
}
