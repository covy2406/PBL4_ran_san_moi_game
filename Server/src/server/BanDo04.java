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
public class BanDo04  implements BanDo
{
    int[][] maTran = new int[100][70];
    
    @Override
    public int[][] getMaTran() {
        return maTran;
    }

    @Override
    public void setMaTran(int x, int y, int giaTri) {
        maTran[x][y] = giaTri;
    }

    @Override
    public void taoMoiBanDo() {
        for(int i = 55; i <= 99; i++)//x: 55->99
        {
            for(int j = 20; j <= 21; j++){
                maTran[i][j] = 5;
            }
        }
        
        for(int i = 47; i <= 48; i++){
            for(int j = 32; j <= 69; j++){
                maTran[i][j] = 5;
            }
        }
        //i:47->48; j:32->69
    }
}
