package unidade4.For;

import javax.swing.JOptionPane;

public class forSequFibonacci2 {

	public static void main(String[] args) {
		
		int i;
		long s = 0, s1 = 1, s2 = 1, s9 = 0, s10 = 0, s14 = 0, s18 = 0, s19 = 0;
				
		for (i = 3; i <= 20; i++)
		{
			s = s1+s2;
			s1 = s2;
			s2 = s;
			
			if (i == 9)
				s9 = s;
			else if (i == 10)
				s10 = s;
			else if (i == 14)
				s14 = s;
			else if (i == 18)
				s18 = s;
			else if (i == 19)
				s19 = s;
		}
		JOptionPane.showMessageDialog(null, "S9: "+s9+"\nS10: "+s10+"\nS14: "+s14+
				"\nS18: "+s18+"\nS19: "+s19);
	}

}