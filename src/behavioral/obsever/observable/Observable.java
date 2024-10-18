package behavioral.obsever.observable;

import behavioral.obsever.observer.Observer;

// AKA Subject, Publisher, Event emitter
public interface Observable {
    void add(Observer o);
    void remove(Observer o);
    void notifyEveryone();
}
