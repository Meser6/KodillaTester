package others;

public class User {
    String userName;
    int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public static void main(String[] args) {
        User[] user = new User[10];
        user[0] = new User("Kuba,", 25);
        user[1] = new User("Małgorzata", 18);
        user[2] = new User("Piotr", 24);
        user[3] = new User("Robert", 44);
        user[4] = new User("Beata", 41);
        user[5] = new User("Igor", 11);
        user[6] = new User("Ola", 38);
        user[7] = new User("Agata", 26);
        user[8] = new User("Irena", 71);
        user[9] = new User("Kamil", 29);
        int suma = 0;
        for (int i = 0; i < user.length; i++) {
            suma += user[i].age;
        }
        double average = (suma / user.length);
        System.out.println("average= " + average);

        for (int i = 0; i < user.length; i++) {
            if (user[i].age < average) {
                System.out.println(user[i].userName + " " + user[i].age);
            }
        }
    }
}
