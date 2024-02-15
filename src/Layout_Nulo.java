import javax.swing.*;

class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,800);
		setLocationRelativeTo(null);
		setTitle("Layout NULO");
		setVisible(true);
		
		JLabel txtPrimerEti = new JLabel("<html><body>The <b>Classic Form</b> includes all visible fiel for <br>this list </body></html>");
		txtPrimerEti.setBounds(20, 20, 500, 40);
		add(txtPrimerEti);
		
		JLabel txtSegunEti = new JLabel("<html><body> <b>Form Options</b></body></html>");
		txtSegunEti.setBounds(20, 70, 100, 20);
		add(txtSegunEti);
		
		JLabel txtTerseEti = new JLabel("Inclide the following:");
		txtTerseEti.setBounds(20, 95, 200, 15);
		add(txtTerseEti);
		
		JCheckBox chkprimer = new JCheckBox();
		chkprimer.setBounds(15, 115, 60, 20);
		add(chkprimer);
		
		JLabel txtCuartEti = new JLabel("a title for you form");
		txtCuartEti.setBounds(50, 115, 200, 20);
		add(txtCuartEti);
		
		JTextField cajaPrimer = new JTextField("Subscribe to our mailing list");
		cajaPrimer.setBounds(20, 140, 300, 20);
		add(cajaPrimer);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton radioprimer = new JRadioButton("only requiered fields");
		radioprimer.setBounds(15, 200, 200, 20);
		add(radioprimer);
		
		JRadioButton radioSegun = new JRadioButton("all fields");
		radioSegun.setBounds(15, 220, 200, 20);
		add(radioSegun);
		
	}
	
}


public class Layout_Nulo {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaPrincipal();
			}
		}
		);

	}

}
