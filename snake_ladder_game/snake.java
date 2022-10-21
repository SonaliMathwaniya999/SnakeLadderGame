import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FDemo extends JFrame
{
   JPDemo jp;
   FDemo()
   {
	super.setTitle("Snake & Ladder");
   jp=new JPDemo();
   add(jp);
    }

}
class JPDemo extends JPanel
{  
   ImageIcon img1 ,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11;
   
   Image swt,board,s1,start;
   Image player1,player2;
   Image player11,player12;
   Image dice,dice1;
   
   JButton b1, b2, b3,b4;
   JTextField tx1,tx2,tx3;
  JPDemo()
  {
	  setBackground(Color.black);
	  
	  img1=new ImageIcon("swt.jpg");
	  img2=new ImageIcon("board.jpg");
	  img3=new ImageIcon("");
	  img4=new ImageIcon("start.jpg");
	  img5=new ImageIcon("cancel.gif");
	  img6=new ImageIcon("reset.jpg");
	  img7=new ImageIcon("start2.gif");
	  
	  img8=new ImageIcon("player1.jpg");
	  img9=new ImageIcon("player2.jpg");
	  img10=new ImageIcon("dice.mp4");
      img11=new ImageIcon("dice.png");
	  
	  swt=img1.getImage();
	  board=img2.getImage();
	  //swt=img3.getImage();
	  start=img4.getImage();
	  
	  player1=img8.getImage();
	  player2=img9.getImage();

     player11=img8.getImage();
     player12=img8.getImage();

      dice=img10.getImage();
	  dice1=img11.getImage();
	  
	  setLayout(null);
	  b1=new JButton(img5);
	  b1.setBounds(50,120,100,30);
	  add(b2);
	  b1.setBackground(new Color(4,129,255));
	  
	  Font f = new Font("calibri",Font.BOLD,30);
	  
	  tx1 =new JTextField("Start game");
	  tx1.setBounds(50,230,150,35);
	  add(tx1);
	  tx1.setBackground(Color.black);
	  tx1.setForeground(Color.green);
	  tx1.setFont(f);
	  
	  tx2 =new JTextField("player1 name");
	  tx2.setBounds(50,290,150,35);
	  add(tx2);
	  tx2.setBackground(Color.black);
	  tx2.setForeground(Color.green);
	  tx2.setFont(f);
	  
	  tx3 =new JTextField("player2 name");
	  tx3.setBounds(50,375,150,35);
	  add(tx3);
	  tx3.setBackground(Color.black);
	  tx3.setForeground(Color.green);
	  tx3.setFont(f);
	  
	   b3=new JButton("Roll");
	  b3.setBounds(50,500,100,30);
	  add(b3);
	   b3.setFont(f);
	  b3.setForeground(Color.red);
	  
	  b4=new JButton(img7);
	  b4.setBounds(50,560,150,60);
	  add(b4);
	   b4.setFont(f);
	  b4.setForeground(Color.red);
	  }
	  
	  public void paintComponent(Graphics g)
	  {
		  super.paintComponent(g);
		  g.setColor(new Color(4,129,255));
		  g.fillRect(0,0,200,735);
		  
		  g.drawImage(swt,0,0,this);		  
	      g.drawImage(board,200,0,this);
		 // g.drawImage(s1,920,0,this);
		  g.drawImage(start,20,550,this);
		  
		  g.drawImage(player1,40,620,this);
		  g.drawImage(player2,120,620,this);
		  
		  g.drawImage(player11,10,280,this);
		  g.drawImage(player12,10,360,this);
	 
          g.drawImage(dice,10,420,this);
          g.drawImage(dice1,110,430,this);		  
	  }
}

class snake{
 
 public static void main(String ar[])
{
 FDemo f = new FDemo();
 f.setVisible(true);
 //f.setBounds(x,y,w,h);
 f.setBounds(200,100,1000,1000);
 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}

}