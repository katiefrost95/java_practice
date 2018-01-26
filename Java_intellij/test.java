import java.awt.*;
import javax.swing.*;

class Test {


  public Test(){
    JFrame jf = new JFrame("My first window");
    JButton jb = new JButton("Press");
    JTextArea jl = new JTextArea();
    jb.setPreferredSize(new Dimension(300,100));
    jl.setPreferredSize(new Dimension(300,100));
    jf.getContentPane().setLayout(new GridLayout());
    jf.getContentPane().add(jb);
    jf.getContentPane().add(jl);
    jf.pack();
    jf.validate();
    jf.setVisible(true);
  }

  public static void main(String[] argv) {
    Test myTest = new Test();
    // String myString = argv[0];
    System.out.println(myString);
  }

}
