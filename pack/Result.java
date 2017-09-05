package pack;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Rectangle;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

public class Result extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	public JTextField jTextField = null;
	public JTextField jTextField1 = null;
	public JTextField jTextField2 = null;
	private JButton jButton = null;
	/**
	 * This is the default constructor
	 */
	public Result() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(345, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("              The Result  ");
		this.setVisible(true);
		this.setLocation(400, 200);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(250, 40, 48, 16));
			jLabel2.setText("  output");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(172, 42, 47, 16));
			jLabel1.setText("    input");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(5, 43, 122, 16));
			jLabel.setText("  composite  service");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(getJTextField1(), null);
			jContentPane.add(getJTextField2(), null);
			jContentPane.add(getJButton(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(17, 78, 116, 20));
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(new Rectangle(171, 79, 60, 20));
		}
		return jTextField1;
	}

	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setBounds(new Rectangle(246, 81, 60, 20));
		}
		return jTextField2;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(126, 119, 99, 24));
			jButton.setText("  ok");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});	
		}
		return jButton;
	}
	public static void main(String[] args) {
		Result r = new Result();
	}
}  //  @jve:decl-index=0:visual-constraint="187,84"
