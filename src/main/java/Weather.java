import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Weather {
    public static String getWeather(String message, Model model) throws IOException {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+message+"&units=metric&appid=62fb6596a2c2c4459ba5cb916fe418c8");

        Scanner in = new Scanner((InputStream) url.getContent());

        String result = "";

        while(in.hasNext()){
            result += in.nextLine();
        }

        return result;

    }
}
