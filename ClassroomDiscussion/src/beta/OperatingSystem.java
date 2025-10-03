package beta;

public class OperatingSystem {
    public static void main(String[] args) {
        Photoshop p = new Photoshop();
        JpegFile jpeg = new JpegFile("myphoto",".jpg",45);
        PsdFile psd = new PsdFile("MyDesign", ".psd", 123);
        TxtFile txt = new TxtFile("MyEssay", ".txt", 12);
        p.openFile(jpeg);
        p.openFile(psd);
        p.openFile(txt);
    }
}
