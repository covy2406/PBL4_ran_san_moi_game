package pkginterface;

import java.io.Serializable;


public class Diem implements Serializable
{
    private int x;
    private int y;

    public Diem() 
    {
    }

    public Diem(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    public int getX() 
    {
        return x;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public int getY() //lay gia tri
    {
        return y;
    }

    public void setY(int y) //cap nhat lai gia tri
    {
        this.y = y;
    }

    @Override
    public String toString() 
    {
        return "( x: " + x + ", y:" + y + ")";
    }   
}
