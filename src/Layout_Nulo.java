import javax.swing.*;

class VentanaPrincipal extends JFrame{
	
	ImageIcon iconobtn = new ImageIcon("src/Imagenes/suscribirse.png");
	
	public VentanaPrincipal() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(825,570);
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
		chkprimer.setBounds(15, 115, 20, 20);
		add(chkprimer);
		
		JLabel txtCuartEti = new JLabel("a title for you form");
		txtCuartEti.setBounds(50, 115, 200, 20);
		add(txtCuartEti);
		
		JTextField cajaPrimer = new JTextField("Subscribe to our mailing list");
		cajaPrimer.setBounds(20, 140, 245, 29);
		add(cajaPrimer);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton radioprimer = new JRadioButton("only requiered fields");
		radioprimer.setBounds(15, 200, 200, 20);
		bg.add(radioprimer);
		add(radioprimer);
		
		JRadioButton radioSegun = new JRadioButton("all fields");
		radioSegun.setBounds(15, 220, 200, 20);
		bg.add(radioSegun);
		add(radioSegun);
		
		JLabel txtQuintEti = new JLabel("(edit requiered fields in the form builder)");
		txtQuintEti.setBounds(30, 210, 250, 80);
		add(txtQuintEti);
		
		JCheckBox chkSegundo = new JCheckBox();
		chkSegundo.setBounds(15, 290, 20, 20);
		add(chkSegundo);
		
		JLabel txtSextoEti = new JLabel("interest group fields");
		txtSextoEti.setBounds(45, 290, 150, 20);
		add(txtSextoEti);
		
		JCheckBox chkTerserEti = new JCheckBox();
		chkTerserEti.setBounds(15, 310, 20, 20);
		add(chkTerserEti);
		
		JLabel txtSeptiEti = new JLabel("required field indicators");
		txtSeptiEti.setBounds(45, 310, 150, 20);
		add(txtSeptiEti);
		
		JLabel txtOctavEti = new JLabel("Set form width");
		txtOctavEti.setBounds(18, 350, 150, 20);
		add(txtOctavEti);
		
		JTextField cajaSegund = new JTextField();
		cajaSegund.setBounds(18, 375, 245, 29);
		add(cajaSegund);
		
		JLabel txtNovenEti = new JLabel("Enhance your form");
		txtNovenEti.setBounds(18, 415, 150, 20);
		add(txtNovenEti);
		
		JCheckBox chk4 = new JCheckBox();
		chk4.setBounds(15, 435, 20, 20);
		add(chk4);
		
		JLabel txtDecimEti = new JLabel("enable evil popup mode");
		txtDecimEti.setBounds(48, 435, 150, 20);
		add(txtDecimEti);
		
		JCheckBox chk5 = new JCheckBox();
		chk5.setBounds(15, 455, 20, 20);
		add(chk5);
		
		JLabel txt11 = new JLabel("disable all JavaScript");
		txt11.setBounds(48, 455, 150, 20);
		add(txt11);
		
		JCheckBox chk6 = new JCheckBox();
		chk6.setBounds(15, 475, 20, 20);
		add(chk6);
		
		JLabel txt12 = new JLabel("include archive link");
		txt12.setBounds(48, 475, 150, 20);
		add(txt12);
		
		JCheckBox chk7 = new JCheckBox();
		chk7.setBounds(15, 495, 20, 20);
		add(chk7);
		
		JLabel txt13 = new JLabel("include MonkeyRewards link");
		txt13.setBounds(48, 495, 170, 20);
		add(txt13);
		
		JLabel txt14 = new JLabel("Preview");
		txt14.setBounds(285, 22, 80, 20);
		add(txt14);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(285, 50, 500, 250);
		panel1.setBorder(BorderFactory.createTitledBorder(""));
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(767, 50, 20, 250);
		add(scroll);
		
		JLabel txt15 = new JLabel("Email Address");
		txt15.setBounds(305, 65, 150, 20);
		add(txt15);
		
		JFormattedTextField fTF1 = new JFormattedTextField();
		fTF1.setBounds(305, 85, 445, 29);
		add(fTF1);
		
		JLabel txt16 = new JLabel("First Name");
		txt16.setBounds(305, 125, 150, 20);
		add(txt16);
		
		JTextField caja3 = new JTextField();
		caja3.setBounds(305, 145, 445, 29);
		add(caja3);
		
		JLabel txt17 = new JLabel("Last Name");
		txt17.setBounds(305, 185, 150, 20);
		add(txt17);
		
		JTextField caja4 = new JTextField();
		caja4.setBounds(305, 205, 445, 29);
		add(caja4);
		
		JButton btn1 = new JButton();
		btn1.setIcon(iconobtn);
		btn1.setBounds(305, 247, 120, 20);
		add(btn1);
		
		getContentPane().add(panel1);
		
		JLabel txt18 = new JLabel("Copy/paste onto your site");
		txt18.setBounds(285, 325, 150, 20);
		add(txt18);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(285, 353, 500, 115);
		panel2.setBorder(BorderFactory.createTitledBorder(""));
		
		JScrollPane scroll2 = new JScrollPane();
		scroll2.setBounds(767, 353, 20, 115);
		add(scroll2);
		
		getContentPane().add(panel2);
		
		
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
