package BmiCalclator;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataAccessor {
    double bmi;
    double height;
    double weight;

    public List<String[]> read() {
        List<String[]> data = new ArrayList<String[]>();
        try {
            File f = new File("./history.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;
            // 1行ずつCSVファイルを読み込む
            while ((line = br.readLine()) != null) {
                data.add(line.split(",", 0)); // 行をカンマ区切りで配列に変換
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return data;
    }

    public void wright(String height, String weight, double bmi) {
        Date date = new Date();
        try {
            FileWriter file = new FileWriter("./history.txt", true);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));

            pw.println(date);
            pw.println(height);
            pw.println(weight);
            pw.println(bmi);

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
