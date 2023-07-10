package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    @Test
    public void testAddNewMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("New film 1");
        String[] actual = manager.findAll();
        String[] expected = {"New film 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddZeroMovies() {
        MovieManager manager = new MovieManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestAddAllMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindLastMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesLessThatLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        String[] actual = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesMoreThatLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        String[] actual = manager.findLast();
        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        Assertions.assertArrayEquals(expected, actual);
    }
}