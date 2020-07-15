package forFun;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return this.length * this.width;
    }

    public int circuit() {
        return this.length * 2 + this.width * 2;
    }

    public int diagonal() {
        return (int) Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }

}
