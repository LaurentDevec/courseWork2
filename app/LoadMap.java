package courseWork2.app;

import java.io.*;
import java.util.HashMap;

public class LoadMap {
    public static String loadMap(HashMap<String, Point> pointMap){

        InputStream resourceMap = Start.class.getResourceAsStream("/points.txt");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resourceMap))){
            String startKey = new String();
            String tempString;
            boolean firstFlag = true;
            int i = 1;
            while((tempString = reader.readLine()) != null){
                if(firstFlag){
                    startKey= tempString;
                    firstFlag = false;
                }
                Point point = new Point(reader.readLine(),reader.readLine(),reader.readLine(),reader.readLine(),reader.readLine());
                pointMap.put(tempString, point);

            }
            return startKey;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка");
            return null;
        } catch (IOException e) {
            System.out.println("Ошибка");
            return null;
        }

    }
}
