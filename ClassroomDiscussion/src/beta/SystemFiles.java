package beta;

public class SystemFiles {
    String filename;
    String fileType;
    int fileSize;

    SystemFiles(String filename, String fileType, int fileSize){
        this.filename = filename;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    void displayFileInfo(){
        System.out.println("File Name: " + filename);
        System.out.println("File Type: " + fileType);
        System.out.println("File Size: " + fileSize + " KB");
    }
}
