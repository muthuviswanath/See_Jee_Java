package dsascenario_two;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextJustification {

	public static List<String> justifyText(String [] words, int maxWidth){
		List<String> result = new ArrayList<String>();
		List<String> currentLine = new ArrayList<String>();
		int currentLength = 0;

		for(String word : words) {
			if(currentLength + currentLine.size() + word.length() > maxWidth) {
				result.add(justifyLine(currentLine, currentLength,maxWidth,false));
				currentLine.clear();
				currentLength = 0;
			}
			currentLine.add(word);
			currentLength += word.length();
					
		}
		result.add(justifyLine(currentLine, currentLength,maxWidth,true));
		return result;
	}
	
	public static String justifyLine(List<String> wordsInLine, 
										int lineLength, 
										int maxWidth,
										boolean lastLine) {
		if(wordsInLine.size() == 1 || lastLine) {
			StringBuilder sb = new StringBuilder(String.join(" ", wordsInLine));
			while(sb.length() < maxWidth) {
				sb.append(" ");
			}
			return sb.toString();
		}
		
		int totalspace = maxWidth - lineLength;
		int gaps = wordsInLine.size() -1;
		int spacesPerGap  = totalspace / gaps;
		int extraSpaces = totalspace % gaps;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<wordsInLine.size();i++) {
			sb.append(wordsInLine.get(i));
			if(i < gaps) {
				int spacesToAdd = spacesPerGap + (i < extraSpaces? 1 : 0);
				for (int j = 0; j<spacesToAdd;j++) sb.append(" ");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
		int maxWidth = 16;
		List<String> justified_text =  justifyText(words,maxWidth);
		System.out.println(justified_text);
	}
}
