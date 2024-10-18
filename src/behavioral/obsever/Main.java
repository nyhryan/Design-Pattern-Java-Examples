package behavioral.obsever;

import behavioral.obsever.observable.YoutubeChannel;
import behavioral.obsever.observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("Super Coding");
        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");
        Subscriber s3 = new Subscriber("Charlie");

        // adds Observers(subscribers) to the Observable(channel)
        s1.subscribeToChannel(channel);
        s2.subscribeToChannel(channel);
        s3.subscribeToChannel(channel);

        // notifies all Observers(subscribers) that a new video has been uploaded
        channel.uploadVideo(); // Alice, Bob, Charlie get notified

        System.out.println("--------");

        // removes Observer(subscriber) from the Observable(channel)
        s2.unsubscribeFromChannel();

        // again, notifies all Observers(subscribers) that a new video has been uploaded
        channel.uploadVideo(); // Only Alice, Charlie get notified
    }
}
