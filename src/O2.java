
import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {
		
				
			for (int i = 0; i < 2; i++) {	
				int inntekt = Integer.parseInt(JOptionPane.showInputDialog("Hvor mye inntekt har du?")); 
				
				String tm = "Du skal betale ";
		
				double trinn1 = 208050;
				double trinn2 = 292851;
				double trinn3 = 670000;
				double trinn4 = 937900;
				double trinn5 = 1350001;
				
				double prosent1 = 1.7 / 100;
				double prosent2 = 4.0 / 100;		
				double prosent3 = 13.6 / 100;
				double prosent4 = 16.6 / 100;
				double prosent5 = 17.6 / 100;
				
				
				double sum = 0;
				
				if (inntekt < 0 ) {
					JOptionPane.showMessageDialog(null," Prøv på nytt!");
					i--;
				}
				else if (inntekt < trinn1 ) {
					JOptionPane.showMessageDialog(null," Du trenger ikke å betale noe i skatt!");
				}
				else if(inntekt >= trinn1 && inntekt <= trinn2) {
					sum = (inntekt - trinn1) * prosent1;
					JOptionPane.showMessageDialog(null, tm + sum);
				}
				
				else if (inntekt >= trinn2 && inntekt <= trinn3) {	
					sum = (inntekt - trinn2) * prosent2;
					sum += (trinn2 - trinn1) * prosent1;
					JOptionPane.showMessageDialog(null, tm + sum);
				}
				
				else if (inntekt >= trinn3 && inntekt <= trinn4) {	
					sum = (inntekt - trinn3) * prosent3;
					sum += (trinn2 - trinn1) * prosent1;
					sum += (trinn3 - trinn2) * prosent2;
					JOptionPane.showMessageDialog(null, tm + sum);
				}
				else if (inntekt >= trinn4 && inntekt <= trinn5) {	
					sum = (inntekt - trinn4) * prosent4;
					sum += (trinn2 - trinn1) * prosent1;
					sum += (trinn3 - trinn2) * prosent2;
					sum += (trinn4 - trinn3) * prosent3;
					JOptionPane.showMessageDialog(null, tm + sum);
				}
				else if (inntekt >= trinn5) {	
					sum = (inntekt - trinn5) * prosent5;
					sum += (trinn2 - trinn1) * prosent1;
					sum += (trinn3 - trinn2) * prosent2;
					sum += (trinn4 - trinn3) * prosent3;
					sum += (trinn5 - trinn4) * prosent4;
					JOptionPane.showMessageDialog(null, tm + sum);
				}
				else {
					JOptionPane.showMessageDialog(null, tm + sum);
				}
				}
			}
		
	}

