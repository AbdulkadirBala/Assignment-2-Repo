package com.assignment2.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Blog (Subject) and Reader (Observer) implementation.
 */
public class BlogTest {

    private Blog blog;
    private Reader alice;
    private Reader bob;

    @BeforeEach
    void setUp() {
        blog = new Blog();
        alice = new Reader("Alice");
        bob = new Reader("Bob");
    }

    @Test
    void testRegisterAndNotify() {
        // Register observers
        blog.registerObserver(alice);
        blog.registerObserver(bob);

        // Publish a new post
        String postContent = "Observer Pattern in Java";
        blog.publishNewPost(postContent);

        // Both observers should have received the update
        assertEquals(postContent, alice.getLastReceivedPost());
        assertEquals(postContent, bob.getLastReceivedPost());
    }

    @Test
    void testRemoveObserver() {
        // Register observers
        blog.registerObserver(alice);
        blog.registerObserver(bob);

        // Publish the first post
        String firstPost = "First Post";
        blog.publishNewPost(firstPost);

        assertEquals(firstPost, alice.getLastReceivedPost());
        assertEquals(firstPost, bob.getLastReceivedPost());

        // Remove Bob as an observer
        blog.removeObserver(bob);

        // Publish another post
        String secondPost = "Second Post";
        blog.publishNewPost(secondPost);

        // Alice (still subscribed) should see the new post
        assertEquals(secondPost, alice.getLastReceivedPost());

        // Bob (unsubscribed) should still have the old post
        assertEquals(firstPost, bob.getLastReceivedPost());
    }
}


