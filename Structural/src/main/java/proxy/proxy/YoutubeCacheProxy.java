package proxy.proxy;

import proxy.mediaLibrary.ThirdPartyYoutubeClass;
import proxy.mediaLibrary.ThirdPartyYoutubeLib;
import proxy.mediaLibrary.Video;

import java.util.HashMap;
import java.util.Map;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib youtubeService;
    private Map<String, Video> cachePopular = new HashMap<>();
    private Map<String, Video> cacheAll = new HashMap<>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass();
    }

    @Override
    public Map<String, Video> popularVideos() {
        if (cachePopular.isEmpty())
            cachePopular = youtubeService.popularVideos();
        else
            System.out.println("retrieved list from cache.");
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video " + videoId + " from Cache");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
