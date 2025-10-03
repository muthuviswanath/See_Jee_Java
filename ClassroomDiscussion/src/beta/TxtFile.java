package beta;

public class TxtFile extends SystemFiles{
    public TxtFile(String filename, String fileType, int fileSize){
        super(filename,fileType,fileSize);
    }
    void accessFile(){
        System.out.println("Cannot be opened in Photoshop");
    }
}
