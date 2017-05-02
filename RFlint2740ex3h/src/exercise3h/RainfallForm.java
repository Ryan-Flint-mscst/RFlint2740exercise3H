package exercise3h;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RainfallForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList<Object> rainfallList;
	private JLabel totalLAbel;
	private JLabel averageLabel;
	private JLabel maximumLabel;
	private JLabel minimumLabel;
	private JTextField inputMonthTextField;
	private String[] strRainfall = {
			"1.2", "2.7", "2.2", "3.1", "2.9", "5.1", 
			"3.2", "2.7", "3.6", "1.8", "2.2", "1.7" };	
	private JButton updateButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RainfallForm frame = new RainfallForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public RainfallForm() {
		setTitle("RFlint 2740 Exercise 3H Rainfall");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 383);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Label.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monthly Rainfall:");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JList<Object> monthList = new JList<Object>();
		monthList.setBackground(UIManager.getColor("List.background"));
		monthList.setEnabled(false);
		monthList.setModel(new AbstractListModel<Object>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"01 Jan", "02 Feb", "03 Mar", "04 Apr", "05 May", "06 Jun", "07 Jul", "08 Aug", "09 Sep", "10 Oct", "11 Nov", "12 Dec"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		monthList.setBounds(10, 58, 49, 203);
		contentPane.add(monthList);
		
		rainfallList = new JList<Object>(strRainfall);
		rainfallList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				do_rainfallList_valueChanged(arg0);
			}
		});
		rainfallList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		rainfallList.setBounds(79, 56, 49, 213);
		contentPane.add(rainfallList);
		
		JLabel lblNewLabel_1 = new JLabel("Total:");
		lblNewLabel_1.setBounds(138, 75, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Average:");
		lblNewLabel_2.setBounds(138, 118, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Maximum:");
		lblNewLabel_3.setBounds(138, 158, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Minimum:");
		lblNewLabel_4.setBounds(138, 209, 67, 14);
		contentPane.add(lblNewLabel_4);
		
		totalLAbel = new JLabel("0.0");
		lblNewLabel_1.setLabelFor(totalLAbel);
		totalLAbel.setHorizontalAlignment(SwingConstants.RIGHT);
		totalLAbel.setBounds(274, 58, 49, 31);
		totalLAbel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(totalLAbel);
		
		averageLabel = new JLabel("0.0");
		lblNewLabel_2.setLabelFor(averageLabel);
		averageLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		averageLabel.setBounds(274, 100, 46, 32);
		averageLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(averageLabel);
		
		maximumLabel = new JLabel("0.0");
		lblNewLabel_3.setLabelFor(maximumLabel);
		maximumLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		maximumLabel.setBounds(274, 158, 46, 31);
		maximumLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(maximumLabel);
		
		minimumLabel = new JLabel("0.0");
		lblNewLabel_4.setLabelFor(minimumLabel);
		minimumLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		minimumLabel.setBounds(274, 209, 49, 31);
		minimumLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(minimumLabel);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_calculateButton_actionPerformed(arg0);
			}
		});
		calculateButton.setBounds(255, 256, 89, 23);
		contentPane.add(calculateButton);
		
		inputMonthTextField = new JTextField();
		inputMonthTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		inputMonthTextField.setText("0.0");
		inputMonthTextField.setBounds(77, 279, 51, 20);
		contentPane.add(inputMonthTextField);
		inputMonthTextField.setColumns(10);
		
		updateButton = new JButton("Update");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_updateButton_actionPerformed(e);
			}
		});
		updateButton.setBounds(72, 310, 67, 23);
		updateButton.setEnabled(false);
		contentPane.add(updateButton);
	}
	protected void do_calculateButton_actionPerformed(ActionEvent arg0) {
		 Rainfall rainfall = new Rainfall (strRainfall);
		
		 DecimalFormat fmt = new DecimalFormat("0.0");
		 totalLAbel.setText(fmt.format(rainfall.getTotal()));
		 averageLabel.setText(fmt.format(rainfall.getAverage()));
		 maximumLabel.setText(fmt.format(rainfall.getHighest()));
		 minimumLabel.setText(fmt.format(rainfall.getLowest()));
	}
	protected void do_updateButton_actionPerformed(ActionEvent e) {
		 int selectedIndex = rainfallList.getSelectedIndex();
		 double r = Double.parseDouble(inputMonthTextField.getText());
		 strRainfall[selectedIndex] = Double.toString(r);
		 rainfallList.repaint();
		
		 inputMonthTextField.setText("0.0");
		 updateButton.setEnabled(false);
		 totalLAbel.setText("");
		 averageLabel.setText("");
		 minimumLabel.setText("");
		 maximumLabel.setText("");
	}
	protected void do_rainfallList_valueChanged(ListSelectionEvent arg0) {
		 updateButton.setEnabled(true);
		 inputMonthTextField.setText((String) rainfallList.getSelectedValue());
		 inputMonthTextField.requestFocus();
		 inputMonthTextField.selectAll();
	}
}
