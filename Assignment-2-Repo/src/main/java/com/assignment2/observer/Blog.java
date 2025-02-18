package com.assignment2.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject (Blog) that maintains a list of observers.
 * Publishes new posts and notifies observers of updates.
 */
public class Blog implements Subject {
    
    private final List<Observer> observers;
    private String latestPost;

    public Blog() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestPost);
        }
    }

    /**
     * Publishes a new post and triggers observer notifications.
     *
     * @param post The content of the new post.
     */
    public void publishNewPost(String post) {
        this.latestPost = post;
        System.out.println("Blog: New post published -> " + post);
        notifyObservers();
    }

    /**
     * @return the latest post published on this blog.
     */
    public String getLatestPost() {
        return this.latestPost;
    }
}
