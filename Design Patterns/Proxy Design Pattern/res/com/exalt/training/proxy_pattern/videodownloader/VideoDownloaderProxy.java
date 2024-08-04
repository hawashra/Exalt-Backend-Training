package com.exalt.training.proxy_pattern.videodownloader;

import com.exalt.training.proxy_pattern.video.Video;

import java.util.HashMap;

public class VideoDownloaderProxy implements VideoDownloaderLib {
    private final HashMap<String, Video> cachedVideos;
    private final VideoDownloaderClass videoDownloader;

    public VideoDownloaderProxy(VideoDownloaderClass videoDownloader) {
        this.videoDownloader = videoDownloader;
        cachedVideos = new HashMap<>();
    }

    @Override
    public Video getVideo(String videoId) {

        if (cachedVideos.containsKey(videoId)) {
            System.out.println("video is cached, playing video...");
            return cachedVideos.get(videoId);
        } else {
            Video video = videoDownloader.getVideo(videoId);
            cachedVideos.put(videoId, video);
            return video;
        }
    }

    public void resetCache() {
        cachedVideos.clear();
    }
}
