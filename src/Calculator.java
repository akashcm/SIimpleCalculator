import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	
	
	boolean operatorClicked=false;
      String oldValue;
	int operators;
	
	JFrame jf;
	JLabel displatLabal;
	JButton sevenButton , eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton;
	JButton twoButton,threeButton,zeroButton,dotButton,equalButton,backspaceButton;
	JButton mulButton,minusButton,divButton,clearButton,plusButton; 

   
   NumberFormat percentageFormat = NumberFormat.getPercentInstance();

	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(335, 550);
		jf.setLocation(400, 200);
	//	jf.setBackground(Color.BLACK);
		jf.getContentPane().setBackground( Color.BLACK);
		
		displatLabal=new JLabel();
		displatLabal.setBounds(20, 30, 280, 50);
		displatLabal.setBackground(Color.WHITE);
		displatLabal.setOpaque(true);
		displatLabal.setHorizontalAlignment(SwingConstants.RIGHT);
		displatLabal.setForeground(Color.black);
		displatLabal.setFont(new Font("Arial",Font.PLAIN,60));
		
		jf.add(displatLabal);
		
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(20,170,50,50);
		sevenButton.addActionListener(this);
		sevenButton.setForeground(Color.WHITE);
		sevenButton.setBackground(Color.BLACK);
		
		jf.add(sevenButton);
		
		
		 eightButton=new JButton("8");
		 eightButton.setBounds(90, 170, 50, 50);
		 eightButton.addActionListener(this);
		 eightButton.setForeground(Color.WHITE);
		 eightButton.setBackground(Color.BLACK);
		
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton .setBounds(160, 170, 50, 50);
		nineButton.addActionListener(this);
		nineButton.setForeground(Color.WHITE);
		nineButton.setBackground(Color.BLACK);
		jf.add(nineButton);
		

		fourButton=new JButton("4");
		fourButton.setBounds(20, 240, 50, 50);
		fourButton.addActionListener(this);
		fourButton.setForeground(Color.WHITE);
		fourButton.setBackground(Color.BLACK);
		jf.add(fourButton);
		

		fiveButton=new JButton("5");
		fiveButton.setBounds(90, 240, 50, 50);
		fiveButton.addActionListener(this);
		fiveButton.setForeground(Color.WHITE);
		fiveButton.setBackground(Color.BLACK);
		jf.add(fiveButton);

		sixButton=new JButton("6");
		sixButton.setBounds(160, 240, 50, 50);
		sixButton.setForeground(Color.WHITE);
		sixButton.addActionListener(this);
		sixButton.setBackground(Color.BLACK);
		jf.add(sixButton);

		oneButton=new JButton("1");
		oneButton.setBounds(20, 310, 50, 50);
		oneButton.addActionListener(this);
		oneButton.setForeground(Color.WHITE);
		oneButton.setBackground(Color.BLACK);
		jf.add(oneButton);

		twoButton=new JButton("2");
		twoButton.setBounds(90, 310, 50, 50);
		twoButton.addActionListener(this);
		twoButton.setForeground(Color.WHITE);
		twoButton.setBackground(Color.BLACK);
		jf.add(twoButton);

		threeButton=new JButton("3");
		threeButton.setBounds(160, 310, 50, 50);
		threeButton.addActionListener(this);
		threeButton.setForeground(Color.WHITE);
		threeButton.setBackground(Color.BLACK);
		jf.add(threeButton);

		dotButton=new JButton(".");
		dotButton.setBounds(90, 390, 50, 50);
		dotButton.addActionListener(this);
		dotButton.setForeground(Color.WHITE);
		dotButton.setBackground(Color.BLACK);
		jf.add(dotButton);

		zeroButton=new JButton("0");
		zeroButton.setBounds(20, 390, 50, 50);
		zeroButton.addActionListener(this);
		zeroButton.setForeground(Color.WHITE);
		zeroButton.setBackground(Color.BLACK);
		jf.add(zeroButton);

		equalButton=new JButton("=");
		equalButton.setBounds(160, 390, 140, 50);
		equalButton.addActionListener(this);
		equalButton.setForeground(Color.BLACK);
		equalButton.setBackground(Color.orange);
		equalButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(equalButton);		
		
		 clearButton=new JButton("AC");
		 clearButton.setBounds(20, 100, 80, 50);
		 clearButton.addActionListener(this);
		 clearButton.setForeground(Color.BLACK);
		 clearButton.setBackground(Color.ORANGE);
		 clearButton.setFont(new Font("Arial",Font.PLAIN,12));
		jf.add(clearButton);
		

		divButton=new JButton("÷");
		divButton.setBounds(230,100,70,50);
		divButton.addActionListener(this);
		divButton.setForeground(Color.BLACK);
		divButton.setBackground(Color.ORANGE);
		divButton.setFont(new Font("Arial",Font.PLAIN,12));
		jf.add(divButton);
		

		mulButton=new JButton("x");
		mulButton.setBounds(230, 170, 70, 50);
		mulButton.addActionListener(this);
		mulButton.setForeground(Color.BLACK);
		mulButton.setBackground(Color.ORANGE);
		mulButton.setFont(new Font("Arial",Font.PLAIN,12));
		jf.add(mulButton);
		
		

		minusButton=new JButton("-");
		minusButton.setBounds(230, 240, 70, 50);
		minusButton.addActionListener(this);
		minusButton.setForeground(Color.BLACK);
		minusButton.setBackground(Color.ORANGE);
		minusButton.setFont(new Font("Arial",Font.PLAIN,12));
		jf.add(minusButton);


		plusButton=new JButton("+");
		plusButton.setBounds(230, 310, 70, 50);
		plusButton.addActionListener(this);
		plusButton.setForeground(Color.BLACK);
		plusButton.setBackground(Color.orange);
		plusButton.setFont(new Font("Arial",Font.PLAIN,12));
		jf.add(plusButton);

		
		 backspaceButton=new JButton("DEL");
		 backspaceButton.setBounds(120, 100, 90, 50);
		 backspaceButton.addActionListener(this);
		 backspaceButton.setForeground(Color.BLACK);
		 backspaceButton.setBackground(Color.orange);
		 backspaceButton.setFont(new Font("Arial",Font.PLAIN,12));
		jf.add( backspaceButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String args[]) {
		new Calculator();	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {


		//actionOperations
		if(e.getSource() == sevenButton) {
			if(operatorClicked) {
				displatLabal.setText("7");
			operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"7");
			}
		}else if(e.getSource() == eightButton) {
			if(operatorClicked) {
				displatLabal.setText("8");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"8");
			}
		}else if(e.getSource() == nineButton) {
			if(operatorClicked) {
				displatLabal.setText("9");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"9");
			}
			
		}else if(e.getSource() == fourButton) {
			if(operatorClicked) {
				displatLabal.setText("4");
				operatorClicked = false;
			
		}else {
			displatLabal.setText(displatLabal.getText()+"4");
		}
			
		}else if(e.getSource() == fiveButton) {
			if(operatorClicked) {
				displatLabal.setText("5");
				operatorClicked = false;
		}else {
			displatLabal.setText(displatLabal.getText()+"5");
			
		}
			
		}else if(e.getSource() == sixButton) {
			if(operatorClicked) {
				displatLabal.setText("6");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"6");
			}
				
				
		}else if(e.getSource() == oneButton) {

			if(operatorClicked) {
				displatLabal.setText("1");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"1");
			}
			
		}else if(e.getSource() ==twoButton) {
			if(operatorClicked) {
				displatLabal.setText("2");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"2");
			}
				
		}else if(e.getSource() ==threeButton) {
			if(operatorClicked) {
				displatLabal.setText("3");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"3");
			}
				
		}else if(e.getSource() ==dotButton) {
			if(operatorClicked) {
				displatLabal.setText(".");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+".");
			}
		}else  if(e.getSource() == zeroButton) {
			if(operatorClicked) {
				displatLabal.setText("0");
				operatorClicked = false;
			}else {
				displatLabal.setText(displatLabal.getText()+"0");
			}
			
			operators = 1;
		}else if(e.getSource() == divButton) {
			operatorClicked = true;
			oldValue = displatLabal.getText();
			displatLabal.setText("÷");
			
			operators =2;
		}else if(e.getSource() == mulButton) {
			operatorClicked = true;
			oldValue = displatLabal.getText();
			displatLabal.setText("x");
			
			operators =3;
		}else if(e.getSource() == minusButton) {
			operatorClicked = true;
			oldValue = displatLabal.getText();
			displatLabal.setText("-");
			
			operators =4;
		}else if(e.getSource() == plusButton) {
			operatorClicked = true;
			oldValue = displatLabal.getText();
			displatLabal.setText("+");
			
			
		
			
			 
			
			//ar.setText("%");
			
			operators =6;
		}else if(e.getSource() == backspaceButton) {
			 {
				
				 displatLabal.setText(displatLabal.getText().substring(0, displatLabal.getText().length() - 1)); 
			} 	
			
				
			
			
		
			
		}else if(e.getSource() == clearButton) {
			displatLabal.setText("");
		}else if(e.getSource() == equalButton) {
			
			
			switch(operators) {
			
			
             case 6:  String newValueplus =displatLabal.getText();            
            float oldValue5 = Float.parseFloat(oldValue);
            float newValue5 = Float.parseFloat(newValueplus);
            float result5 = oldValue5+newValue5;
            displatLabal.setText(result5+"");
            break; 
            
		
            case 3:  String newValuemul = displatLabal.getText();
            float oldValue3 = Float.parseFloat(oldValue);
            float newValue3 = Float.parseFloat(newValuemul);
            float result3 = oldValue3*newValue3;
            displatLabal.setText(result3+"");
            break; 
            
		    case 2:  String newValuediv = displatLabal.getText();
            float oldValue1 = Float.parseFloat(oldValue);
            float newValue1 = Float.parseFloat(newValuediv);
            float result2 = oldValue1/newValue1;
            displatLabal.setText(result2+"");
            
            break;
         
            
            
            case 4:  String newValueminus = displatLabal.getText();
            float oldValue4 = Float.parseFloat(oldValue);
            float newValue4 = Float.parseFloat(newValueminus);
            float result4 = oldValue4-newValue4;
            displatLabal.setText(result4+"");
            break;  
            
            
            
           
            
           default: displatLabal.setText("");
            
			} 
				
				
		}	
	}

	
	}

