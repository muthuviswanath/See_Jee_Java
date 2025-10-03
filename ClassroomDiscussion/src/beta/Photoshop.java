package beta;

public class Photoshop {
    void openFile(SystemFiles file){
        file.displayFileInfo();
        if (file instanceof JpegFile){
            JpegFile j = (JpegFile) file;
            j.displayFile();
            }
            else if(file instanceof PsdFile){
                PsdFile p = (PsdFile) file;
                p.editFile();
            }
            else if(file instanceof TxtFile){
                TxtFile t = (TxtFile) file;
                t.accessFile();
            }
    }
}
