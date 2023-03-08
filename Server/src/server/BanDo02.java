/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import pkginterface.BanDo;

/**
 *
 * @author logic
 */
public class BanDo02 implements BanDo
{
    int[][] maTran = new int[100][70];
    @Override
    public int[][] getMaTran() 
    {
        return maTran;
    }

    @Override
    public void setMaTran(int x, int y, int giaTri) 
    {
        maTran[x][y] = giaTri;
    }

    @Override
    public void taoMoiBanDo() 
    {
        for(int i = 8; i <= 19; i++)
        {
            for(int j = 7; j <= 20; j++)
            {
                maTran[i][j] = 5;
            }
        }
        //i: 8->19; j:7->20
        
        for(int i = 86; i <= 89; i++)
        {
            for(int j = 58; j <= 67; j++)
            {
                maTran[i][j] = 5;
            }
        }
        //i:86->89; j:58->67
    }   
}

