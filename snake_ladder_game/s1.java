import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FDemo extends JFrame
{
   JPDemo jp;
   FDemo()
   {
   jp=new JPDemo();
   add(jp);
    }

}
class JPDemo extends JPanel
{
  JPDemo()
  {
  }
}

class s1{
 
 public static void main(String ar[])
{
 FDemo f = new FDemo();
 f.setVisible(true);
 //f.setBounds(x,y,w,h);
 f.setBounds(200,100,990,735);
 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}

}