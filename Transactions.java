

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{

JButton  deposit,withdrawl,fastcash,mini,pinchange,balance,exit;
String pinno;

Transactions(String pinno){

    this.pinno = pinno;
    setLayout(null);

 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
 Image i2 =i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
 ImageIcon i3 =new ImageIcon(i2);
 JLabel image =new JLabel(i3);
 image.setBounds(0,0,900,900);
 add(image);

deposit = new JButton("Deposit");
 deposit.setBounds(170,415,150,30);
 deposit.addActionListener(this);
 image.add(deposit);

  withdrawl= new JButton("Cash Withdrawl");
 withdrawl.setBounds(335,415,150,30);
 withdrawl.addActionListener(this);
 image.add(withdrawl);

  fastcash = new JButton("Fast Cash");
 fastcash.setBounds(170,450,150,30);
fastcash.addActionListener(this);
 image.add(fastcash);

  mini = new JButton("MiniStatement");
 mini.setBounds(335,450,150,30);
 mini.addActionListener(this);
 image.add(mini);

 pinchange = new JButton("Pin Change");
 pinchange.setBounds(170,485,150,30);
pinchange.addActionListener(this);
 image.add(pinchange);

  balance = new JButton("Balance Enquiry");
 balance.setBounds(335,485,150,30);
balance.addActionListener(this);
 image.add( balance);

  exit= new JButton("Exit");
 exit.setBounds(335,520,150,30);
 exit.addActionListener(this);
 image.add(exit);



 JLabel text = new JLabel("Please select your Transaction");
 text.setBounds(235,300,700,35);
 text.setForeground(Color.WHITE);
 text.setFont(new Font("Raleway",Font.BOLD,16));
 image.add(text);



  setSize(900,900);
  setLocation(300,0);
  setUndecorated(true);
  setVisible(true);

}


public void actionPerformed(ActionEvent ae){
   if (ae.getSource() ==exit){
    System.exit(0);
    } 
    else if (ae.getSource() == deposit) {
       setVisible(false);
       new Deposit(pinno).setVisible(true);
    }else if (ae.getSource()== withdrawl) {
       setVisible(false);
       new Withdrawl(pinno).setVisible(true);
    }else if (ae.getSource()== fastcash) {
       setVisible(false);
       new FastCash(pinno).setVisible(true);
       
    }else if (ae.getSource()== pinchange) {
       setVisible(false);
       new PinChange(pinno).setVisible(true);
       
    }else if(ae.getSource()== balance ){
       setVisible(false);
       new BalanceEnquiry(pinno).setVisible(true);
    }else if (ae.getSource() == mini) {
       new MiniStatement(pinno).setVisible(true);
    }
}


    public static void main(String[] args) {
        new Transactions("");
    }
}