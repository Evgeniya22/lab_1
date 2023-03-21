package lab10_2;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Scanner;

public class BookSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("laboratornie/lab10_2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "+jsonObject.keySet().iterator().next());
            System.out.println("Введите автора: ");
            String author = in.nextLine();
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray)
            {
                JSONObject book = (JSONObject) o;
                jsonArray.stream().filter(book1 -> book1 instanceof JSONObject)
                        .map(book1 -> (JSONObject) book)
                        .filter(book1 -> author.equals(book.get("author")))
                        .forEach(book1->{
                            System.out.println("\nТекущий элемент: book");
                            System.out.println("Название книги: " + book.get("title"));
                            System.out.println("Автор: " + book.get("author"));
                            System.out.println("Год издания: " + book.get("year"));
                        });
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
