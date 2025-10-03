package beta;

public class Mp4File extends MediaFiles{
    Mp4File(String filename,
    int filesize,
    String fileType){
        super(filename, filesize, fileType);
        }
    void display(){
        System.out.println("A video is displayed along with the audio");
    }
}
