package others;

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
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastMark() {
        int last = grades[grades.length - 1];
        return last;

    }

    public double average() {
        int suma = 0;
        for (int i = 0; i < grades.length; i++) {
            suma += grades[i];
        }
        double average = (suma / grades.length);
        System.out.println(average);
        return average;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(5);
        grades.lastMark();
        grades.average();
    }
}
