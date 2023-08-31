package connection;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class welcometoourwebsite {
	JFrame F1;
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11;
	 JTextField t1,t2,t3,t4,t5,t6;
	    JRadioButton r1,r2,r3;
	    ButtonGroup bg;
	    JCheckBox c1,c2,c3;
	    JComboBox cb,cb2;
	    String s1[]={"Select","ambala","yamuna nagar","Rewari","Panipat","Sonipat","jagadhri","Bilaspur"};
	    String s2[]={"Select","Haryana"};
	    JButton b1,b2,b3,b4,b5;
	    welcometoourwebsite()
	    {
	    	F1=new JFrame();
	        L1=new JLabel("Welcome to our Website");
	        L2=new JLabel("First Name");
	        L3=new JLabel("Last Name");
	        L4=new JLabel("E-mail");
	        L5=new JLabel("Password");
	        L6=new JLabel("Contact");
	        L7=new JLabel("Contact2");
	        L8=new JLabel("Gender");
	        L9=new JLabel("Subject");
	        L10=new JLabel("City");
	        L11=new JLabel("State");
	        t1=new JTextField();
	        t2=new JTextField();
	        t3=new JTextField();
	        t4=new JTextField();
	        t5=new JTextField();
	        t6=new JTextField();
	        r1=new JRadioButton("Male");
	        r2=new JRadioButton("Female");
	        r3=new JRadioButton("Others");
	        bg=new ButtonGroup();
	        c1=new JCheckBox("Maths");
	        c2=new JCheckBox("Science");
	        c3=new JCheckBox("Hindi");
	        cb=new JComboBox<>(s1);
	        cb2=new JComboBox<>(s2);
	        b1=new JButton("Submit");
	        b2=new JButton("Reset");
	        b3=new JButton("Update");
	        b4=new JButton("Delete");
	        b5=new JButton("logout");
	        L1.setBounds(300,10,200,30);
	        L2.setBounds(10,60,100,20);
	        L3.setBounds(390,60,100,20);
	        L4.setBounds(10,110,100,20);
	        L5.setBounds(390,110,100,20);
	        L6.setBounds(10,160,100,20);
	        L7.setBounds(390,160,100,20);
	        L8.setBounds(10,210,100,20);
	        L9.setBounds(10,250,100,20);
	        t1.setBounds(170,60,100,20);
	        t2.setBounds(520,60,100,20);
	        t3.setBounds(170,110,100,20);
	        t4.setBounds(520,110,100,20);
	        t5.setBounds(170,160,100,20);
	        t6.setBounds(520,160,100,20);
	        r1.setBounds(100,210,100,20);
	        r2.setBounds(180,210,100,20);
	        r3.setBounds(280,210,100,20);
	        c1.setBounds(100,250,100,20);
	        c2.setBounds(180,250,100,20);
	        c3.setBounds(280,250,100,20);
	        b1.setBounds(100,400,100,20);
	        b2.setBounds(250,400,100,20);
	        b3.setBounds(350,400,100,20);
	        b4.setBounds(450,400,100,20);
	        b5.setBounds(550,400,100,20);
	        L10.setBounds(10,300,100,20);
	        cb.setBounds(100,300,200,20);
	        L11.setBounds(10,340,100,20);
	        cb2.setBounds(100,340,200,20);
	        F1.add(L1);
	        F1.add(L2);
	        F1.add(L3);
	        F1.add(L4);
	        F1.add(L5);
	        F1.add(L6);
	        F1.add(L7);
	        F1.add(L8);
	        F1.add(L9);
	        F1.add(L10);
	        F1.add(L11);
	        F1.add(t1);
	        F1.add(t2);
	        F1.add(t3);
	        F1.add(t4);
	        F1.add(t5);
	        F1.add(t6);
	        F1.add(c1);
	        F1.add(c2);
	        F1.add(c3);
	        F1.add(b1);
	        F1.add(b2);
	        F1.add(b3);
	        F1.add(b4);
	        F1.add(b5);
	        F1.add(r1);
	        F1.add(r2);
	        F1.add(r3);
	        F1.add(cb);
	        F1.add(cb2);
	        bg.add(r1);
	        bg.add(r2);
	        bg.add(r3);
	        F1.setTitle("form");
	        F1.setSize(700,500);
	        F1.setLayout(null);
	        F1.setVisible(true);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        welcometoourwebsite w = new welcometoourwebsite();

	}

}

