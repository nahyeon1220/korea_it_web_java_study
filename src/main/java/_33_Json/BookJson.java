package _33_Json;

//Book 객체 → JSON 문자열:
//{"isbn":"978-1234567890","title":"자바의 정석","author":"남궁성","price":"38000","publisher":"도우출판"}
//
//JSON → Map:
//{isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판}
//
//Map → Pretty JSON:
//{
//  "isbn": "978-1234567890",
//  "title": "자바의 정석",
//  "author": "남궁성",
//  "price": "38000",
//  "publisher": "도우출판"
//}
//
//JSON → Book 객체:
//Book(isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판)

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
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Book book = new Book("978-1234567890",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판");

        System.out.println(book);

        //Book 객체 -> Json
        String jsonBook = gson.toJson(book);
        System.out.println(jsonBook);

        //Json -> Map
        Map<String, String> map1 = gson.fromJson(jsonBook, Map.class);
        System.out.println(map1);

        //Map -> Json
        String prettyJsonFromMap = gsonBuilder.toJson(book);
        System.out.println("Map → Pretty JSON");
        System.out.println(prettyJsonFromMap);

        //Json -> Book 객체
        Book book1 = gson.fromJson(jsonBook, Book.class);
        System.out.println(book1);




    }
}
