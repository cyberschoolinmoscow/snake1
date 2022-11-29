import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    int SCREEN_WIDTH=600;
    int SCREEN_HEIGHT=600;
    int UNIT_SIZE=25;
    int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
int DELAY=75;
int[] x=new int [GAME_UNITS];
int[] y=new int[GAME_UNITS];
int bodyParts=6;
int applesEaten;
int appleX,appleY;
char direction='R';
boolean running=false;
Timer timer;
Random random;
    GamePanel(){
random=new Random();
this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
   this.setBackground(Color.BLACK);
   this.setFocusable(true);
  // this.addKeyListener(new MyKeyAdapter());
   startGame();
    }
    public void startGame(){

    }
    public void draw(Graphics g){
for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++){
    g.drawLine(i*UNIT_SIZE,0,i*UNIT_SIZE,SCREEN_HEIGHT);
    g.drawLine(0,i*UNIT_SIZE,i*UNIT_SIZE,SCREEN_HEIGHT);
}
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
