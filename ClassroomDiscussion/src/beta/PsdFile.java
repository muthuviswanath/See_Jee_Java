package beta;

public class PsdFile extends SystemFiles{
    public PsdFile(String filename, String fileType, int fileSize){
        super(filename,fileType,fileSize);
    }
    void editFile(){
        System.out.println("Edited as layers");
    }
}
