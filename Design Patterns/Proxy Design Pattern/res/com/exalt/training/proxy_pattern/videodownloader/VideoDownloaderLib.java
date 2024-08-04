package com.exalt.training.proxy_pattern.videodownloader;

import com.exalt.training.proxy_pattern.video.Video;

public interface VideoDownloaderLib {
    Video getVideo(String videoId);
}
