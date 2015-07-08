import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;                                                     
import javax.swing.JTextPane;                                                 
import javax.swing.SwingUtilities;     //��ʹ�õİ�


public class EnglishGame implements ActionListener {

	private static JFrame f = new JFrame("Ӣ�Ĵ�����Ϸ");
	private static Container con = f.getContentPane();
	JPanel mainPanel,panel0,panel1,panel2,panel3,panel4,panel5,panel6,panel7;
	JButton button1,button2,button3,button4,button,button5,button6;
	JTextPane tp1,tp2;
	FileReader fr;
	File frr;
	Date date1,date2;
	int num,len1,len2,count;
	long time;
	double rightrate;
	char[] ch;
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String cmd = e.getActionCommand();
		date1=new Date();
		if (cmd.equals("6.�˳�")) 
		{
			
				System.exit(0);
		}                                                                    
		else if(cmd.equals("����"))                                              
		{
			
		}
		else 
		{
			JFrame f1 = new JFrame("Ӣ�Ĵ�����Ϸ");
			f1.setSize(350, 750);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container con1 = f1.getContentPane();
			panel0 = new JPanel();
			panel1 = new JPanel();
			panel2 = new JPanel();
			panel3 = new JPanel();
			panel4 = new JPanel();
			panel6 = new JPanel();
			panel7 = new JPanel();
		    tp1=new JTextPane();
			tp1.setBackground(Color.pink);
			Font size=new Font("ad",Font.BOLD,20);
			tp1.setFont(size);
			tp1.setPreferredSize(new Dimension(300,300));
			tp1.setForeground(Color.white);
			tp2=new JTextPane();
			tp2.setBackground(Color.lightGray);
			tp2.setFont(size);
			tp2.setPreferredSize(new Dimension(300,300));
			try
			{
			     if (cmd.equals("1.�ı�1"))
			     {                                                            
			    	 fr=new FileReader("D:\\�ı�1.txt");                           
			    	 frr=new File("D:\\�ı�1.txt");
			    	 num=(int)frr.length();
			    	 ch=new char[num];
			    	 while(fr.read(ch)!=-1)
			    	 {
			    		 String str=new String(ch);
			    		 tp1.setText(str);
			    	 }
			     } 
			     else if (cmd.equals("2.�ı�2")) 
			     {
			    	 fr=new FileReader("D:\\�ı�2.txt");
			    	 frr=new File("D:\\�ı�2.txt");
			    	 num=(int)frr.length();
			    	 ch=new char[num];
			    	 while(fr.read(ch)!=-1)
			    	 {
			    		 String str=new String(ch);
			    		 tp1.setText(str);
			    	 }
			     }
			     else if(cmd.equals("3.�ı�3"))
			     {
			    	 fr=new FileReader("D:\\�ı�3.txt");
			    	 frr=new File("D:\\�ı�3.txt");
			    	 num=(int)frr.length();
			    	 ch=new char[num];
			    	 while(fr.read(ch)!=-1)                                       
			    	 {                                                         
			    		 String str=new String(ch);
			    		 tp1.setText(str);
			    	 }
			     }
			     else if (cmd.equals("4.�ı�4")) 
			     {
			    	 fr=new FileReader("D:\\�ı�4.txt");
			    	 frr=new File("D:\\�ı�4.txt");
			    	 num=(int)frr.length();
			    	 ch=new char[num];
			    	 while(fr.read(ch)!=-1)
			    	 {
			    		 String str=new String(ch);
			    		 tp1.setText(str);
			    	 }
			     }
			     else if(cmd.equals("5.�ı�5"))
			     {
			    	 fr=new FileReader("D:\\�ı�5.txt");
			    	 frr=new File("D:\\�ı�5.txt");
			    	 num=(int)frr.length();
			    	 ch=new char[num];
			    	 while(fr.read(ch)!=-1)                                       
			    	 {                                                         
			    		 String str=new String(ch);
			    		 tp1.setText(str);
			    	 }
			     }
			}
			catch(Exception arg)
			{
				System.out.println(arg);
			}
			button=new JButton("����");
			button.addActionListener(this);
			panel1.add(new JLabel("�ο���ϰ��"));
			panel1.add(button);
			panel2.add(tp1);
			panel3.add(new JLabel("��ϰ״����"));
			panel4.add(tp2);
			panel0.add(panel1);
			panel0.add(panel2);
			panel0.add(panel3);
			panel0.add(panel4);
			panel0.add(panel6);
			panel0.add(panel7);
			con1.add(panel0);
			f1.setVisible(true);
			tp2.requestFocus(true);
			date1=new Date();
			tp2.addKeyListener(new MyKey());
		}
	}
       private class MyKey extends KeyAdapter{                                                                   
                                                                            
		
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			len1=tp1.getText().length();
			len2=tp2.getText().length();
			if(len2==len1)
			{
				JFrame f2 = new JFrame("Ӣ�Ĵ�����Ϸ");
				f2.setSize(250, 150);
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container con2 = f2.getContentPane();
				date2=new Date();
				time=(date2.getTime()-date1.getTime())/1000;
				count=0;
				for(int i=0;i<len1;i++)
				{
					if(tp2.getText().toString().charAt(i)==tp1.getText().toString().charAt(i))
						count++;
				}
				rightrate=(double)count/len1*100;
				panel0 = new JPanel();
				panel1 = new JPanel();
				panel2 = new JPanel();
				panel3 = new JPanel();
				panel1.add(new JLabel("��ϲ��ɱ�����Ϸ���ԣ�"));
				panel2.add(new JLabel("��Ϸ�ܹ���ʱ��"+time+"��"+"ƽ�����ʣ�"+len1/time+"��/��"));            
				panel3.add(new JLabel("������ȷ��Ϊ��"+rightrate+"%"));
				panel0.add(panel1);                                             
				panel0.add(panel2);
				panel0.add(panel3);
				con2.add(panel0);
				f2.setVisible(true);
			}
			else if(len2>len1){
				System.exit(0);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f.setSize(200, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.add(new EnglishGame().creatMenu());
		f.setVisible(true);
		System.out.println("�ƿƣ���ְ��13-3 ��³Ծ 201303014083");
	}
	
	public JPanel creatMenu() {
		mainPanel = new JPanel();
		panel0 = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();                                                 
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		button1 = new JButton("1.�ı�1");                                        
		button2 = new JButton("2.�ı�2");
		button3 = new JButton("3.�ı�3");
		button4 = new JButton("4.�ı�4");
		button5 = new JButton("5.�ı�5");
		button6 = new JButton("6.�˳�");
		panel0.add(new JLabel("��ӭʹ��Ӣ�Ĵ��ֲ���ϵͳ"));
		panel1.add(new JLabel("��ѡ����Ϸ�Ѷȣ�"));
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		panel2.add(button1);
		panel3.add(button2);
		panel4.add(button3);
		panel5.add(button4);
		panel6.add(button5);
		panel7.add(button6);
		mainPanel.add(panel0);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		mainPanel.add(panel5);
		mainPanel.add(panel6);
		mainPanel.add(panel7);
		mainPanel.setVisible(true);
		return mainPanel;
	}
    }


