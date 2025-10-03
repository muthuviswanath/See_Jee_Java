package beta;

import java.util.Scanner;

public class VLCMediaPlayer {
    MediaFiles file;

    void openFile(MediaFiles file) {
        this.file = file;
        if (file instanceof Mp4File) {
            Mp4File m4 = (Mp4File) file;
            m4.display();
        }

    }

    void playFile() {
        file.play();
    }

    void pauseFile() {
        file.pause();
    }

    void stop() {
        file.stop();
    }

    public static void main(String[] args) {
        VLCMediaPlayer vlc = new VLCMediaPlayer();
        Scanner s = new Scanner(System.in);
        Mp3File mp3 = new Mp3File("xyz", 345, ".mp3");
        Mp4File mp4 = new Mp4File("abc", 2345, ".mp4");
        do {
            System.out.println("1. Load the File");
            System.out.println("2. Play");
            System.out.println("3. Pause");
            System.out.println("4. Stop");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose the file:");
                    System.out.println("1. Mp3");
                    System.out.println("2. Mp4");
                    int ch = s.nextInt();
                    if (ch == 1)
                        vlc.openFile(mp3);
                    else
                        vlc.openFile(mp4);
                    break;
                case 2:
                    if (vlc.file != null) {
                        vlc.playFile();
                    } else {
                        System.out.println("Load the file to play");
                    }
                    break;
                case 3:
                    if (vlc.file != null) {
                        vlc.pauseFile();
                    } else {
                        System.out.println("Load the file to pause");
                    }
                    break;
                case 4:
                    if (vlc.file != null) {
                        vlc.stop();
                    } else {
                        System.out.println("Load the file to stop");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Inalid choice");

            }
        } while (true);
    }
}
