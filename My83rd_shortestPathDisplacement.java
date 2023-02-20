public class My83rd_shortestPathDisplacement {
    public static float shortestPath(String str){
        int y=0,x=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(str.charAt(i)=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='N'){
                y++;
            }
            else {
                y--;
            }
        }

        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args){
        String dir="WNEENESENNN";
        System.out.println(shortestPath(dir));
    }
}
