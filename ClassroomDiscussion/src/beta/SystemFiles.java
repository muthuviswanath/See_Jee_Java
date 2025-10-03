package beta;

public class SystemFiles {
        String filename;
    String fileType;
    int fileSize;

    void displayFileInfo(){
        System.out.println("File Name: " + filename);
        System.out.println("File Type: " + fileType);
        System.out.println("File Size: " + fileSize + " KB");
    }
}
