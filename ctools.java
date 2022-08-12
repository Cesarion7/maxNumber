class ctools{
     
    public static int maxValue(int[] i){
        int a=i[0];
        for (int j=1; j<i.length;j++){
            if (a<i[j]){
                a=i[j];    
            }
        }
        return a;    
    }
    
    public static float maxValue(float[] f){
         float a=f[0];
         for(int j=0;j<f.length;j++){
            if(a<f[j]){
               a=f[j];
            }
         }
         return a;
    }
    
    public static double maxValue(double[] d){
        double a=d[0];
        for(int j=1;j<d.length;j++){
            if(a<d[j]){
                a=d[j];
            }
        }
        return a;
    }
}
