public class TicTacToeAplication {
    public static void main(String[] args) {
        // Choice dupa = new Choice();
        //  XOrO dupa3 = new XOrO();
        //  Graphics dupa2 = new Graphics();
        // dupa2.graphics();
        Game a = new Game();
        // for (int i = 0; i < a.g.length; i++) {
        //    System.out.println(a.y() + a.g[i]);
        // }
        // System.out.println("---------");
        a.add(0);
        System.out.println(a.y());
        a.add(6);
        System.out.println(a.y());
        a.add(1);
        System.out.println(a.y());
        a.add(7);
        System.out.println(a.y());
        a.areaFlash();
        for (int i = 0; i < a.g.length; i++) {
            System.out.println(a.g[i]);
        }

    }

}

