package behavioral.obsever_pattern.observer;

import behavioral.obsever_pattern.observable.YoutubeChannel;

// Subscriber "observes" the YoutubeChannel
public class Subscriber implements Observer {
    private final String name;
    private YoutubeChannel channel = null;

    public Subscriber(String name) {
        this.name = name;
    }

    public void subscribeToChannel(YoutubeChannel channel) {
        this.channel = channel;
        channel.add(this);
    }

    public void unsubscribeFromChannel() {
        channel.remove(this);
        this.channel = null;
    }

    @Override
    public void update() {
        System.out.printf("[Hey %s!] %s uploaded a new video!\n", name, channel.name());
    }
}
