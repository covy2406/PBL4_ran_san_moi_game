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
public class BanDo01 implements BanDo
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
        for(int i = 8; i <= 91; i++){
            for(int j = 6; j <= 8; j++){
                maTran[i][j] = 5;
                maTran[i][j + 53] = 5;
            }
        }
        //i: 8->91, j:6->8;
        //lay vat can song song, tren duoi cach nhau tuong ung y: j+53
    }
}
