package new_version;

public class Bartd {


    private final static int SIZEX = 3;
    private final static int SIZEY = 3;
    private Side[][] board = new Side[SIZEX][SIZEY];

    public void put(int X, int Y) {

    }

    public void draw() {
        for (int x = 0; x < SIZEX; x++) {
            System.out.println("\n-----|-----|-----");
            for (int y = 0; y < SIZEY; y++) {
                if (this.board[x][y] != null) {
                    System.out.print(this.board[x][y]);
                    System.out.print("|");
                }
            }
        }
    }
}
