class Solution {
    public int maxDistance(int[] colors) {
       int a=0;
       int b=0;
      int max=0;
       for(int i=0;i<colors.length;i++){
        for(int j=i+1;j<colors.length;j++){
            if(colors[i]!=colors[j]){
                a=i;
                b=j;
                max=Math.max(max,Math.abs(a-b));

            }
            
        }
       }
       return max;
        }

    }
