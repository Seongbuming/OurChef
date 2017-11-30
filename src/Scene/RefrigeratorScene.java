package Scene;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import Main.Main;
import Scene.*;
import GUI.*;

public class RefrigeratorScene extends SceneAbst
{
   // 배경
   private ImageIcon imgBackground;
   private JLabel lblBackground;
   
   // 카트
   private JButton btnCart;
   
   //칸 패널
   JPanel linePanel1;
   JPanel linePanel2;
   JPanel linePanel3;
   JPanel linePanel4;
   JPanel linePanel5;
   JPanel linePanel6;
   //나중에 배열 고려
   
   
   //칸별 버튼
   private JButton[] btnIngredients_1;
   private JButton[] btnIngredients_2;
   private JButton[] btnIngredients_3;
   private JButton[] btnIngredients_4;
   private JButton[] btnIngredients_5;
   private JButton[] btnIngredients_6;
   
   //칸별 스크롤바
   Scrollbar bar1,bar2,bar3,bar4,bar5,bar6;
   
   // 이벤트
   private RefrigeratorListener refL;
   
   public void onShow() {
      refL = new RefrigeratorListener();
      
      // CartScene으로 넘어가는 버튼 추가
      btnCart = new ImageButton("images/cart.png", 870, 380);
      btnCart.addActionListener(refL);
      add(btnCart);
      
      //냉장고 패널
      linePanel1=new JPanel();//main이라고 가정
      linePanel1.setBounds(210,130,240,65);
      linePanel1.setBackground(Color.black);
      add(linePanel1);
      
      ScrollPane scrollPanel = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
      scrollPanel.setBounds(210, 233, 240, 65);
      scrollPanel.setBackground(Color.green);
            
      linePanel2=new JPanel();
      linePanel2.setLayout(new FlowLayout());
      linePanel2.setBackground(Color.black);
      scrollPanel.add(linePanel2);
      add(scrollPanel);
      
      //for (int i=0; i<10; i++) linePanel2.add(new JButton("test"));
      
      /*
      linePanel3=new JPanel();
      linePanel3.setBounds(210,333,240,65);
      linePanel3.setBackground(Color.black);
      add(linePanel3);
      
      linePanel4=new JPanel();
      linePanel4.setBounds(210,420,240,65);
      linePanel4.setBackground(Color.black);
      add(linePanel4);
      
      linePanel5=new JPanel();
      linePanel5.setBounds(210,520,240,65);
      linePanel5.setBackground(Color.black);
      add(linePanel5);
      
      linePanel6=new JPanel();
      linePanel6.setBounds(210,690,240,65);
      linePanel6.setBackground(Color.black);
      add(linePanel6);
      */
		
      // 배경
      imgBackground = new ImageIcon("images/refBackground.jpg");
      lblBackground = new JLabel();
      lblBackground.setIcon(imgBackground);
      lblBackground.setBounds(0, 0, 1600, 900);
      add(lblBackground);
      
      btnIngredients_1=new JButton[4];
      for(int i=0 ; i<4 ; i++) {
         btnIngredients_1[i]=new JButton("1");
         btnIngredients_1[i].setBackground(Color.white);
         btnIngredients_1[i].setPreferredSize(new Dimension(40,45));
         linePanel1.add(btnIngredients_1[i]);
      }//1라인
      
      btnIngredients_2=new JButton[9];
      for(int i=0 ; i<9 ; i++) {
         btnIngredients_2[i]=new JButton();
         btnIngredients_2[i].setPreferredSize(new Dimension(30,30));
         linePanel2.add(btnIngredients_2[i]);
      }//2라인
      /*
      for(int i=0 ; i<3 ; i++) {
         btnIngredients_3[i]=new JButton();
      }//3라인
      for(int i=0 ; i<7 ; i++) {
         btnIngredients_4[i]=new JButton();
      }//4라인
      for(int i=0 ; i<6 ; i++) {
         btnIngredients_5[i]=new JButton();
      }//5라인
      for(int i=0 ; i<7 ; i++) {
         btnIngredients_6[i]=new JButton();
      }*///6라인
   }
   
   public void onHide() {
      
   }
   
   private class RefrigeratorListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event) {
         Object obj = event.getSource();
         
         if (obj == btnCart) { // 시작 버튼 클릭
            Main.switchScene(new CartScene());
         }
      }
   }
}