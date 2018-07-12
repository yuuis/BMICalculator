package BmiCalclator;

class Calculator {
    double bmi;
    double justweight;

    double calculate(Human human) {
        bmi = human.getWeight() / Math.pow((human.getHeight() / 100), 2);
        return bmi;
    }
    double justweightCalclator(Human human) {
        justweight = Math.pow((human.getHeight() / 100), 2) * 22;
        return justweight;
    }
    String bmiAnalyzer(double bmi) {
        String analysis = "";
        if (bmi < 18.5){
            analysis = "痩せ気味";
        } else if (bmi <= 25) {
            analysis = "普通";
        } else if (bmi <= 30) {
            analysis = "少し太り気味";
        } else if (bmi <= 35) {
            analysis = "太り気味";
        } else if (bmi <= 40) {
            analysis = "かなり太り気味";
        } else if (bmi>40) {
            analysis = "危険";
        } else if (bmi<0) {
            analysis = "不明";
        }
        return analysis;
    }

}
