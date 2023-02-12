public class My60th_Trapping_Rain_Water_imp {
    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        int ttw=trappedwater(height);
        System.out.println(ttw);

    }

    public static int trappedwater(int height[]){

        int n=height.length;

        //left max boundary
        int lm[]=new int[n];
        lm[0]=height[0];

        for(int i=1;i<n;i++){        
            if(lm[i-1]<height[i]){               //OR you can simply use:- lm[i]=Math.min(height[i],lm[i-1])
                lm[i]=height[i];
            }
            else{
                lm[i]=lm[i-1];
            }
        }

        //right max boundary
        int rm[]=new int[n];
        rm[n-1]=height[n-1];

        for(int j=n-2;j>=0;j--){
            if(rm[j+1]<height[j]){         ////OR you can simply use:- rm[i]=Math.min(height[i],rm[i+1])
                rm[j]=height[j];
            }else{
                rm[j]=rm[j+1];
            }
        }

        //loop
        int trappedwater=0;
        int ttw=0;
        for(int i=0;i<n;i++){
            trappedwater=Math.min(rm[i], lm[i])-height[i];

            ttw=ttw+trappedwater;    
        
        }

        return ttw;

        // trappedwater = (water level- current boundary)*width
        //addition of the water :- trappedwater1+trappedwater2+...+trappedwaterN

    }
}
