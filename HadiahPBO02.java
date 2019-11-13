package hadiahpbo02;

import javax.swing.*;
import java.awt.event.*;

public abstract class HadiahPBO02 implements ActionListener {
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("hitung mundur"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,200);
        frame.getContentPane().setLayout(null);
        JButton butt=new JButton("click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20,20,200,20);
        HadiahPBO02 app = new HadiahPBO02(){};
        app.label = new JLabel("clicks =3");
        app.label.setBounds(40,40,200,20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e )
    {
        clickCount--;
        label.setText("clicks ="+clickCount);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }
    int clickCount=3;
    JLabel label;
}