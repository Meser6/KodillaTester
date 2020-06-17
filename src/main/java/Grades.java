public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size]= value;
        this.size++;
    }

    public static void main(String[] args) {
        Grades grades = new Grades ();
        grades.add(2);
        grades.add(5);
    }

}
