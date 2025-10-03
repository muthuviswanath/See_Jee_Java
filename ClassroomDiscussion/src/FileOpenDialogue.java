import java.io.File;

public class FileOpenDialogue {
    String formControls;
    Button openButton;

    FileOpenDialogue(){
        formControls = "Form Controls";
    }
    Button createButton(){
        openButton = new Button("Open", "Blue");
        return openButton;
    }
    
    public static void main(String[] args) {
        FileOpenDialogue fileOpenDialogue = new FileOpenDialogue();
        Button openButton = fileOpenDialogue.createButton();
        openButton.open();
        fileOpenDialogue = null;
        Button openButton1 = fileOpenDialogue.createButton();
        openButton1.open();
        
    }
}
