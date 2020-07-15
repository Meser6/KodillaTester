package forFun;

public class Human {
    String name;
    int age;
    int weight;
    double height;
    boolean isMale;

    public Human(String name, int age, int weight, double height, boolean isMale){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
    }
    public void isMale(boolean isMale){
        if (this.isMale == true) {
            System.out.println(" he is a man.");
        } else {
            System.out.println(" she is a women.");
        }
    }
}
