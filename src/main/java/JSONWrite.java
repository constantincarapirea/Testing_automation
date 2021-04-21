import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.LinkedHashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JSONWrite {
    public static void main(String[] args) {
        Map m = new LinkedHashMap();
        JSONObject obj = new JSONObject();
        m.put("author", "Robert Kiyosaki");
        m.put("name", "Cel mai bogat om din babilon");
        m.put("publicationDate", "1989");
        m.put("availability", "true");
        JSONArray list = new JSONArray();
        list.add("Robul");
        list.add("Elena");
        list.add("Stapanuk");
        m.put("characters", list);
        m.put("publisher", "Iasi");
        obj.put("book1", m);


        Map m1 = new LinkedHashMap();
        m1.put("author", "Kiyosaki");
        m1.put("name", "Cadranul Banilor");
        m1.put("publicationDate", "2001");
        m1.put("availability", "false");
        JSONArray list1 = new JSONArray();
        list1.add("Sotia");
        list1.add("Tinarul ambitios");
        list1.add("Marinn");
        m1.put("characters", list1);
        m1.put("publisher", "Bucuresti");
        obj.put("book2", m1);


        Map m2 = new LinkedHashMap();
        m2.put("author", "Kiyosaki");
        m2.put("name", "Viitorul");
        m2.put("publicationDate", "1995");
        m2.put("availability", "true");
        JSONArray list2 = new JSONArray();
        list2.add("Tata bogat");
        list2.add("Tata Sarac");
        list2.add("Tinarul");
        m2.put("characters", list2);
        m2.put("publisher", "Galati");
        obj.put("book3", m2);

        try (FileWriter file = new FileWriter("books.json")) {
            file.write(obj.toJSONString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }
}