package com.assignment2.observer;

/**
 * Main class to demonstrate the Observer pattern in action.
 */
public class Main {
    public static void main(String[] args) {
        Blog techBlog = new Blog();

        Reader alice = new Reader("Alice");
        Reader bob = new Reader("Bob");

        // Register observers
        techBlog.registerObserver(alice);
        techBlog.registerObserver(bob);

        // Publish a new post
        techBlog.publishNewPost("Observer Pattern in Java");

        // Bob decides to unsubscribe
        techBlog.removeObserver(bob);

        // Another new post
        techBlog.publishNewPost("Mediator Pattern in Java");
    }
}
