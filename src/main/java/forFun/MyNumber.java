package forFun;

public class MyNumber {
    int myNumber;

    public MyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public boolean isOdd() {
        if (this.myNumber % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven() {
        if (this.myNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double sqrt() {
        return (double) Math.sqrt(this.myNumber);
    }

    public double pow(int x) {
        return (long) Math.pow(this.myNumber, x);
    }

    public int add(int y) {
        return this.myNumber + y;
    }

    public int subtract(int z) {
        return this.myNumber - z;
    }
}
