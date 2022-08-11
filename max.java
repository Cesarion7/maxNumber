
class max{
 
    public static int Int(int[] i){
        int a=i[0];
        for (int j=1; j<i.length;j++){
            if (a<i[j]){
                a=i[j];    
            }
        }
        return a;    
    }

    public static float Float(float[] f){
         float a=f[0];
         for(int j=0;j<f.length;j++){
            if(a<f[j]){
               a=f[j];
            }
         }
         return a;
    }
}
