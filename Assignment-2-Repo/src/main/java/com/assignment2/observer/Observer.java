package com.assignment2.observer;

/**
 * Observer interface that defines the 'update' method
 * to be called by the Subject when its state changes.
 */
public interface Observer {
    void update(String newPost);
}
