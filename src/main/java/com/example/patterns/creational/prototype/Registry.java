package com.example.patterns.creational.prototype;

import com.example.patterns.model.Book;
import com.example.patterns.model.Item;
import com.example.patterns.model.Movie;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setPrice(25.65);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(256);
        book.setPrice(19.23);
        book.setTitle("Algos");
        items.put("Book", book);
    }

}
