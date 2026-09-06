//The bug here is that we are trying to add an int variable (bonusMarks) to a double variable (examMark) without initializing bonusMarks.
public class SnippetB {
    public static void main(String[] args){
        int bonusMarks = 20; 
        double examMark = 68.0; 
        double finalMark = examMark + bonusMarks; 
        System.out.println("Final mark: " + finalMark); 
    }
    
}
