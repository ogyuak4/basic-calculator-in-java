
package com.mycompany.calculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calculator {

    public static void main(String[] args) {
        JFrame f= new JFrame("aaa");
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;

        JButton btn1;
        JButton btn2;
        JButton btn3;
        JButton btn4;

        l1=new JLabel("first number: ");
        l1.setBounds(50,10,230,30);
        
        t1=new JTextField();
        t1.setBounds(50,40,230,30);
        
        l2=new JLabel("second number: ");
        l2.setBounds(50,70,230,30);
        
        t2=new JTextField();
        t2.setBounds(50,100,230,30);
        
        l3=new JLabel("result: ");
        l3.setBounds(50,130,230,30);
        
        t3=new JTextField();
        t3.setBounds(50,160,230,30);
        t3.setEditable(false);

        
        btn1=new JButton("+");
        btn1.setBounds(50,220,50,30);
        
        btn2=new JButton("-");
        btn2.setBounds(110,220,50,30);
        
        btn3=new JButton("*");
        btn3.setBounds(170,220,50,30);
        
        btn4=new JButton("/");
        btn4.setBounds(230,220,50,30);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a=Integer.parseInt(t1.getText());
               int b=Integer.parseInt(t2.getText());
               int c=a+b;
               String result=String.valueOf(c);
               t3.setText(result);
            }
        }
        );
        
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a=Integer.parseInt(t1.getText());
               int b=Integer.parseInt(t2.getText());
               int c=a-b;
               String result=String.valueOf(c);
               t3.setText(result);
            }
        }
        );
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a=Integer.parseInt(t1.getText());
               int b=Integer.parseInt(t2.getText());
               int c=a-b;
               String result=String.valueOf(c);
               t3.setText(result);
            }
        }
        );
        
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a=Integer.parseInt(t1.getText());
               int b=Integer.parseInt(t2.getText());
               int c=a*b;
               String result=String.valueOf(c);
               t3.setText(result);
            }
        }
        );
        
      
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int a=Integer.parseInt(t1.getText());
               int b=Integer.parseInt(t2.getText());
               int c=a/b;
               String result=String.valueOf(c);
               t3.setText(result);
               
               
               
                       
            }
        }
        );
  
        
        
        
        
        
        
                
                
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);   
        
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
