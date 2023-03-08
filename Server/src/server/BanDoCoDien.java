
package server;

import pkginterface.BanDo;

/**
 *
 * @author logic
 */
public class BanDoCoDien implements BanDo{
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
    public void taoMoiBanDo() 
    {
        
    }
    
}
