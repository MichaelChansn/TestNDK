package com.ks.streamline;

public class ShortPoint {
	 private short xPoint;
     private short yPoint;

     public ShortPoint(int xPoint, int yPoint)
     {
         this.xPoint = (short)xPoint;
         this.yPoint = (short)yPoint;
     }
     public short getXPoint()
     {
         return this.xPoint;
     }
     public short getYPoint()
     {
         return this.yPoint;
     }
     public void setXPoint(short xPoint)
     {
         this.xPoint = xPoint;
     }
     public void setYPoint(short yPoint)
     {
         this.yPoint = yPoint;
     }


}
