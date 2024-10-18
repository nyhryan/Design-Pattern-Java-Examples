package behavioral.obsever.observable;

import behavioral.obsever.observer.Observer;

import java.util.LinkedList;
import java.util.List;

// Youtube channel is being "observed" by the subscribers, therefore it is an Observable
// then notifies all the subscribers when a new video is uploaded
public record YoutubeChannel(String name) implements Observable {
    private final static List<Observer> subscribers = new LinkedList<>();

    public void uploadVideo() {
        notifyEveryone();
    }

    @Override
    public void add(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void remove(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyEveryone() {
        subscribers.forEach(Observer::update);
    }
}
