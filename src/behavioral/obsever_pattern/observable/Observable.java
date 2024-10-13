package behavioral.obsever_pattern.observable;

import behavioral.obsever_pattern.observer.Observer;

// AKA Subject, Publisher, Event emitter
public interface Observable {
    void add(Observer o);
    void remove(Observer o);
    void notifyEveryone();
}
