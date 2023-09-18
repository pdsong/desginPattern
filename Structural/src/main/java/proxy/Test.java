package proxy;

import proxy.downloader.YoutubeDownloader;
import proxy.mediaLibrary.ThirdPartyYoutubeClass;
import proxy.proxy.YoutubeCacheProxy;

public class Test {


    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);

        System.out.println("Time saved by cacheing proxy: " + (naive - smart) + " ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPoplularVideos();
        downloader.renderVideoPage("Catzzzzz");
        downloader.renderPoplularVideos();
        downloader.renderVideoPage("newOne");
        downloader.renderVideoPage("Catzzzzz");
        downloader.renderVideoPage("newOne");

        long estimedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimedTime + "\n");
        return estimedTime;
    }
}
