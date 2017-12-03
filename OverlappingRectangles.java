import java.util.*;
import java.lang.*;
import java.io.*;

class OverlappingRectangles {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		for(int p=0;p<cases;p++){
		    String firstRectVals[] = br.readLine().split(" ");
		    String secondRectVals[] = br.readLine().split(" ");
		    
		    
		    
		    int firstRectTopX = Integer.parseInt(firstRectVals[0]);
		    int firstRectTopY = Integer.parseInt(firstRectVals[1]);
		    int firstRectBottomX = Integer.parseInt(firstRectVals[2]);
		    int firstRectBottomY = Integer.parseInt(firstRectVals[3]);
		    int secondRectTopX = Integer.parseInt(secondRectVals[0]);
		    int secondRectTopY = Integer.parseInt(secondRectVals[1]);
		    int secondRectBottomX = Integer.parseInt(secondRectVals[2]);
		    int secondRectBottomY = Integer.parseInt(secondRectVals[3]);
		
		    Rectangle r1 = new Rectangle(firstRectTopX,firstRectTopY,firstRectBottomX,firstRectBottomY);
		    Rectangle r2 = new Rectangle(secondRectTopX,secondRectTopY,secondRectBottomX,secondRectBottomY);
		
		    Rectangle leftRect,rightRect;
		    Rectangle topRect,bottomRect;
		
		    if(r1.topPointX <= r2.topPointX){
		        leftRect = r1;
		        rightRect = r2;
		    } else {
		        leftRect = r2;
		        rightRect = r1;
		    }
		    
		    if(r1.bottomPointY <= r2.bottomPointY){
		        topRect = r1;
		        bottomRect = r2;
		    } else {
		        topRect = r2;
		        bottomRect = r1;
		    }
		    //System.out.println("left rect "+leftRect);
		    //System.out.println("right rect "+rightRect);
		    
		    if(rightRect.topPointX <= leftRect.bottomPointX && 
		        bottomRect.topPointY >= topRect.bottomPointY){
		            System.out.println(1);
		        } else
		        System.out.println(0);
		}
	}
}

class Rectangle{
	    public int topPointX;
	    public int topPointY;
	    public int bottomPointX;
	    public int bottomPointY;
	    
	    public Rectangle(int topPointX,int topPointY,int bottomPointX, int bottomPointY){
	        this.topPointX = topPointX;
	        this.topPointY = topPointY;
	        this.bottomPointX = bottomPointX;
	        this.bottomPointY = bottomPointY;
	    }
	    
	    @Override
	    public String toString(){
	        return "Coordinates: "+topPointX+" "+topPointY+" "+bottomPointX+" "+bottomPointY;
	    }
	}
