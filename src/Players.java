/**
 * Created by Yevgeniy on 7/27/2016.
 */
import java.io.*;
public class Players {
    int number;

     int guess() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return this.number= Integer.parseInt(reader.readLine());
    }
}
