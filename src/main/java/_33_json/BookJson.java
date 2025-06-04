package _33_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class Book{
    private String ison;
    private String title;
    private String author;
    private String price;
    private String publisher;
}
public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String BookJson = null;

        Book book = new Book(
                "973-123124",
                "자바의 정석",
                "남궁성",
                "30000",
                "도우출판"
        );
        System.out.println(book);

        Map<String,String> book1 = gson.fromJson(BookJson, Map.class );

    }
}
