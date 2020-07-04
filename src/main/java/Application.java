public class Application {

    //TODO Review kdrzazga - please create a class Person with these fields
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        checkAgeAndHeight();
    }

        //TODO Review kdrzazga - please create method checkAgeAndHeight with code below
    public void checkAgeAndHeight(){
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
