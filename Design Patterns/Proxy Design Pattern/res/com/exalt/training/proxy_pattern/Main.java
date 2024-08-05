package com.exalt.training.proxy_pattern;

import com.exalt.training.proxy_pattern.videodownloader.VideoDownloaderClass;
import com.exalt.training.proxy_pattern.videodownloader.VideoDownloaderProxy;

public class Main {
    public static void main(String[] args) {

        VideoDownloaderClass videoDownloaderClass = new VideoDownloaderClass();
        VideoDownloaderProxy videoDownloaderProxy = new VideoDownloaderProxy(videoDownloaderClass);

        videoDownloaderProxy.getVideo("funny cats playing");
        videoDownloaderProxy.getVideo("funny cats playing");

    }
}