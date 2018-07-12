package BmiCalclator;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("太郎", 160.0, 50.0);
        human.sayProperty();
        human.sayBMI();
        View view = new View();
    }
}
