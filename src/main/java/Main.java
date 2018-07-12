package BmiCalculator;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("hoge", 15, 160.0, 50.0);
        human.sayProperty();
        human.sayBMI();
        View view = new BmiCalculator.View();
    }
}
