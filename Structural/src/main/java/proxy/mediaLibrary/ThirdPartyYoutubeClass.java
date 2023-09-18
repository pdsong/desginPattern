package proxy.mediaLibrary;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    @Override
    public Map<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video...");
        experienceNetWorkLatency();
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done! \n");
        return video;
    }

    private void experienceNetWorkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int random(int min, int max) {
        return (int) (min + (Math.random() * (max - min) + 1));
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to Server " + server + "...");
        experienceNetWorkLatency();
        System.out.println("Connected!\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars");
        experienceNetWorkLatency();
        HashMap<String, Video> hmap = new HashMap<>();
        hmap.put("Catzzzzz", new Video("1", "CatVideo.mp4"));
        hmap.put("Cowzzzzz", new Video("2", "CowVideo.mp4"));
        hmap.put("Dogzzzzz", new Video("3", "DogVideo.mp4"));
        hmap.put("Horsezzz", new Video("4", "HorseVideo.mp4"));
        hmap.put("Jokerzzz", new Video("5", "JokerVideo.mp4"));
        System.out.println("DONE! " + "\n");
        return hmap;
    }
}
