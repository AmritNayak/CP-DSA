package hrcautomation;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEST {
    public static void main(String[] args) {
        String regex = "\\d*\\smAh";
        String data = "1200 mAh";
        System.out.println(matchRegex(regex, data));
        System.out.println("12,999".replaceAll(",", ""));
//        File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//        FileUtils.copyFile(File,new File("image location.jpeg"));
    }

    static String matchRegex(String pattern, String data) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(data);
        return m.find() ? m.group(0) : "not found";
    }
}
