

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		
		
		int fakultet = Integer.parseInt(JOptionPane.showInputDialog("Hva vil du fakultere?")); 
		int resultat=1;
		
		for (int i=1; i<=fakultet; i++) {
			resultat=resultat*i;
		}
		JOptionPane.showMessageDialog(null, resultat);
		System.out.println(resultat);
	}
	
	
		
}
