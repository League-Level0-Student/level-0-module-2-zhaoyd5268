package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

public static void main(String[] args) {
	Random number = new Random();
int lotterynumber = number.nextInt(100);
int lotterynumber2 = number.nextInt(100);
int lotterynumber3 = number.nextInt(100);
int lotterynumber4 = number.nextInt(100);
int lotterynumber5 = number.nextInt(100);
int lotterynumber6 = number.nextInt(100);
JOptionPane.showMessageDialog(null, +lotterynumber+", " +lotterynumber2+
		", " +lotterynumber3+ ", " + lotterynumber4+ ", " +lotterynumber5+ 
		", " +lotterynumber6, "Your Lottery Numbers!", 1);




}


}
