package org.hq.calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorUI extends JFrame{
	
	/**
	 * ������UI
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static CalculatorUI mainWindow = null;
	private Calculator ocal = null;
	private JLabel oLabel;
	private JLabel oResLabel;
	private JTextField oTextField;
	private JTextField oResTextField;
	private JButton oCalcButton;
	private JButton oExitButton;
	
	//���ְ�ť
	private JButton oJbone, oJbtwo, oJbthree, oJbfour, oJbfive, oJbsix, oJbseven, oJbeight, oJbnine, oJbdot;
	private JButton oJbzero;
	
	//�����
	private JButton oJbadd, oJbsub, oJbmut, oJbdiv;
	
	//��������
	private JButton oJbLeftBra, oJbRightBra;
	
	private final int FRAME_WIDTH = 350;
	private final int FRAME_HEIGHT = 400;
	private final int BUTTON_HEIGTH = 30;
	private final int BUTTON_WIDTH = 50;
	private final int PADDING_LEFT = 40;
	
	public CalculatorUI(){
		super();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.getContentPane().setLayout(null);
		this.add(getJLabel(), null);
		this.add(getJTextField(), null);
		this.add(getResJLabel(), null);
		this.add(getReslJTextField(), null);
		
		//������ְ�ť
		getNumberButton();
		this.add(oJbone, null);
		this.add(oJbtwo, null);
		this.add(oJbthree, null);
		this.add(oJbfour, null);
		this.add(oJbfive, null);
		this.add(oJbsix, null);
		this.add(oJbseven, null);
		this.add(oJbeight, null);
		this.add(oJbnine, null);
		this.add(oJbdot, null);
		this.add(oJbzero, null);
		
		//����������ť
		getCalculateButton();
		this.add(oJbadd, null);
		this.add(oJbsub, null);
		this.add(oJbmut, null);
		this.add(oJbdiv, null);
		
		//����������Ű�ť
		getBraButton();
		this.add(oJbLeftBra, null);
		this.add(oJbRightBra, null);
		//������˳���ť
		this.add(getEqueJButton(), null);
		this.add(getExitJButton(), null);
		this.setTitle("������");
	}

	private class OnCalcButtonClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// ������ʽ
			if("".equals(oTextField.getText())){
				oResTextField.setText("��������ʽ");
			}else{
				String resStr = calculate(oTextField.getText());
				oTextField.setText("");
				oResTextField.setText(resStr);
			}
		}
	}
	
	private class OnExitButtonClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//�����˳�
			if( null != mainWindow){
				mainWindow.dispose();
				//�˳�java�����
				System.exit(NORMAL);
			}
		}
	}
	
	private String calculate(String calStr){
		if(null == ocal){
			ocal = new Calculator();
		}
		return ocal.caculateFromString(ocal.strFilter(calStr));
	}
	
	//���ı���������ִ�
	private void appendtoTextField(String str){
		oTextField.setText( oTextField.getText() + str);
	}
	
	private JLabel getJLabel() {
		if (oLabel == null) {
			oLabel = new javax.swing.JLabel();
			oLabel.setBounds(PADDING_LEFT, 20, 260, BUTTON_HEIGTH);
			oLabel.setText("�����������ʽ:");
		}
		return oLabel;
	}
	
	private JTextField getJTextField() {
		if (oTextField == null) {
			oTextField = new javax.swing.JTextField();
			oTextField.setBounds(PADDING_LEFT, 50, 260, BUTTON_HEIGTH);
		}
		return oTextField;
	}
	
	private JLabel getResJLabel() {
		if (oResLabel == null) {
			oResLabel = new javax.swing.JLabel();
			oResLabel.setBounds(PADDING_LEFT, 100, 260, BUTTON_HEIGTH);
			oResLabel.setText("������:");
		}
		return oResLabel;
	}
	
	private JTextField getReslJTextField(){
		if (oResTextField == null) {
			oResTextField = new javax.swing.JTextField();
			oResTextField.setBounds(PADDING_LEFT, 130, 260, BUTTON_HEIGTH);
			oResTextField.setEnabled(false);	//������༭
		}
		return oResTextField;
	}
	
	//��ȡ���ְ�ť
	private void getNumberButton() {
		//1,2,3,4,5
		if (oJbone == null) {
			oJbone = new javax.swing.JButton();
			oJbone.setBounds(PADDING_LEFT, 180, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbone.setText("1");
		}
		if (oJbtwo == null) {
			oJbtwo = new javax.swing.JButton();
			oJbtwo.setBounds(PADDING_LEFT+2+BUTTON_WIDTH, 180, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbtwo.setText("2");
		}
		if (oJbthree == null) {
			oJbthree = new javax.swing.JButton();
			oJbthree.setBounds(PADDING_LEFT+4+2*BUTTON_WIDTH, 180, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbthree.setText("3");
		}
		if (oJbfour == null) {
			oJbfour = new javax.swing.JButton();
			oJbfour.setBounds(PADDING_LEFT+6+3*BUTTON_WIDTH, 180, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbfour.setText("4");
		}
		if (oJbfive == null) {
			oJbfive = new javax.swing.JButton();
			oJbfive.setBounds(PADDING_LEFT+8+4*BUTTON_WIDTH, 180, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbfive.setText("5");
		}
		//��һ��5,6,7,8,9
		if (oJbsix == null) {
			oJbsix = new javax.swing.JButton();
			oJbsix.setBounds(PADDING_LEFT, 230, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbsix.setText("6");
		}
		if (oJbseven == null) {
			oJbseven = new javax.swing.JButton();
			oJbseven.setBounds(PADDING_LEFT+2+BUTTON_WIDTH, 230, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbseven.setText("7");
		}
		if (oJbeight == null) {
			oJbeight = new javax.swing.JButton();
			oJbeight.setBounds(PADDING_LEFT+4+2*BUTTON_WIDTH, 230, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbeight.setText("8");
		}
		if (oJbnine == null) {
			oJbnine = new javax.swing.JButton();
			oJbnine.setBounds(PADDING_LEFT+6+3*BUTTON_WIDTH, 230, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbnine.setText("9");
		}
		if (oJbdot == null) {
			oJbdot = new javax.swing.JButton();
			oJbdot.setBounds(PADDING_LEFT+8+4*BUTTON_WIDTH, 230, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbdot.setText(".");
		}
		if (oJbzero == null) {
			oJbzero = new javax.swing.JButton();
			oJbzero.setBounds(PADDING_LEFT, 280, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbzero.setText("0");
		}
		
		//���ӵ���¼�
		oJbone.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("1");
			}
		});
		oJbtwo.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("2");
			}
		});
		oJbthree.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("3");
			}
		});
		oJbfour.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("4");
			}
		});
		oJbfive.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("5");
			}
		});
		oJbsix.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("6");
			}
		});
		oJbseven.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("7");
			}
		});
		oJbeight.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("8");
			}
		});
		oJbnine.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("9");
			}
		});
		oJbzero.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("0");
			}
		});
		oJbdot.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField(".");
			}
		});
	}
	
	//�������ť
	private void getCalculateButton() {
		if (oJbadd == null) {
			oJbadd = new javax.swing.JButton();
			oJbadd.setBounds(PADDING_LEFT+2+BUTTON_WIDTH, 280, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbadd.setText("+");
		}
		if (oJbsub == null) {
			oJbsub = new javax.swing.JButton();
			oJbsub.setBounds(PADDING_LEFT+4+2*BUTTON_WIDTH, 280, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbsub.setText("-");
		}
		if (oJbmut == null) {
			oJbmut = new javax.swing.JButton();
			oJbmut.setBounds(PADDING_LEFT+6+3*BUTTON_WIDTH, 280, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbmut.setText("*");
		}
		if (oJbdiv == null) {
			oJbdiv = new javax.swing.JButton();
			oJbdiv.setBounds(PADDING_LEFT+8+4*BUTTON_WIDTH, 280, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbdiv.setText("/");
		}
		
		oJbadd.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("+");
			}
		});
		oJbsub.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("-");
			}
		});
		oJbmut.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("*");
			}
		});
		oJbdiv.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("/");
			}
		});
	}
	
	//�������Ű�ť
	private void getBraButton() {
		if (oJbLeftBra == null) {
			oJbLeftBra = new javax.swing.JButton();
			oJbLeftBra.setBounds(PADDING_LEFT, 330, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbLeftBra.setText("(");
		}
		if (oJbRightBra == null) {
			oJbRightBra = new javax.swing.JButton();
			oJbRightBra.setBounds(PADDING_LEFT+2+BUTTON_WIDTH, 330, BUTTON_WIDTH, BUTTON_HEIGTH);
			oJbRightBra.setText(")");
		}
		oJbLeftBra.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField("(");
			}
		});
		oJbRightBra.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				appendtoTextField(")");
			}
		});
	}
	
	//�ȺŰ�ť
	private JButton getEqueJButton() {
		if (oCalcButton == null) {
			oCalcButton = new javax.swing.JButton();
			oCalcButton.setBounds(PADDING_LEFT+4+2*BUTTON_WIDTH, 330, BUTTON_WIDTH+26, BUTTON_HEIGTH);
			oCalcButton.setText("=");
		}
		oCalcButton.addActionListener( new OnCalcButtonClickListener() );
		return oCalcButton;
	}

	private JButton getExitJButton() {
		if (oExitButton == null) {
			oExitButton = new javax.swing.JButton();
			oExitButton.setBounds(PADDING_LEFT+6+3*BUTTON_WIDTH+26, 330, BUTTON_WIDTH+26, BUTTON_HEIGTH);
			oExitButton.setText("Exit");
		}
		oExitButton.addActionListener( new OnExitButtonClickListener() );
		return oExitButton;
	}
	
	public static void main(String args[]){
		mainWindow = new CalculatorUI();
		mainWindow.setVisible(true);
	}
}
