public class VideoDownloaderClass implements VideoDownloaderLib {
    @Override
    public Video getVideo(String videoId) {
        System.out.println("connecting to www.youtube.com/" + videoId);
        System.out.println("Loading video...");
        System.out.println("playing video...");
        return new Video(videoId);
    }
}
