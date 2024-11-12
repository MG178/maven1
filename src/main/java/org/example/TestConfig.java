package game;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.Objects;
import java.util.Properties;

public class TestConfig {
    public static void main(String[] args) throws IOException {
        File file =
        Properties appProps = new Properties();
        String appConfigPath = "src\\main\\java\\game\\questions.properties";
        Object o = new JSONParser().parse(new FileReader(file));
        JSONObject j = (JSONObject) o;
        var question = j.get("question");
        var answer1 = j.get("answer1");
        var answer2 = j.get("answer2");
        var answer3 = j.get("answer3");
        var answer4 = j.get("answer4");

        System.out.println(question);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);




//        appProps.load(new FileInputStream(appConfigPath));
//        System.out.println(appProps.getProperty("question1"));
//        System.out.println(appProps.getProperty("answer1"));
//        System.out.println(appProps.getProperty("answer2"));
//        System.out.println(appProps.getProperty("answer3"));
//        System.out.println(appProps.getProperty("answer4"));
    }
}
