package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String ageAsString = JOptionPane.showInputDialog("how old are you?");
int ageAsInt = Integer.parseInt(ageAsString);
if (ageAsInt<18) {
	JOptionPane.showMessageDialog(null, "nobody cares what you think. you just a young person!");
} else if (ageAsInt>=18) {
	JOptionPane.showInputDialog("Who do you think the next president should be?");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
