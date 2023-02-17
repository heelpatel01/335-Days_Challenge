//My Way But Efficient For All Problems...
//This For Only 4x4

public class My70th_2D_Array_Spiral {
    public static void main(String[] args){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);

    }
    public static void spiral(int arr[][]){
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;

        while(endrow>=startrow && endcol>=startcol){
            //top boundary
            for(int j=startrow;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            //right boundary
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom boundary
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            //leftboundary
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            //temp test
            endrow=endrow-1;
            startrow=startrow+1;
            endcol=endcol-1;
            startcol=startcol+1;
        }
    }
}
