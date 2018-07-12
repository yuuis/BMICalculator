package BmiCalculator;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    double getHeight() {
        return height;
    }
    double getWeight() {
        return weight;
    }
    void sayProperty() {
        System.out.println(this.getName() + "の年齢は" + this.getAge() + "歳です。");
        System.out.println("体重は" + this.getWeight() + "、身長は" + this.getHeight() + "cmです。");
    }
    void sayBMI() {
        Calculator calculator = new Calculator();
        double bmi = calculator.calculate(this);
        System.out.println("BMIは、約" + Math.floor(bmi) + "で、" + calculator.bmiAnalyzer(bmi) + "です。");
        System.out.println("適正体重は、約" + Math.floor(calculator.justweightCalclator(this)) + "kgです。");
    }
}
