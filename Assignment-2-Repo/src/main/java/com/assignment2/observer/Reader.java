package com.assignment2.observer;

/**
 * Concrete Observer (Reader) that updates its state
 * when notified by the Subject (Blog).
 */
public class Reader implements Observer {

    private final String readerName;
    private String lastReceivedPost;

    public Reader(String readerName) {
        this.readerName = readerName;
    }

    /**
     * Called by the Subject (Blog) when there's a new post.
     *
     * @param newPost The content of the new post.
     */
    @Override
    public void update(String newPost) {
        this.lastReceivedPost = newPost;
        System.out.println(readerName + " is reading the new post: " + newPost);
    }

    /**
     * @return The last post received by this Reader.
     */
    public String getLastReceivedPost() {
        return lastReceivedPost;
    }
}
