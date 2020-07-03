public class Application {

    //TODO Review kdrzazga - please create a class Person with these fields
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application user1 = new Application("Adam", 40.5, 178);

        //TODO Review kdrzazga - please create method checkAgeAndHeight with code below
        if (user1.name != null) {
            if (user1.age > 30 && user1.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
