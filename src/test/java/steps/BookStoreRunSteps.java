package steps;

import dtos.Book;
import dtos.BookStore;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookStoreRunSteps {

    private BookStore store;
    private List<Book> foundBooks;

    @Before
    public void setUp() {
        store = new BookStore();
        foundBooks = new ArrayList<>();
    }

    @Given("^I have the following books in the store by map$")
    public void haveBooksInTheStoreByMap(DataTable table) {

        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            store.addBook(new Book(columns.get("title"), columns.get("author")));
        }
    }
}
