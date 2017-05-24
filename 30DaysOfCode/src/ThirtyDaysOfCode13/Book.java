package ThirtyDaysOfCode13; /**
 * Created by kiyomizumia on 2017/05/24.
 */
import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}