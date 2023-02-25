public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 5, 5);
        MovableCircle c = new MovableCircle(100, 100, 2, 2, 10);

        System.out.println(c);
        
        for(int i = 0; i<5; i++) {
            c.moveDown();
            System.out.println(c);
        }
        for (int i = 0; i<5; i++){
            c.moveRight();
            System.out.println(c);
        }

        Movable[] m = new Movable[10];
        for(int i = 0; i<m.length; i++) {
            m[i] = new MovablePoint(i, i, 5, 10);
            System.out.println(m[i]);
        }
    }
}
