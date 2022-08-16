//sample
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	JFrame jf;
	JLabel displayLable;
	String oldValue;
	
	
	
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton equalButton;
	JButton mulButton;
	JButton dotButton;
	JButton divButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	
	
	public Calculator() {
		jf=new JFrame("CALCULATOR...");
		jf.setLayout(null);
		jf.setSize(700, 700);
		jf.setLocation(450, 100);
		
		
		displayLable=new JLabel(" ");
		displayLable.setBounds(20,20, 600, 50);
		displayLable.setFont(new Font("Arial",Font.PLAIN,50));
		displayLable.setBackground(Color.black);
		displayLable.setOpaque(true);
		displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLable.setForeground(Color.WHITE);
		jf.add(displayLable);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(40,90,80,80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,50));	
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(140,90,80,80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(eightButton);
		

	    nineButton=new JButton("9");
		nineButton.setBounds(240,90,80,80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(nineButton);
		
		
	    fourButton=new JButton("4");
		fourButton.setBounds(40,190,80,80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(fourButton);
		
	    fiveButton=new JButton("5");
		fiveButton.setBounds(140,190,80,80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(fiveButton);
		

		sixButton=new JButton("6");
		sixButton.setBounds(240,190,80,80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(sixButton);
		
		
	    oneButton=new JButton("1");
		oneButton.setBounds(40,290,80,80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(oneButton);
		
	    twoButton=new JButton("2");
		twoButton.setBounds(140,290,80,80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(twoButton);
		

	    threeButton=new JButton("3");
		threeButton.setBounds(240,290,80,80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(threeButton);
		
		

	    dotButton=new JButton(".");	
		dotButton.setBounds(40,390,80,80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(dotButton);
		
	    zeroButton=new JButton("0");
		zeroButton.setBounds(140,390,80,80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(zeroButton);
		

	    equalButton=new JButton("=");
		equalButton.setBounds(240,390,80,80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(equalButton);
		

		divButton=new JButton("/");
		divButton.setBounds(340,90,80,80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(divButton);
		

	    mulButton=new JButton("x");
		mulButton.setBounds(340,190,80,80);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(mulButton);
		

	    minusButton=new JButton("-");
		minusButton.setBounds(340,290,80,80);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(minusButton);
		

	    plusButton=new JButton("+");
		plusButton.setBounds(340,390,80,80);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(plusButton);
		
		 clearButton=new JButton("clear");
		 clearButton.setBounds(200, 490, 80, 80);
		 clearButton.addActionListener(this);
		 clearButton.setFont(new Font("Arial",Font.PLAIN,20));
		jf.add( clearButton); 
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//jf.getContentPane().setBackground(Color.gray); 	
		
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLable.setText("7");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"7");
			}
				
			
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLable.setText("8");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"8");
			
			}
			
		}else if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLable.setText("9");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"9");
			}
			
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLable.setText("4");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"4");
			}
			
		}else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLable.setText("5");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"5");
			}
			
		}else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLable.setText("6");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"6");
			}
			
		}else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLable.setText("1");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"1");
			}
			
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLable.setText("2");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"2");
			}
			
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLable.setText("3");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"3");
				
			}
			
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLable.setText("3");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+"0");
			}
			
		
		}else if(e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displayLable.setText("3");
				isOperatorClicked=false;
			}else {
				displayLable.setText(displayLable.getText()+".");
			}
			
			
			
		}else if(e.getSource()==equalButton) {
			
		
			
		}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
	
			
		}else if(e.getSource()==mulButton) {
			isOperatorClicked=true;
		
			
			
		}else if(e.getSource()==minusButton) {
			isOperatorClicked=true;
		
			
			
		}else if(e.getSource()==plusButton) {
			isOperatorClicked=true;
	
			
			//displayLable.setText("+");
			
			
		}else if(e.getSource()== clearButton) {
			displayLable.setText("");
		}
			
		
		
	}

}




