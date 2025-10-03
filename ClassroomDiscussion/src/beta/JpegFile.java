package beta;

public class JpegFile  extends SystemFiles{
    JpegFile(String filename, String fileType, int fileSize){
        super(filename,fileType,fileSize);
    }
    void displayFile(){
        System.out.println("Displayed as Flat Image");
    }
}
