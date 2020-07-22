package new_version;

public enum Side {

    O,
    X,
    NONE;

    @Override
    public String toString() {
        if (this.equals(Side.NONE)){
            return " ";
        } else {
            return this.name(); //TODO
        }
    }
}
