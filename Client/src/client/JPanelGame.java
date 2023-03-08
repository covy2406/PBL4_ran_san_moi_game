
package client;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class JPanelGame extends JPanel implements Runnable
{

    private Thread thread;
    private int [][] maTran;

    public int[][] getMaTran() {
        return maTran;
    }

    public void setMaTran(int[][] maTran) {
        this.maTran = maTran;
    }
    
    public void resetMaTran( ){
        this.maTran = new int[100][70];
    }
    
    
    public JPanelGame() {
        maTran = new int[100][70];
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void paint(Graphics g){
        paintCacO(g);
    }
    
    public void paintCacO(Graphics g) // do hoa man hinh choi, vat can, ran, moi
    {    
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 70; j++){
                switch (maTran[i][j]) {
                //Nen: background
                    case 0:
                        g.setColor(Color.pink);
                        break;
                //Ran 1
                    case 1:
                        g.setColor(Color.blue);
                        break;
                //Ran 2
                    case 2:
                        g.setColor(Color.yellow);
                        break;
                //Ran 3
                    case 3:
                        g.setColor(Color.red);
                        break;
                //Ran 4
                    case 4:
                        g.setColor(Color.green);
                        break;
                //vat can
                    case 5:
                        g.setColor(Color.black); //Vat can
                        break;
                //Moi
                    case 6:
                        g.setColor(Color.white); //Moi
                        break;
                    default:
                        break;
                }
                //duoc su dung de to mau mac dinh va do rong, chieu cao da cho vao hinh
                g.fillRect(i * 8 + 1, j * 8 + 1, 8, 8);
            }
        }
    }
    
    @Override
    public void run()
    {
        while(true) 
        {
            try
            {
                repaint();//cap nhat lai component or ve lai 
                Thread.sleep(10);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(JPanelGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
