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
public class BanDo03 implements BanDo
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
        for(int i = 19; i <= 46; i++){
            for(int j = 36; j <= 44; j++){
                maTran[i][j] = 5;
            }
        }
        
        for(int i = 68; i <= 76; i++){
            for(int j = 18; j <= 44; j++){
                maTran[i][j] = 5;
            }
        }
    } 
}

