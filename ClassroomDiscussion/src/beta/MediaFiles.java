package beta;

public class MediaFiles {
    String filename;
    int filesize;
    String fileType;

    public MediaFiles(String filename,
    int filesize,
    String fileType){
        this.filename = filename;
        this.fileType = fileType;
        this.filesize = filesize;
    }

    void play(){System.out.println("Media is getting played");}
    void pause(){System.out.println("Media is paused");}
    void stop(){System.out.println("Media is stopped");}

}
