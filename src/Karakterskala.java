

import javax.swing.JOptionPane;

public class Karakterskala {

	public static void main(String[] args) {
		
		
	for (int i = 0; i < 10; i++) {	
		int karakter = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange poeng fikk du?")); 
		
		String tm = "Karakteren din er";
		
		if (karakter > 100 || karakter < 0 ) {
			JOptionPane.showMessageDialog(null," Prøv på nytt!");
			i--;
		}
		else if(karakter >= 90) {
			JOptionPane.showMessageDialog(null, tm + " A");
			System.out.println(karakter);
		}
		else if (karakter >= 80) {
			JOptionPane.showMessageDialog(null, tm + " B");
			System.out.println(karakter);
		}
		else if (karakter >= 60) {
			JOptionPane.showMessageDialog(null, tm + " C");
			System.out.println(karakter);
		}
		else if (karakter >= 50) {
			JOptionPane.showMessageDialog(null, tm + " D");
			System.out.println(karakter);
		}
		else if (karakter >= 40) {
			JOptionPane.showMessageDialog(null, tm + " E");
			System.out.println(karakter);
		}
		else {
			JOptionPane.showMessageDialog(null, tm + " F");
			System.out.println(karakter);
		}
		}
	}
}