class Solution {
    public boolean judgeCircle(String moves) {
       char []a=moves.toCharArray();
       int up=0;
       int de=0;
       int lef=0;
       int rig=0;
       for(int i=0;i<moves.length();i++){
        if(a[i]=='U'){
            up++;

        }
        else if(a[i]=='D'){
            de++;
            
        }
        else if(a[i]=='L'){
            lef++;

        }
        else if(a[i]=='R'){
            rig++;
        }
        
       } 
       if(up==de && lef==rig){
        return true;
       }
       return false;
    }
}