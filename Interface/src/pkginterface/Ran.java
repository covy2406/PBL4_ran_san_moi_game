
package pkginterface;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;


public class Ran implements Serializable
{
    private int iDRan;
    private int sTTRanTrongPhong;
    private String tenRan;
    private int doDai;
    private boolean trangThaiDangChoi;
    private ArrayList<Diem> arrayDiem;
    
    public int getsTTRanTrongPhong()
    {
        return sTTRanTrongPhong;
    }
    public  boolean isTrangThaiDangChoi()
    {
        return trangThaiDangChoi;
    }
    public void setTrangThaiDangChoi(boolean trangThaiDangChoi)
    {
        this.trangThaiDangChoi = trangThaiDangChoi;
    }
    public Ran()
    {
        arrayDiem = new ArrayList<>();
    }
    public Ran(int iDRan, int sTTRanTrongPhong, String tenRan, int doDai, ArrayList<Diem> arrayDiem)
    {
        this.iDRan = iDRan;
        this.sTTRanTrongPhong = sTTRanTrongPhong;
        this.tenRan = tenRan;
        this.doDai = doDai;
        this.arrayDiem = arrayDiem;
        this.trangThaiDangChoi = false;
    }
    
    public void setsTTRanTrongPhong(int sTTRanTrongPhong)
    {
        this.sTTRanTrongPhong = sTTRanTrongPhong;
    }
    
    public int getiDRan()
    {
        return iDRan;
    }
    public void setiDRan(int iDRan)
    {
        this.iDRan = iDRan;
        //return 0;
    }
    
    public String getTenRan()
    {
        return tenRan;
    }
    public void setTenRan(String tenRan)
    {
        this.tenRan = tenRan;
        //return null;
    }
    
    public int getDoDai()
    {
        return doDai;
    }
    public void setDoDai(int doDai)
    {
        this.doDai = doDai;
    }
    
    public ArrayList<Diem> getArrayDiem() 
    {
        return arrayDiem;
    }
    public void setArrayDiem(ArrayList<Diem> arrayDiem) 
    {
        this.arrayDiem = arrayDiem;
    }
    
    @Override
    public String toString() 
    {
        String t = "";
        t += "Ran: ";
        t += "IDRan: " + getiDRan() + " | ";
        t += "STTRan: " + getsTTRanTrongPhong()+ " | ";
        t += "TenRan: " + getTenRan()+ " |";
        t += "DoDai: " + getDoDai()+ " | ";
        t += "\n\tarryDiem:  \n";
        for(int i = 0 ; i < arrayDiem.size(); i++)
        {
            t += "\t\t\t" + arrayDiem.get(i) + "\n";
        }
        
        t += "\n";
        return t;
    }    
} 


