package unidade4.For;

import javax.swing.JOptionPane;

public class forSequ3Em32 {

	public static void main(String[] args) {
		
		long s = 1, s9 = 0, s10 = 0, s137 = 0, s1982 = 0, s9872 = 0;
		
		for (int i = 2; i <= 10000; i++)
		{
			s = s + 3;
			if (i == 9)
				s9 = s;
			else if (i == 10)
				s10 = s;
			else if (i == 137)
				s137 = s;
			else if (i == 1982)
				s1982 = s;
			else if (i == 9872)
				s9872 = s;
		}
		JOptionPane.showMessageDialog(null, "S9: "+s9+"\nS10: "+s10+"\nS137: "+s137+
				"\nS1982: "+s1982+"\nS9872: "+s9872);
	}

}