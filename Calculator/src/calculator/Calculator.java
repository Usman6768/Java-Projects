
package calculator;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;



public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberBtns = new JButton[10];
    JButton[] functionBtns = new JButton[7];
    JButton addBtn, subBtn, mulBtn, divBtn;
    JButton decBtn, equBtn, clrBtn;
    JPanel panel;
    
    Font font = new Font("Arial",Font.BOLD,30);
    
    double num1=0,num2=0,result=0;
    char operator;
    
    
    public Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,550);
        frame.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(50,20,300,70);
        textField.setFont((font));
        textField.setEditable(false);
        
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        decBtn = new JButton(".");
        equBtn = new JButton("=");
        clrBtn = new JButton("Clear");
        
        
        functionBtns[0] = addBtn;
        functionBtns[1] = subBtn;
        functionBtns[2] = mulBtn;
        functionBtns[3] = divBtn;
        functionBtns[4] = decBtn;
        functionBtns[5] = equBtn;
        functionBtns[6] = clrBtn;
       
        for(int i=0; i<7;i++){
            functionBtns[i].addActionListener(this);
            functionBtns[i].setFont(font);
            functionBtns[i].setFocusable(false);
        }
        
        for(int i=0; i<10;i++){
            numberBtns[i] = new JButton(String.valueOf(i));
            numberBtns[i].addActionListener(this);
            numberBtns[i].setFont(font);
            numberBtns[i].setFocusable(false);
        }
         
 
        clrBtn.setBounds(50,440,300,50);
        
        panel = new JPanel();
        panel.setBounds(50,100,300,300); // x,y,width,height
        panel.setLayout(new GridLayout(4,4,10,10));
        
        panel.add(numberBtns[1]);
        panel.add(numberBtns[2]);
        panel.add(numberBtns[3]);
        panel.add(addBtn);
        panel.add(numberBtns[4]);
        panel.add(numberBtns[5]);
        panel.add(numberBtns[6]);
        panel.add(subBtn);
        panel.add(numberBtns[7]);
        panel.add(numberBtns[8]);
        panel.add(numberBtns[9]);
        panel.add(mulBtn);
        panel.add(decBtn);
        panel.add(numberBtns[0]);
        panel.add(equBtn);
        panel.add(divBtn);
        
        
         
        frame.add(panel);
        frame.add(clrBtn);
        frame.add(textField);
        frame.setVisible(true);
    }
        
    
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
    
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<10;i++){
            if(e.getSource() == numberBtns[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==decBtn){
            textField.setText(textField.getText().concat("."));
        }
        
        
        if(e.getSource()==addBtn){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");    
        }
        
        if(e.getSource()==subBtn){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");    
        }
        
        if(e.getSource()==mulBtn){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");    
        }
        
        if(e.getSource()==divBtn){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");    
        }
        
        if(e.getSource() == equBtn){
            num2 = Double.parseDouble(textField.getText());
        
        switch(operator){
            case'+':
                result = num1+num2;
                break;
            case'-':
                result = num1-num2;
                break;
            case'*':
                result = num1*num2;
                break;    
            case'/':
                result = num1/num2;
                break;    
        }   
        textField.setText(String.valueOf(result));
        num1=result;
        }
        if(e.getSource()==clrBtn){
            textField.setText("");    
        }
        
        
    }
    
}

        

