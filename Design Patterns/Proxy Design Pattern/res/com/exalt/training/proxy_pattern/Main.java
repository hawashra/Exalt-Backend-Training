//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VideoDownloaderClass videoDownloaderClass = new VideoDownloaderClass();
        VideoDownloaderProxy videoDownloaderProxy = new VideoDownloaderProxy(videoDownloaderClass);

        videoDownloaderProxy.getVideo("funny cats playing");
        videoDownloaderProxy.getVideo("funny cats playing");

    }
}