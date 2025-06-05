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
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}
public class BookJson {
    public static void main(String[] args) {

        //Book객체 -> Json 문자열
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

        String jsonBook = gson.toJson(book);
        System.out.println(jsonBook);
        System.out.println();
        //Json -> Map
        Map<String,String> bookMap = gson.fromJson(jsonBook, Map.class);
        System.out.println("Json -> Map");
        System.out.println(bookMap);
        //Map -> Pretty JSON
        System.out.println();
        String prettyJsonFromMap = gsonBuilder.toJson(bookMap);
        System.out.println("Map -> Pretty JSON");
        System.out.println(prettyJsonFromMap);
        System.out.println();

        //JSON -> Book 객체
        Book parsedBook = gson.fromJson(jsonBook, Book.class);
        System.out.println("JSON -> Book 객체");
        System.out.println(parsedBook);



    }
}
